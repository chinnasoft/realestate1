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
import javax.persistence.CascadeType;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author chinnaiah M
 */
@Entity
@Table(name = "emp_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpInfo.findAll", query = "SELECT e FROM EmpInfo e"),
    @NamedQuery(name = "EmpInfo.findByEmpId", query = "SELECT e FROM EmpInfo e WHERE e.empId = :empId"),
    @NamedQuery(name = "EmpInfo.findByEmpPrefixId", query = "SELECT e FROM EmpInfo e WHERE e.empPrefixId = :empPrefixId"),
    @NamedQuery(name = "EmpInfo.findByLastUpdated", query = "SELECT e FROM EmpInfo e WHERE e.lastUpdated = :lastUpdated")})
/*@JsonIgnoreProperties(value={
		""

})*/
public class EmpInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_id")
    private Integer empId;
    @Basic(optional = false)
    @Column(name = "emp_prefix_id")
    private String empPrefixId;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @JoinColumn(name = "personal_id", referencedColumnName = "personal_id")
    @ManyToOne(optional = false)
    private EmpPersonalInfo personalId;
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
    @ManyToOne(optional = false)
    private HospitalMaster hospitalId;
    
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    public EmpInfo() {
    }

    public EmpInfo(Integer empId) {
        this.empId = empId;
    }

    public EmpInfo(Integer empId, String empPrefixId, Date lastUpdated) {
        this.empId = empId;
        this.empPrefixId = empPrefixId;
        this.lastUpdated = lastUpdated;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpPrefixId() {
        return empPrefixId;
    }

    public void setEmpPrefixId(String empPrefixId) {
        this.empPrefixId = empPrefixId;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public EmpPersonalInfo getPersonalId() {
        return personalId;
    }

    public void setPersonalId(EmpPersonalInfo personalId) {
        this.personalId = personalId;
    }
    public HospitalMaster getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(HospitalMaster hospitalId) {
        this.hospitalId = hospitalId;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpInfo)) {
            return false;
        }
        EmpInfo other = (EmpInfo) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.EmpInfo[ empId=" + empId + " ]";
    }
    
}
