/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bargunan
 */
@Entity
@Table(name = "emp_type_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpTypeMaster.findAll", query = "SELECT e FROM EmpTypeMaster e"),
    @NamedQuery(name = "EmpTypeMaster.findByEmpTypeId", query = "SELECT e FROM EmpTypeMaster e WHERE e.empTypeId = :empTypeId"),
    @NamedQuery(name = "EmpTypeMaster.findByEmpTypeDesc", query = "SELECT e FROM EmpTypeMaster e WHERE e.empTypeDesc = :empTypeDesc"),
    @NamedQuery(name = "EmpTypeMaster.findByLastUpdated", query = "SELECT e FROM EmpTypeMaster e WHERE e.lastUpdated = :lastUpdated")})
public class EmpTypeMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_type_id")
    private Integer empTypeId;
    @Basic(optional = false)
    @Column(name = "emp_type_desc")
    private String empTypeDesc;
    @Basic(optional = false)
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

    public EmpTypeMaster() {
    }

    public EmpTypeMaster(Integer empTypeId) {
        this.empTypeId = empTypeId;
    }

    public EmpTypeMaster(Integer empTypeId, String empTypeDesc, Date lastUpdated, String isEditable) {
        this.empTypeId = empTypeId;
        this.empTypeDesc = empTypeDesc;
        this.lastUpdated = lastUpdated;
    }

    public Integer getEmpTypeId() {
        return empTypeId;
    }

    public void setEmpTypeId(Integer empTypeId) {
        this.empTypeId = empTypeId;
    }

    public String getEmpTypeDesc() {
        return empTypeDesc;
    }

    public void setEmpTypeDesc(String empTypeDesc) {
        this.empTypeDesc = empTypeDesc;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empTypeId != null ? empTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpTypeMaster)) {
            return false;
        }
        EmpTypeMaster other = (EmpTypeMaster) object;
        if ((this.empTypeId == null && other.empTypeId != null) || (this.empTypeId != null && !this.empTypeId.equals(other.empTypeId))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.EmpTypeMaster[ empTypeId=" + empTypeId + " ]";
    }
    
}
