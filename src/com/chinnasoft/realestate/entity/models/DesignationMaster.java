/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author anand
 */
@Entity
@Table(name = "designation_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DesignationMaster.findAll", query = "SELECT d FROM DesignationMaster d"),
    @NamedQuery(name = "DesignationMaster.findByDesignationId", query = "SELECT d FROM DesignationMaster d WHERE d.designationId = :designationId"),
    @NamedQuery(name = "DesignationMaster.findByDesignationName", query = "SELECT d FROM DesignationMaster d WHERE d.designationName = :designationName"),
    @NamedQuery(name = "DesignationMaster.findByLastUpdated", query = "SELECT d FROM DesignationMaster d WHERE d.lastUpdated = :lastUpdated")})
@JsonIgnoreProperties(value={"userId", "hospitalId", "empOfficeInfoList"})
public class DesignationMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "designation_id")
    private Integer designationId;
    @Basic(optional = false)
    @Column(name = "designation_name")
    private String designationName;
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
    @ManyToOne(optional = false)
    private HospitalMaster hospitalId;
    @JoinColumn(name = "designation_category_id", referencedColumnName = "designation_category_id")
    @ManyToOne(optional = false)
    private DesignationCategoryMaster designationCategoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "designationId")
    private List<EmpOfficeInfo> empOfficeInfoList;

    public DesignationMaster() {
    }

    public DesignationMaster(Integer designationId) {
        this.designationId = designationId;
    }

    public DesignationMaster(Integer designationId, String designationName) {
        this.designationId = designationId;
        this.designationName = designationName;
    }

    public Integer getDesignationId() {
        return designationId;
    }

    public void setDesignationId(Integer designationId) {
        this.designationId = designationId;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LoginMaster getUserId() {
        return userId;
    }

    public void setUserId(LoginMaster userId) {
        this.userId = userId;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    public HospitalMaster getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(HospitalMaster hospitalId) {
        this.hospitalId = hospitalId;
    }

    public DesignationCategoryMaster getDesignationCategoryId() {
        return designationCategoryId;
    }

    public void setDesignationCategoryId(DesignationCategoryMaster designationCategoryId) {
        this.designationCategoryId = designationCategoryId;
    }

    @XmlTransient
    public List<EmpOfficeInfo> getEmpOfficeInfoList() {
        return empOfficeInfoList;
    }

    public void setEmpOfficeInfoList(List<EmpOfficeInfo> empOfficeInfoList) {
        this.empOfficeInfoList = empOfficeInfoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (designationId != null ? designationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DesignationMaster)) {
            return false;
        }
        DesignationMaster other = (DesignationMaster) object;
        if ((this.designationId == null && other.designationId != null) || (this.designationId != null && !this.designationId.equals(other.designationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.DesignationMaster[ designationId=" + designationId + " ]";
    }
    
}
