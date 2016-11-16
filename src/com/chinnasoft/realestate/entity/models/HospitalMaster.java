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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author babu
 */
@Entity
@Table(name = "hospital_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HospitalMaster.findAll", query = "SELECT h FROM HospitalMaster h"),
    @NamedQuery(name = "HospitalMaster.findByHospitalId", query = "SELECT h FROM HospitalMaster h WHERE h.hospitalId = :hospitalId"),
    @NamedQuery(name = "HospitalMaster.findByOrganization", query = "SELECT h FROM HospitalMaster h WHERE h.organization = :organization"),
    @NamedQuery(name = "HospitalMaster.findByPhoneNo", query = "SELECT h FROM HospitalMaster h WHERE h.phoneNo = :phoneNo"),
    @NamedQuery(name = "HospitalMaster.findByMobileNo", query = "SELECT h FROM HospitalMaster h WHERE h.mobileNo = :mobileNo"),
    @NamedQuery(name = "HospitalMaster.findByFaxNo", query = "SELECT h FROM HospitalMaster h WHERE h.faxNo = :faxNo"),
    @NamedQuery(name = "HospitalMaster.findByEmailId", query = "SELECT h FROM HospitalMaster h WHERE h.emailId = :emailId"),
    @NamedQuery(name = "HospitalMaster.findByContactPersonName", query = "SELECT h FROM HospitalMaster h WHERE h.contactPersonName = :contactPersonName"),
    @NamedQuery(name = "HospitalMaster.findByTinNo", query = "SELECT h FROM HospitalMaster h WHERE h.tinNo = :tinNo"),
    @NamedQuery(name = "HospitalMaster.findByLicenseNo", query = "SELECT h FROM HospitalMaster h WHERE h.licenseNo = :licenseNo"),
    @NamedQuery(name = "HospitalMaster.findByImaRegNo", query = "SELECT h FROM HospitalMaster h WHERE h.imaRegNo = :imaRegNo"),
    @NamedQuery(name = "HospitalMaster.findByCstNo", query = "SELECT h FROM HospitalMaster h WHERE h.cstNo = :cstNo"),
    @NamedQuery(name = "HospitalMaster.findByServiceTax", query = "SELECT h FROM HospitalMaster h WHERE h.serviceTax = :serviceTax"),
    @NamedQuery(name = "HospitalMaster.findByCessTax", query = "SELECT h FROM HospitalMaster h WHERE h.cessTax = :cessTax"),
    @NamedQuery(name = "HospitalMaster.findByLastUpdated", query = "SELECT h FROM HospitalMaster h WHERE h.lastUpdated = :lastUpdated")})
@JsonIgnoreProperties(value = {"designationMasterList","departmentMasterList","empInfoList","loginMasterList"				

})
public class HospitalMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @Basic(optional = false)
    @Column(name = "organization")
    private String organization;
    @Lob
    @Column(name = "address1")
    private String address1;
    @Lob
    @Column(name = "address2")
    private String address2;
    @Basic(optional = false)
    @Column(name = "phone_no")
    private String phoneNo;
    @Basic(optional = false)
    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "fax_no")
    private String faxNo;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "contact_person_name")
    private String contactPersonName;
    @Column(name = "tin_no")
    private String tinNo;
    @Column(name = "license_no")
    private String licenseNo;
    @Column(name = "ima_reg_no")
    private String imaRegNo;
    @Column(name = "cst_no")
    private String cstNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "service_tax")
    private Double serviceTax;
    @Column(name = "cess_tax")
    private Double cessTax;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
   
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne(optional = false)
    private CityMaster cityId;
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
    private List<InventoryJournal> inventoryJournalList;*/
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
    private List<EmpTypeMaster> empTypeMasterList;*/
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
    private List<DesignationMaster> designationMasterList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
    private List<DepartmentMaster> departmentMasterList;
   
  
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
    private List<EmpInfo> empInfoList;
   
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospitalId")
private List<LoginMaster> loginMasterList;
    

    public HospitalMaster() {
    }

    public HospitalMaster(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public HospitalMaster(Integer hospitalId, String organization, String phoneNo, String mobileNo, Date lastUpdated) {
        this.hospitalId = hospitalId;
        this.organization = organization;
        this.phoneNo = phoneNo;
        this.mobileNo = mobileNo;
        this.lastUpdated = lastUpdated;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
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

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getTinNo() {
        return tinNo;
    }

    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getImaRegNo() {
        return imaRegNo;
    }

    public void setImaRegNo(String imaRegNo) {
        this.imaRegNo = imaRegNo;
    }

    public String getCstNo() {
        return cstNo;
    }

    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
    }

    public Double getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(Double serviceTax) {
        this.serviceTax = serviceTax;
    }

    public Double getCessTax() {
        return cessTax;
    }

    public void setCessTax(Double cessTax) {
        this.cessTax = cessTax;
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

    public CityMaster getCityId() {
        return cityId;
    }

    public void setCityId(CityMaster cityId) {
        this.cityId = cityId;
    }

  /*  @XmlTransient
    public List<InventoryJournal> getInventoryJournalList() {
        return inventoryJournalList;
    }

    public void setInventoryJournalList(List<InventoryJournal> inventoryJournalList) {
        this.inventoryJournalList = inventoryJournalList;
    }*/
    

   /* @XmlTransient
    public List<DesignationCategoryMaster> getDesignationCategoryMasterList() {
        return designationCategoryMasterList;
    }

    public void setDesignationCategoryMasterList(List<DesignationCategoryMaster> designationCategoryMasterList) {
        this.designationCategoryMasterList = designationCategoryMasterList;
    }*/

    @XmlTransient
    public List<DesignationMaster> getDesignationMasterList() {
        return designationMasterList;
    }

    public void setDesignationMasterList(List<DesignationMaster> designationMasterList) {
        this.designationMasterList = designationMasterList;
    }

   
    @XmlTransient
    public List<DepartmentMaster> getDepartmentMasterList() {
        return departmentMasterList;
    }

    public void setDepartmentMasterList(List<DepartmentMaster> departmentMasterList) {
        this.departmentMasterList = departmentMasterList;
    }


 /*   @XmlTransient
    public List<PaymentMethodMaster> getPaymentMethodMasterList() {
        return paymentMethodMasterList;
    }

    public void setPaymentMethodMasterList(List<PaymentMethodMaster> paymentMethodMasterList) {
        this.paymentMethodMasterList = paymentMethodMasterList;
    }
*/
    @XmlTransient
    public List<EmpInfo> getEmpInfoList() {
        return empInfoList;
    }

    public void setEmpInfoList(List<EmpInfo> empInfoList) {
        this.empInfoList = empInfoList;
    }

   
    
    

   
	@XmlTransient
    public List<LoginMaster> getLoginMasterList() {
        return loginMasterList;
    }



    public void setLoginMasterList(List<LoginMaster> loginMasterList) {
        this.loginMasterList = loginMasterList;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hospitalId != null ? hospitalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HospitalMaster)) {
            return false;
        }
        HospitalMaster other = (HospitalMaster) object;
        if ((this.hospitalId == null && other.hospitalId != null) || (this.hospitalId != null && !this.hospitalId.equals(other.hospitalId))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.HospitalMaster[ hospitalId=" + hospitalId + " ]";
    }
    
}
                                                                                