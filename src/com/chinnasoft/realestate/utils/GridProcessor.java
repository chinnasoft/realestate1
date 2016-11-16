package com.chinnasoft.realestate.utils;
/**
 *    File       :   GridProcessor.java
 *    Package    :   com.ariel.hmserp.utils
 *    Created    :   Jan 31, 2014  9:26:07 AM
 *    Project    :   Hospital Management System ERP
 *    Author     :   babu
 *    Company    :   Ariel Technologies PVT LTD.
 **//*

package com.ariel.hmserp.utils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.transform.ResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component("gridProcessor")
public class GridProcessor {

	@Autowired
	ObjectMapper jsonMapper;

	// add Criteria for String value Comparison based on mode

	public static Criterion getLikeExpression(String field, String value,
			MatchMode mode, boolean ignoreCase) {
		SimpleExpression expression = Restrictions.like(field, value, mode);

		if (ignoreCase == true) {
			expression = expression.ignoreCase();
		}

		return expression;
	}

	// Diclare given Object is Number Or Not
	
	public static boolean isNumaric(Object value) {
		boolean result = false;

		if (isInteger(value) || isDouble(value) || isLong(value)
				|| isFloat(value)) {
			result = true;
		}

		return result;
	}

	public static boolean isInteger(Object value) {
		boolean result = false;
		try {
			int val = Integer.parseInt(value.toString());
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
			result = false;
		}

		return result;
	}

	public static boolean isDouble(Object value) {
		boolean result = false;
		try {
			double val = Double.parseDouble(value.toString());
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
			result = false;
		}

		return result;
	} 

	public static boolean isLong(Object value) {
		boolean result = false;
		try {
			long val = Long.parseLong(value.toString());
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
			result = false;
		}

		return result;
	}

	public static boolean isFloat(Object value) {
		boolean result = false;
		try {
			float val = Float.parseFloat(value.toString());
			result = true;
		} catch (Exception e) {
			// TODO: handle exception
			result = false;
		}

		return result;
	}

	// convert the grid search format to Hibernate Criteria Format
	public void restrict(Junction junction, FilterDescriptor filter,
			Class<?> clazz) {
		String operator = filter.getOperator();
		String field = filter.getField();
		Object value = filter.getValue();
		boolean ignoreCase = filter.isIgnoreCase();

		try {
			Class<?> type = new PropertyDescriptor(field, clazz)
					.getPropertyType();
			if (type == double.class || type == Double.class) {
				value = Double.parseDouble(value.toString());
			} else if (type == float.class || type == Float.class) {
				value = Float.parseFloat(value.toString());
			} else if (type == long.class || type == Long.class) {
				value = Long.parseLong(value.toString());
			} else if (type == int.class || type == Integer.class) {
				value = Integer.parseInt(value.toString());
			} else if (type == short.class || type == Short.class) {
				value = Short.parseShort(value.toString());
			} else if (type == boolean.class || type == Boolean.class) {
				value = Boolean.parseBoolean(value.toString());
			} else if (type == Date.class) {
				SimpleDateFormat df = new SimpleDateFormat(
						"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
				String input = value.toString();
				value = UtilityDateHelper.stringtoLocalDate(input);
			} else {
				// for Sub Entity

				value = jsonMapper.convertValue(value, type);

			}
		} catch (Exception e) {
		} 

		if ("eq".equalsIgnoreCase(operator)) {

			if (value instanceof String) {
				junction.add(Restrictions.ilike(field, value.toString(),
						MatchMode.EXACT));
			} else {

				junction.add(Restrictions.eq(field, value));
			}

		} else if ("neq".equalsIgnoreCase(operator)) {

			if (value instanceof String) {
				junction.add(Restrictions.not(Restrictions.ilike(field,
						value.toString(), MatchMode.EXACT)));
			} else {
				junction.add(Restrictions.ne(field, value));
			}

		} else if ("gt".equalsIgnoreCase(operator)) {

			junction.add(Restrictions.gt(field, value));

		} else if ("gte".equalsIgnoreCase(operator)) {

			junction.add(Restrictions.ge(field, value));

		} else if ("lt".equalsIgnoreCase(operator)) {

			junction.add(Restrictions.lt(field, value));

		} else if ("lte".equalsIgnoreCase(operator)) {

			junction.add(Restrictions.le(field, value));

		} else if ("startswith".equalsIgnoreCase(operator)) {

			junction.add(getLikeExpression(field, value.toString(),
					MatchMode.START, ignoreCase));

		} else if ("endswith".equalsIgnoreCase(operator)) {

			junction.add(getLikeExpression(field, value.toString(),
					MatchMode.END, ignoreCase));

		} else if ("contains".equalsIgnoreCase(operator)) {

			junction.add(getLikeExpression(field, value.toString(),
					MatchMode.ANYWHERE, ignoreCase));

		} else if ("doesnotcontain".equalsIgnoreCase(operator)) {

			junction.add(Restrictions.not(Restrictions.ilike(field,
					value.toString(), MatchMode.ANYWHERE)));

		}

	}

	// filter snippet
	public Criteria filter(Criteria criteria, FilterDescriptor filter,
			Class<?> clazz) {
		if (filter != null) {
			List<FilterDescriptor> filters = filter.getFilters();

			if (!filters.isEmpty()) {
				Junction junction = Restrictions.conjunction();

				if (!filter.getFilters().isEmpty()
						&& filter.getLogic().toString().equals("or")) {
					junction = Restrictions.disjunction();
				}

				for (FilterDescriptor entry : filters) {
					if (!entry.getFilters().isEmpty()) {
						filter(criteria, entry, clazz);
					} else {
						restrict(junction, entry, clazz);
					}
				}

				criteria.add(junction);
			}
		}

		return criteria;
	}

	// Sorting snippet
	public Criteria sort(Criteria criteria, List<SortDescriptor> sort) {
		if (sort != null && !sort.isEmpty()) {
			for (SortDescriptor entry : sort) {
				String field = entry.getField();
				String dir = entry.getDir();

				if (dir.equals("asc")) {
					criteria.addOrder(Order.asc(field));
				} else if (dir.equals("desc")) {
					criteria.addOrder(Order.desc(field));
				}
			}
		}

		return criteria;
	}

	// Total snippet
	public int total(Criteria criteria) {
		String total = criteria.setProjection(Projections.rowCount())
				.uniqueResult().toString();

		criteria.setProjection(null);
		criteria.setResultTransformer(Criteria.ROOT_ENTITY);

		return Integer.parseInt(total);
	}

	// pagination snippet
	public Criteria page(Criteria criteria, int take, int skip) {
		criteria.setMaxResults(take);
		criteria.setFirstResult(skip);
		return criteria;
	}
	
	
	
	// For Aggregate Functions
	
	private static ProjectionList createAggregatesProjection(List<AggregateDescriptor> aggregates) {
        ProjectionList projections = Projections.projectionList();
        for (AggregateDescriptor aggregate : aggregates) {
            String alias = aggregate.getField() + "_" + aggregate.getAggregate();
            if (aggregate.getAggregate().equals("count")) {                
                projections.add(Projections.count(aggregate.getField()), alias);                
            } else if (aggregate.getAggregate().equals("sum")) {
                projections.add(Projections.sum(aggregate.getField()), alias);                
            } else if (aggregate.getAggregate().equals("average")) {
                projections.add(Projections.avg(aggregate.getField()), alias);                
            } else if (aggregate.getAggregate().equals("min")) {
                projections.add(Projections.min(aggregate.getField()), alias);                
            } else if (aggregate.getAggregate().equals("max")) {
                projections.add(Projections.max(aggregate.getField()), alias);                
            }
        }
        return projections;
    }
	
	
	@SuppressWarnings({ "unchecked", "serial" })
	private static Map<String, Object> calculateAggregates(Criteria criteria, List<AggregateDescriptor> aggregates) {
        return (Map<String, Object>)criteria                    
                .setProjection(createAggregatesProjection(aggregates))                    
                .setResultTransformer(new ResultTransformer() {                                    
                    @Override
                    public Object transformTuple(Object[] value, String[] aliases) {                            
                        Map<String, Object> result = new HashMap<String, Object>();
                        
                        for (int i = 0; i < aliases.length; i++) {                                
                            String alias = aliases[i];
                            Map<String, Object> aggregate;
                            
                            String name = alias.split("_")[0];
                            if (result.containsKey(name)) {
                                ((Map<String, Object>)result.get(name)).put(alias.split("_")[1], value[i]);
                            } else {
                                aggregate = new HashMap<String, Object>();                                    
                                aggregate.put(alias.split("_")[1], value[i]);        
                                result.put(name, aggregate);
                            }
                        } 
                        
                        return result;
                    }
                    
                    @SuppressWarnings("rawtypes")
                    @Override
                    public List transformList(List collection) {
                        return collection;
                    }
                })
                .list()
                .get(0);
    }
	
	
	public  Map<String, Object> aggregate(Criteria criteria, List<AggregateDescriptor> aggregates, FilterDescriptor filters,  Class<?> clazz) {
        //Criteria criteria = session.createCriteria(clazz);
        
        criteria = filter(criteria, filters, clazz);
        
        return calculateAggregates(criteria, aggregates);                
    }
	

	// for HQL Pattern Start

	// convert the grid search format to Hibernate HQL Format
	public StringBuffer restrictHQL(StringBuffer query, FilterDescriptor filter) {
		String operator = filter.getOperator();
		String field = filter.getField();
		String value = filter.getValue().toString();
		//boolean ignoreCase = filter.isIgnoreCase();

		if ("eq".equalsIgnoreCase(operator)) {

			query.append(field + " = '" + value + "'");

		} else if ("neq".equalsIgnoreCase(operator)) {

			query.append(field + " != '" + value + "'");

		} else if ("gt".equalsIgnoreCase(operator)) {

			query.append(field + " > " + Integer.valueOf(value));

		} else if ("gte".equalsIgnoreCase(operator)) {

			query.append(field + " >= " + Integer.valueOf(value));

		} else if ("lt".equalsIgnoreCase(operator)) {

			query.append(field + " < " + Integer.valueOf(value));

		} else if ("lte".equalsIgnoreCase(operator)) {

			query.append(field + " <= " + Integer.valueOf(value));

		} else if ("startswith".equalsIgnoreCase(operator)) {

			query.append(field + " like '" + value + "%'");

		} else if ("endswith".equalsIgnoreCase(operator)) {

			query.append(field + " like '%" + value + "'");

		} else if ("contains".equalsIgnoreCase(operator)) {

			query.append(field + " like '%" + value + "%'");

		} else if ("doesnotcontain".equalsIgnoreCase(operator)) {

			query.append(field + " not like '%" + value + "%'");

		}

		return query;

	}

	// filter snippet HQL
	public StringBuffer filterHQL(StringBuffer query, FilterDescriptor filter) {
		if (filter != null) {
			List<FilterDescriptor> filters = filter.getFilters();

			if (!filters.isEmpty()) {

				String logic = "and";

				if (!filter.getFilters().isEmpty()
						&& filter.getLogic().toString().equals("or")) {
					logic = "or";

					if (StringUtils.containsIgnoreCase(query.toString(),
							" where ")) {
						query.append(" and ( ");
					} else {
						query.append(" where (");
					}

				} else {
					if (StringUtils.containsIgnoreCase(query.toString(),
							" where ")) {
						query.append(" and  ");
					} else {
						query.append(" where ");
					}
				}

				int count = 0;

				for (FilterDescriptor entry : filters) {
                    if (!entry.getFilters().isEmpty()) {
                    	if (query.toString().trim().endsWith(" and")) {
							query.replace(0, query.length(), query.substring(0, query.lastIndexOf("and")));
						}
                    	filterHQL(query, entry);
					}
                    else if (count > 0) {
						query.append(" " + logic + " ");
						query = restrictHQL(query, entry);
					} else {
						query = restrictHQL(query, entry);
					}
					count++;
				}

				if (filter.getLogic().toString().equals("or")) {

					query.append(" ) ");

				}

			}
		}

		return query;
	}

	// Sorting snippet for HQL
	public StringBuffer sortHQL(StringBuffer query, List<SortDescriptor> sort) {

		int count = 0;
		if (sort != null && !sort.isEmpty()) {
			if (StringUtils.containsIgnoreCase(query.toString(), " order by ")) {
				query.append(" , ");
			} else {
				query.append(" order by ");
			}

			for (SortDescriptor entry : sort) {
				String field = entry.getField();
				String dir = entry.getDir();

				if (count > 0) {
					query.append(" , " + field + " " + dir);
				} else {
					query.append(" " + field + " " + dir);
				}
			}
		}

		return query;
	}

	// Total snippet
	public int totalHQL(StringBuffer query, Session session) {
		String total = session
				.createQuery("select count(*) " + query.toString()).list()
				.get(0).toString();
		session.clear();
		return Integer.parseInt(total);
	}

	// for HQL Pattern End

}
*/