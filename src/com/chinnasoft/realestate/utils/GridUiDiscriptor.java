/**
 *    File       :   GridUiDiscriptor.java
 *    Package    :   com.ariel.hmserp.utils
 *    Created    :   Jan 31, 2014  9:27:56 AM
 *    Project    :   Hospital Management System ERP
 *    Author     :   babu
 *    Company    :   Ariel Technologies PVT LTD.
 **/

package com.chinnasoft.realestate.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("gridDiscriptor")
public class GridUiDiscriptor {

	private int page;
	private int pageSize;
	private int take;
	private int skip;
	private int total;
	private String compare;
	private List<SortDescriptor> sort;
	private List<AggregateDescriptor> aggregate;
	private List<Object> data;
	private List<Object> models;
	private Map<Object, Object> erros;
	private Map<String, Object> aggregates;
	private FilterDescriptor filter;
	private Integer invoiceId;
	private String customername;
	private Date fromdate;
	private Date todate;

	public GridUiDiscriptor() {
		filter = new FilterDescriptor();
		data = new ArrayList<Object>();
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTake() {
		return take;
	}

	public void setTake(int take) {
		this.take = take;
	}

	public int getSkip() {
		return skip;
	}

	public void setSkip(int skip) {
		this.skip = skip;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<SortDescriptor> getSort() {
		return sort;
	}

	public void setSort(List<SortDescriptor> sort) {
		this.sort = sort;
	}

	public List<AggregateDescriptor> getAggregate() {
		return aggregate;
	}

	public void setAggregate(List<AggregateDescriptor> aggregate) {
		this.aggregate = aggregate;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public List<Object> getModels() {
		return models;
	}

	public void setModels(List<Object> models) {
		this.models = models;
	}

	public String getCompare() {
		return compare;
	}

	public void setCompare(String compare) {
		this.compare = compare;
	}

	public Map<Object, Object> getErros() {
		return erros;
	}

	public void setErros(Map<Object, Object> erros) {
		this.erros = erros;
	}

	public Map<String, Object> getAggregates() {
		return aggregates;
	}

	public void setAggregates(Map<String, Object> aggregates) {
		this.aggregates = aggregates;
	}

	public FilterDescriptor getFilter() {
		return filter;
	}

	public void setFilter(FilterDescriptor filter) {
		this.filter = filter;
	}

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

}
