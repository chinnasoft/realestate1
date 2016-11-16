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
@Table(name = "designation_category_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DesignationCategoryMaster.findAll", query = "SELECT d FROM DesignationCategoryMaster d"),
    @NamedQuery(name = "DesignationCategoryMaster.findByDesignationCategoryId", query = "SELECT d FROM DesignationCategoryMaster d WHERE d.designationCategoryId = :designationCategoryId"),
    @NamedQuery(name = "DesignationCategoryMaster.findByDesignationCategoryName", query = "SELECT d FROM DesignationCategoryMaster d WHERE d.designationCategoryName = :designationCategoryName"),
    @NamedQuery(name = "DesignationCategoryMaster.findByLastUpdated", query = "SELECT d FROM DesignationCategoryMaster d WHERE d.lastUpdated = :lastUpdated")})

public class DesignationCategoryMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "designation_category_id")
    private Integer designationCategoryId;
    @Basic(optional = false)
    @Column(name = "designation_category_name")
    private String designationCategoryName;
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
   

    public DesignationCategoryMaster() {
    }

    public DesignationCategoryMaster(Integer designationCategoryId) {
        this.designationCategoryId = designationCategoryId;
    }

    public DesignationCategoryMaster(Integer designationCategoryId, String designationCategoryName, Date lastUpdated) {
        this.designationCategoryId = designationCategoryId;
        this.designationCategoryName = designationCategoryName;
        this.lastUpdated = lastUpdated;

    }

    public Integer getDesignationCategoryId() {
        return designationCategoryId;
    }

    public void setDesignationCategoryId(Integer designationCategoryId) {
        this.designationCategoryId = designationCategoryId;
    }

    public String getDesignationCategoryName() {
        return designationCategoryName;
    }

    public void setDesignationCategoryName(String designationCategoryName) {
        this.designationCategoryName = designationCategoryName;
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
        hash += (designationCategoryId != null ? designationCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DesignationCategoryMaster)) {
            return false;
        }
        DesignationCategoryMaster other = (DesignationCategoryMaster) object;
        if ((this.designationCategoryId == null && other.designationCategoryId != null) || (this.designationCategoryId != null && !this.designationCategoryId.equals(other.designationCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.DesignationCategoryMaster[ designationCategoryId=" + designationCategoryId + " ]";
    }
    
}
