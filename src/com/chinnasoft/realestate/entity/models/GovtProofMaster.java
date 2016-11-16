/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author babu
 */
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "govt_proof_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GovtProofMaster.findAll", query = "SELECT g FROM GovtProofMaster g"),
    @NamedQuery(name = "GovtProofMaster.findByProofId", query = "SELECT g FROM GovtProofMaster g WHERE g.proofId = :proofId"),
    @NamedQuery(name = "GovtProofMaster.findByProofName", query = "SELECT g FROM GovtProofMaster g WHERE g.proofName = :proofName")})
@JsonIgnoreProperties(value={"empPersonalInfoList"})
public class GovtProofMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "proof_id")
    private Integer proofId;
    @Column(name = "proof_name")
    private String proofName;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne
    private StatusMaster statusId;
    @OneToMany(mappedBy = "proofId")
    private List<EmpPersonalInfo> empPersonalInfoList;

    public GovtProofMaster() {
    }

    public GovtProofMaster(Integer proofId) {
        this.proofId = proofId;
    }

    public Integer getProofId() {
        return proofId;
    }

    public void setProofId(Integer proofId) {
        this.proofId = proofId;
    }

    public String getProofName() {
        return proofName;
    }

    public void setProofName(String proofName) {
        this.proofName = proofName;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    @XmlTransient
    public List<EmpPersonalInfo> getEmpPersonalInfoList() {
        return empPersonalInfoList;
    }

    public void setEmpPersonalInfoList(List<EmpPersonalInfo> empPersonalInfoList) {
        this.empPersonalInfoList = empPersonalInfoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proofId != null ? proofId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GovtProofMaster)) {
            return false;
        }
        GovtProofMaster other = (GovtProofMaster) object;
        if ((this.proofId == null && other.proofId != null) || (this.proofId != null && !this.proofId.equals(other.proofId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.GovtProofMaster[ proofId=" + proofId + " ]";
    }
    
}
