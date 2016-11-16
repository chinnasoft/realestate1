/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author anand
 */
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "gender_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GenderMaster.findAll", query = "SELECT g FROM GenderMaster g"),
    @NamedQuery(name = "GenderMaster.findByGenderId", query = "SELECT g FROM GenderMaster g WHERE g.genderId = :genderId"),
    @NamedQuery(name = "GenderMaster.findByGenderName", query = "SELECT g FROM GenderMaster g WHERE g.genderName = :genderName")})
@JsonIgnoreProperties(value={"statusId", "empPersonalInfoList", "patientPersonalDetailsList"})
public class GenderMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "gender_id")
    private Integer genderId;
    @Basic(optional = false)
    @Column(name = "gender_name")
    private String genderName;
   
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @OneToMany(mappedBy = "genderType")
    private List<EmpPersonalInfo> empPersonalInfoList;

    public GenderMaster() {
    }

    public GenderMaster(Integer genderId) {
        this.genderId = genderId;
    }

    public GenderMaster(Integer genderId, String genderName) {
        this.genderId = genderId;
        this.genderName = genderName;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
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
        hash += (genderId != null ? genderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GenderMaster)) {
            return false;
        }
        GenderMaster other = (GenderMaster) object;
        if ((this.genderId == null && other.genderId != null) || (this.genderId != null && !this.genderId.equals(other.genderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.GenderMaster[ genderId=" + genderId + " ]";
    }
    
}
