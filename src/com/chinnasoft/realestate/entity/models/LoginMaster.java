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

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author chinnaiah
 */
@Entity
@Table(name = "login_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginMaster.findAll", query = "SELECT l FROM LoginMaster l"),
    @NamedQuery(name = "LoginMaster.findByUserId", query = "SELECT l FROM LoginMaster l WHERE l.userId = :userId"),
    @NamedQuery(name = "LoginMaster.findByUserName", query = "SELECT l FROM LoginMaster l WHERE l.userName = :userName"),
    @NamedQuery(name = "LoginMaster.findByUserPassword", query = "SELECT l FROM LoginMaster l WHERE l.userPassword = :userPassword"),
    @NamedQuery(name = "LoginMaster.findByLastUpdated", query = "SELECT l FROM LoginMaster l WHERE l.lastUpdated = :lastUpdated")})
@JsonIgnoreProperties(value={"empInfoList","floorMasterList"})

public class LoginMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @Column(name = "user_password")
    private String userPassword;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
 /*   @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<HospitalMaster> hospitalMasterList;*/
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<EmpInfo> empInfoList;
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
    @ManyToOne(optional = false)
    private HospitalMaster hospitalId;
    @JoinColumn(name = "user_type_id", referencedColumnName = "user_type_id")
    @ManyToOne(optional = false)
    private UserTypeMaster userTypeId;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
    @ManyToOne
    private EmpInfo empId;

    
    public LoginMaster() {
    }

    public LoginMaster(Integer userId) {
        this.userId = userId;
    }

    public LoginMaster(Integer userId, String userName, String userPassword, Date lastUpdated) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.lastUpdated = lastUpdated;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

   /* @XmlTransient
    public List<HospitalMaster> getHospitalMasterList() {
        return hospitalMasterList;
    }

    public void setHospitalMasterList(List<HospitalMaster> hospitalMasterList) {
        this.hospitalMasterList = hospitalMasterList;
    }
*/
    @XmlTransient
    public List<EmpInfo> getEmpInfoList() {
        return empInfoList;
    }

    public void setEmpInfoList(List<EmpInfo> empInfoList) {
        this.empInfoList = empInfoList;
    }

    public HospitalMaster getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(HospitalMaster hospitalId) {
        this.hospitalId = hospitalId;
    }

    public UserTypeMaster getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(UserTypeMaster userTypeId) {
        this.userTypeId = userTypeId;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    public EmpInfo getEmpId() {
        return empId;
    }

    public void setEmpId(EmpInfo empId) {
        this.empId = empId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoginMaster)) {
            return false;
        }
        LoginMaster other = (LoginMaster) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.LoginMaster[ userId=" + userId + " ]";
    }
    
}
