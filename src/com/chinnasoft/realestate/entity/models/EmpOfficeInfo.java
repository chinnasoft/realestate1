/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author chinnaiah
 */
@Entity
@Table(name = "emp_office_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpOfficeInfo.findAll", query = "SELECT e FROM EmpOfficeInfo e"),
    @NamedQuery(name = "EmpOfficeInfo.findByEmpOfficialId", query = "SELECT e FROM EmpOfficeInfo e WHERE e.empOfficialId = :empOfficialId"),
    @NamedQuery(name = "EmpOfficeInfo.findByEmpQualify", query = "SELECT e FROM EmpOfficeInfo e WHERE e.empQualify = :empQualify"),
    @NamedQuery(name = "EmpOfficeInfo.findByEmpDoj", query = "SELECT e FROM EmpOfficeInfo e WHERE e.empDoj = :empDoj"),
    @NamedQuery(name = "EmpOfficeInfo.findByLastUpdated", query = "SELECT e FROM EmpOfficeInfo e WHERE e.lastUpdated = :lastUpdated")})


@JsonIgnoreProperties(value={"checkPaymentCollection"})
public class EmpOfficeInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_official_id")
    private Integer empOfficialId;
    @Basic(optional = false)
    @Column(name = "emp_qualify")
    private String empQualify;
    @Basic(optional = false)
    @Column(name = "emp_doj")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date empDoj;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "emp_type_id", referencedColumnName = "emp_type_id")
    @ManyToOne(optional = false)
    private EmpTypeMaster empTypeId;
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
    @OneToOne(optional = false)
    private EmpInfo empId;
    @JoinColumn(name = "designation_id", referencedColumnName = "designation_id")
    @ManyToOne(optional = false)
    private DesignationMaster designationId;
    @JoinColumn(name = "designation_category_id", referencedColumnName = "designation_category_id")
    @ManyToOne(optional = false)
    private DesignationCategoryMaster designationCategoryId;
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
    @ManyToOne(optional = false)
    private DepartmentMaster deptId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
  
    public EmpOfficeInfo() {
    }

    public EmpOfficeInfo(Integer empOfficialId) {
        this.empOfficialId = empOfficialId;
    }

    public EmpOfficeInfo(Integer empOfficialId, String empQualify, Date empDoj, Date lastUpdated) {
        this.empOfficialId = empOfficialId;
        this.empQualify = empQualify;
        this.empDoj = empDoj;
        this.lastUpdated = lastUpdated;
    }

    public Integer getEmpOfficialId() {
        return empOfficialId;
    }

    public void setEmpOfficialId(Integer empOfficialId) {
        this.empOfficialId = empOfficialId;
    }

    public String getEmpQualify() {
        return empQualify;
    }

    public void setEmpQualify(String empQualify) {
        this.empQualify = empQualify;
    }

    public Date getEmpDoj() {
        return empDoj;
    }

    public void setEmpDoj(Date empDoj) {
        this.empDoj = empDoj;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    public EmpTypeMaster getEmpTypeId() {
        return empTypeId;
    }

    public void setEmpTypeId(EmpTypeMaster empTypeId) {
        this.empTypeId = empTypeId;
    }

    public EmpInfo getEmpId() {
        return empId;
    }

    public void setEmpId(EmpInfo empId) {
        this.empId = empId;
    }

    public DesignationMaster getDesignationId() {
        return designationId;
    }

    public void setDesignationId(DesignationMaster designationId) {
        this.designationId = designationId;
    }

    public DesignationCategoryMaster getDesignationCategoryId() {
        return designationCategoryId;
    }

    public void setDesignationCategoryId(DesignationCategoryMaster designationCategoryId) {
        this.designationCategoryId = designationCategoryId;
    }

    public DepartmentMaster getDeptId() {
        return deptId;
    }

    public void setDeptId(DepartmentMaster deptId) {
        this.deptId = deptId;
    }

    public LoginMaster getUserId() {
        return userId;
    }

    public void setUserId(LoginMaster userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empOfficialId != null ? empOfficialId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpOfficeInfo)) {
            return false;
        }
        EmpOfficeInfo other = (EmpOfficeInfo) object;
        if ((this.empOfficialId == null && other.empOfficialId != null) || (this.empOfficialId != null && !this.empOfficialId.equals(other.empOfficialId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.EmpOfficeInfo[ empOfficialId=" + empOfficialId + " ]";
    }
    
}
