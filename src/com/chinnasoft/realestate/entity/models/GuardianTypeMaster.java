/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @author anand
 */
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "guardian_type_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GuardianTypeMaster.findAll", query = "SELECT g FROM GuardianTypeMaster g"),
    @NamedQuery(name = "GuardianTypeMaster.findByGuardianTypeMasterId", query = "SELECT g FROM GuardianTypeMaster g WHERE g.guardianTypeMasterId = :guardianTypeMasterId"),
    
    @NamedQuery(name = "GuardianTypeMaster.findByGuardianTypeName", query = "SELECT g FROM GuardianTypeMaster g WHERE g.guardianTypeName = :guardianTypeName"),
    @NamedQuery(name = "GuardianTypeMaster.findByGuardianTypeFullName", query = "SELECT g FROM GuardianTypeMaster g WHERE g.guardianTypeFullName = :guardianTypeFullName")})
public class GuardianTypeMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "guardian_type_master_id")
    private Integer guardianTypeMasterId;
    @Basic(optional = false)
    @Column(name = "guardian_type_name")
    private String guardianTypeName;
    
    
    @Basic(optional = false)
    @Column(name = "guardian_type_full_name")
    private String guardianTypeFullName;
    
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;

    public GuardianTypeMaster() {
    }

    public GuardianTypeMaster(Integer guardianTypeMasterId) {
        this.guardianTypeMasterId = guardianTypeMasterId;
    }

    public GuardianTypeMaster(Integer guardianTypeMasterId, String guardianTypeName, String guardianTypeFullName) {
        this.guardianTypeMasterId = guardianTypeMasterId;
        this.guardianTypeName = guardianTypeName;
        this.guardianTypeFullName = guardianTypeFullName;
    }

    public Integer getGuardianTypeMasterId() {
        return guardianTypeMasterId;
    }

    public void setGuardianTypeMasterId(Integer guardianTypeMasterId) {
        this.guardianTypeMasterId = guardianTypeMasterId;
    }

    public String getGuardianTypeName() {
        return guardianTypeName;
    }

    public void setGuardianTypeName(String guardianTypeName) {
        this.guardianTypeName = guardianTypeName;
    }
    
    
    public String getGuardianTypeFullName() {
        return guardianTypeFullName;
    }

    public void setGuardianTypeFullName(String guardianTypeFullName) {
        this.guardianTypeFullName = guardianTypeFullName;
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
        hash += (guardianTypeMasterId != null ? guardianTypeMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GuardianTypeMaster)) {
            return false;
        }
        GuardianTypeMaster other = (GuardianTypeMaster) object;
        if ((this.guardianTypeMasterId == null && other.guardianTypeMasterId != null) || (this.guardianTypeMasterId != null && !this.guardianTypeMasterId.equals(other.guardianTypeMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.GuardianTypeMaster[ guardianTypeMasterId=" + guardianTypeMasterId + " ]";
    }
    
}
