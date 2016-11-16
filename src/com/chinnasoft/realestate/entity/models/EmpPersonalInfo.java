/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.Lob;
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
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author babu
 */
@Entity
@Table(name = "emp_personal_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpPersonalInfo.findAll", query = "SELECT e FROM EmpPersonalInfo e"),
    @NamedQuery(name = "EmpPersonalInfo.findByPersonalId", query = "SELECT e FROM EmpPersonalInfo e WHERE e.personalId = :personalId"),
    @NamedQuery(name = "EmpPersonalInfo.findByFirstName", query = "SELECT e FROM EmpPersonalInfo e WHERE e.firstName = :firstName"),
    @NamedQuery(name = "EmpPersonalInfo.findByMiddleName", query = "SELECT e FROM EmpPersonalInfo e WHERE e.middleName = :middleName"),
    @NamedQuery(name = "EmpPersonalInfo.findByLastName", query = "SELECT e FROM EmpPersonalInfo e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "EmpPersonalInfo.findByDateOfBirth", query = "SELECT e FROM EmpPersonalInfo e WHERE e.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "EmpPersonalInfo.findByCaddress1", query = "SELECT e FROM EmpPersonalInfo e WHERE e.caddress1 = :caddress1"),
    @NamedQuery(name = "EmpPersonalInfo.findByCaddress2", query = "SELECT e FROM EmpPersonalInfo e WHERE e.caddress2 = :caddress2"),
    @NamedQuery(name = "EmpPersonalInfo.findByPaddress1", query = "SELECT e FROM EmpPersonalInfo e WHERE e.paddress1 = :paddress1"),
    @NamedQuery(name = "EmpPersonalInfo.findByPaddress2", query = "SELECT e FROM EmpPersonalInfo e WHERE e.paddress2 = :paddress2"),
    @NamedQuery(name = "EmpPersonalInfo.findByPhoneNo", query = "SELECT e FROM EmpPersonalInfo e WHERE e.phoneNo = :phoneNo"),
    @NamedQuery(name = "EmpPersonalInfo.findByMobileNo", query = "SELECT e FROM EmpPersonalInfo e WHERE e.mobileNo = :mobileNo"),
    @NamedQuery(name = "EmpPersonalInfo.findByEmailId", query = "SELECT e FROM EmpPersonalInfo e WHERE e.emailId = :emailId"),
    @NamedQuery(name = "EmpPersonalInfo.findByProofNum", query = "SELECT e FROM EmpPersonalInfo e WHERE e.proofNum = :proofNum"),
    @NamedQuery(name = "EmpPersonalInfo.findByLastUpdated", query = "SELECT e FROM EmpPersonalInfo e WHERE e.lastUpdated = :lastUpdated")})
@JsonIgnoreProperties(value={ "empInfoList", "statusId"})
public class EmpPersonalInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "personal_id")
    private Integer personalId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    @Column(name = "caddress1")
    private String caddress1;
    @Column(name = "caddress2")
    private String caddress2;
    @Column(name = "paddress1")
    private String paddress1;
    @Column(name = "paddress2")
    private String paddress2;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "email_id")
    private String emailId;
    @Lob
    @Column(name = "photo_path")
    private String photoPath;
    @Column(name = "proof_num")
    private String proofNum;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "gender_type", referencedColumnName = "gender_id")
    @ManyToOne(optional = false)
    private GenderMaster genderType;
    
    
    @JoinColumn(name = "pcity_id", referencedColumnName = "city_id")
    @ManyToOne
    private CityMaster pcityId;
    
    @JoinColumn(name = "ccity_id", referencedColumnName = "city_id")
    @ManyToOne
    private CityMaster ccityId;
    
    @JoinColumn(name = "proof_id", referencedColumnName = "proof_id")
    @ManyToOne
    private GovtProofMaster proofId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalId")
    private List<EmpInfo> empInfoList;

    public EmpPersonalInfo() {
    }

    public EmpPersonalInfo(Integer personalId) {
        this.personalId = personalId;
    }

    public EmpPersonalInfo(Integer personalId, Date lastUpdated) {
        this.personalId = personalId;
        this.lastUpdated = lastUpdated;
    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCaddress1() {
        return caddress1;
    }

    public void setCaddress1(String caddress1) {
        this.caddress1 = caddress1;
    }

    public String getCaddress2() {
        return caddress2;
    }

    public void setCaddress2(String caddress2) {
        this.caddress2 = caddress2;
    }

    public String getPaddress1() {
        return paddress1;
    }

    public void setPaddress1(String paddress1) {
        this.paddress1 = paddress1;
    }

    public String getPaddress2() {
        return paddress2;
    }

    public void setPaddress2(String paddress2) {
        this.paddress2 = paddress2;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getProofNum() {
        return proofNum;
    }

    public void setProofNum(String proofNum) {
        this.proofNum = proofNum;
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

    public GenderMaster getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderMaster genderType) {
        this.genderType = genderType;
    }

    public CityMaster getPcityId() {
        return pcityId;
    }

    public void setPcityId(CityMaster pcityId) {
        this.pcityId = pcityId;
    }

    public CityMaster getCcityId() {
        return ccityId;
    }

    public void setCcityId(CityMaster ccityId) {
        this.ccityId = ccityId;
    }

    public GovtProofMaster getProofId() {
        return proofId;
    }

    public void setProofId(GovtProofMaster proofId) {
        this.proofId = proofId;
    }

    

    @XmlTransient
    public List<EmpInfo> getEmpInfoList() {
        return empInfoList;
    }

    public void setEmpInfoList(List<EmpInfo> empInfoList) {
        this.empInfoList = empInfoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personalId != null ? personalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpPersonalInfo)) {
            return false;
        }
        EmpPersonalInfo other = (EmpPersonalInfo) object;
        if ((this.personalId == null && other.personalId != null) || (this.personalId != null && !this.personalId.equals(other.personalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.EmpPersonalInfo[ personalId=" + personalId + " ]";
    }
    
}
