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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author chinnaiah
 */
@Entity
@Table(name = "department_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DepartmentMaster.findAll", query = "SELECT d FROM DepartmentMaster d"),
    @NamedQuery(name = "DepartmentMaster.findByDeptId", query = "SELECT d FROM DepartmentMaster d WHERE d.deptId = :deptId"),
    @NamedQuery(name = "DepartmentMaster.findByDeptLongName", query = "SELECT d FROM DepartmentMaster d WHERE d.deptLongName = :deptLongName"),
    @NamedQuery(name = "DepartmentMaster.findByDeptShortName", query = "SELECT d FROM DepartmentMaster d WHERE d.deptShortName = :deptShortName"),
    @NamedQuery(name = "DepartmentMaster.findByLastUpdated", query = "SELECT d FROM DepartmentMaster d WHERE d.lastUpdated = :lastUpdated")})
public class DepartmentMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "dept_id")
    private Integer deptId;
    @Basic(optional = false)
    @Column(name = "dept_long_name")
    private String deptLongName;
    @Column(name = "dept_short_name")
    private String deptShortName;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "deapt_status_id", referencedColumnName = "depart_status_id")
    @ManyToOne(optional = false)
    private DepartmentStatus deaptStatusId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
    @ManyToOne(optional = false)
    private HospitalMaster hospitalId;

    public DepartmentMaster() {
    }

    public DepartmentMaster(Integer deptId) {
        this.deptId = deptId;
    }

    public DepartmentMaster(Integer deptId, String deptLongName, Date lastUpdated) {
        this.deptId = deptId;
        this.deptLongName = deptLongName;
        this.lastUpdated = lastUpdated;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptLongName() {
        return deptLongName;
    }

    public void setDeptLongName(String deptLongName) {
        this.deptLongName = deptLongName;
    }

    public String getDeptShortName() {
        return deptShortName;
    }

    public void setDeptShortName(String deptShortName) {
        this.deptShortName = deptShortName;
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

    public DepartmentStatus getDeaptStatusId() {
        return deaptStatusId;
    }

    public void setDeaptStatusId(DepartmentStatus deaptStatusId) {
        this.deaptStatusId = deaptStatusId;
    }

    public LoginMaster getUserId() {
        return userId;
    }

    public void setUserId(LoginMaster userId) {
        this.userId = userId;
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
        hash += (deptId != null ? deptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartmentMaster)) {
            return false;
        }
        DepartmentMaster other = (DepartmentMaster) object;
        if ((this.deptId == null && other.deptId != null) || (this.deptId != null && !this.deptId.equals(other.deptId))) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.DepartmentMaster[ deptId=" + deptId + " ]";
    }
    
}
