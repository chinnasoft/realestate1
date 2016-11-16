/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author babu
 */
@Entity
@Table(name = "status_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusMaster.findAll", query = "SELECT s FROM StatusMaster s"),
    @NamedQuery(name = "StatusMaster.findByStatusId", query = "SELECT s FROM StatusMaster s WHERE s.statusId = :statusId"),
    @NamedQuery(name = "StatusMaster.findByStatusDesc", query = "SELECT s FROM StatusMaster s WHERE s.statusDesc = :statusDesc"),
    @NamedQuery(name = "StatusMaster.findByStatus", query = "SELECT s FROM StatusMaster s WHERE s.status = :status")})
@JsonIgnoreProperties(value = {"empSalarySetupList", "stateMasterList", "govtProofMasterList", "ChargeItemMaster",
		"bedMasterList", "ipdFinalBillingList", "yesNoMasterList", "itemMasterList", "hospitalMasterList", 
		"inventoryTypeMasterList", "inventoryJournalList", "empTerminateInfoList", "guardianTypeMasterList", 
		"empTypeMasterList", "prefixTypeMasterList", "salaryheadsPrimaryTypeMasterList", "empOfficeInfoList", 
		"bankMasterList", "rightsMasterList", "leaveMasterList", "empPersonalInfoList", "workSessionMasterList", 
		"empLeaveReplyList", "designationCategoryMasterList", "menuMasterList", "wardMasterList", "operationTypeMasterList", 
		"empAccountDetailsList", "userTypeMasterList", "workingHourMasterList", "chargeCategoryMasterList", 
		"opdConsultationDetailsList", "bloodGroupMasterList", "itemCategoryMasterList", "designationMasterList", 
		"userRightsList", "weekMasterList", "operationHistoryFormList", "ipdInfoList", "departmentMasterList", 
		"empLeaveAssignList", "patientPersonalDetailsList", "ipdPaymentDetailsList", "salaryStrucutreMasterList", 
		"shiftMasterList", "chargeItemMasterList", "leaveGenderMasterList", "salaryheadsMasterList", "annualYearMasterList", 
		"roomMasterList", "genderMasterList", "availabilityTypeMasterList", "holidayMasterList", "loginMasterList", 
		"itemUnitTypeMasterList", "roomTypeMasterList", "paymentMethodMasterList", "filepathMasterList", 
		"empLeaveApplyList", "attendanceStatusMasterList", "dischargeTypeMasterList", "empShiftAssignList", "cityMasterList", "empReferalInfoList", 
		"dischargeFormList", "salaryheadsCalTypeMasterList", "leavePayMasterList", "inventoryJournalDetailsList", 
		"prefixMasterList", "ipdChargesBillingList", "inventoryPatientDetailsList", "martialTypeMasterList", 
		"empInfoList", "paymentRemarksHistoryList", "leaveStatusMasterList", "floorMasterList", "patientPaymentmodeList",
		"amcInventoryDetailsList","loanSelfMasterList","employeeOtherIncomeList","voucherPaymentDetailsList","vocherBankMsterList",
		"checkPaymentList","opdSchedularTimeList","checkPaymentGenralList","otherServicesList",
		"depositeDetailsList","customServiceSetupList","commonFactorList",
		"headerImagePathList","serviceMasterList","appointmentTypeMasterList","appointmentTimesDetailsList","bookingStatusMasterList","serviceEmpmapDetailsList","appointmentInfoList",
		"periodMasterList","persistenceMasterList","relationshipMasterList","patientComplaintHistoryList","severityMasterList","pathologyMasterList","smokingMasterList",
		 "drinkingMasterList","dietMasterList","patientExaminationDetailsList","healthStatusMasterList","complaintMasterList","etymologyMasterList","patientComplaintDetailsList",
		 "patientHistoryList","complaintCategoryMasterList","symptomsMasterList","patientMapList"
		})
public class StatusMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "status_id")
    private Integer statusId;
    @Basic(optional = false)
    @Column(name = "status_desc")
    private String statusDesc;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
   
   /* private List<StateMaster> stateMasterList;
    @OneToMany(mappedBy = "statusId")
    private List<GovtProofMaster> govtProofMasterList;
    */
    
    
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<InventoryJournal> inventoryJournalList;*/
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
   
    private List<GuardianTypeMaster> guardianTypeMasterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<EmpTypeMaster> empTypeMasterList;
 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<EmpOfficeInfo> empOfficeInfoList;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<RightsMaster> rightsMasterList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<EmpPersonalInfo> empPersonalInfoList;
   
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<DesignationCategoryMaster> designationCategoryMasterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<MenuMaster> menuMasterList;
  
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<UserTypeMaster> userTypeMasterList;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<DesignationMaster> designationMasterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<UserRights> userRightsList;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<DepartmentMaster> departmentMasterList;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<GenderMaster> genderMasterList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<LoginMaster> loginMasterList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<CityMaster> cityMasterList;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<EmpInfo> empInfoList;
   
   
    
    
   
    
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusId")
    private List<HeaderImagePath> headerImagePathList;
    
   
 
 

 
 
    public StatusMaster() {
    }

    public StatusMaster(Integer statusId) {
        this.statusId = statusId;
    }

    public StatusMaster(Integer statusId, String statusDesc, Character status) {
        this.statusId = statusId;
        this.statusDesc = statusDesc;
        this.status = status;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

   

   /* @XmlTransient
    public List<StateMaster> getStateMasterList() {
        return stateMasterList;
    }

    public void setStateMasterList(List<StateMaster> stateMasterList) {
        this.stateMasterList = stateMasterList;
    }*/

   /* @XmlTransient
    public List<GovtProofMaster> getGovtProofMasterList() {
        return govtProofMasterList;
    }

    public void setGovtProofMasterList(List<GovtProofMaster> govtProofMasterList) {
        this.govtProofMasterList = govtProofMasterList;
    }*/

   
/*
    @XmlTransient
    public List<HospitalMaster> getHospitalMasterList() {
        return hospitalMasterList;
    }

    public void setHospitalMasterList(List<HospitalMaster> hospitalMasterList) {
        this.hospitalMasterList = hospitalMasterList;
    }

   */
    
    /*@XmlTransient
    public List<InventoryJournal> getInventoryJournalList() {
        return inventoryJournalList;
    }

    public void setInventoryJournalList(List<InventoryJournal> inventoryJournalList) {
        this.inventoryJournalList = inventoryJournalList;
    }*/


    @XmlTransient
    public List<GuardianTypeMaster> getGuardianTypeMasterList() {
        return guardianTypeMasterList;
    }

    public void setGuardianTypeMasterList(List<GuardianTypeMaster> guardianTypeMasterList) {
        this.guardianTypeMasterList = guardianTypeMasterList;
    }

    @XmlTransient
    public List<EmpTypeMaster> getEmpTypeMasterList() {
        return empTypeMasterList;
    }

    public void setEmpTypeMasterList(List<EmpTypeMaster> empTypeMasterList) {
        this.empTypeMasterList = empTypeMasterList;
    }

    

    @XmlTransient
    public List<EmpOfficeInfo> getEmpOfficeInfoList() {
        return empOfficeInfoList;
    }

    public void setEmpOfficeInfoList(List<EmpOfficeInfo> empOfficeInfoList) {
        this.empOfficeInfoList = empOfficeInfoList;
    }


    @XmlTransient
    public List<RightsMaster> getRightsMasterList() {
        return rightsMasterList;
    }

    public void setRightsMasterList(List<RightsMaster> rightsMasterList) {
        this.rightsMasterList = rightsMasterList;
    }

    @XmlTransient
    public List<EmpPersonalInfo> getEmpPersonalInfoList() {
        return empPersonalInfoList;
    }

    public void setEmpPersonalInfoList(List<EmpPersonalInfo> empPersonalInfoList) {
        this.empPersonalInfoList = empPersonalInfoList;
    }

   


    @XmlTransient
    public List<DesignationCategoryMaster> getDesignationCategoryMasterList() {
        return designationCategoryMasterList;
    }

    public void setDesignationCategoryMasterList(List<DesignationCategoryMaster> designationCategoryMasterList) {
        this.designationCategoryMasterList = designationCategoryMasterList;
    }

    @XmlTransient
    public List<MenuMaster> getMenuMasterList() {
        return menuMasterList;
    }

    public void setMenuMasterList(List<MenuMaster> menuMasterList) {
        this.menuMasterList = menuMasterList;
    }

   

   


    @XmlTransient
    public List<UserTypeMaster> getUserTypeMasterList() {
        return userTypeMasterList;
    }

    public void setUserTypeMasterList(List<UserTypeMaster> userTypeMasterList) {
        this.userTypeMasterList = userTypeMasterList;
    }



    @XmlTransient
    public List<DesignationMaster> getDesignationMasterList() {
        return designationMasterList;
    }

    public void setDesignationMasterList(List<DesignationMaster> designationMasterList) {
        this.designationMasterList = designationMasterList;
    }

    @XmlTransient
    public List<UserRights> getUserRightsList() {
        return userRightsList;
    }

    public void setUserRightsList(List<UserRights> userRightsList) {
        this.userRightsList = userRightsList;
    }

    @XmlTransient
    public List<DepartmentMaster> getDepartmentMasterList() {
        return departmentMasterList;
    }

    public void setDepartmentMasterList(List<DepartmentMaster> departmentMasterList) {
        this.departmentMasterList = departmentMasterList;
    }

    
    @XmlTransient
    public List<GenderMaster> getGenderMasterList() {
        return genderMasterList;
    }

    public void setGenderMasterList(List<GenderMaster> genderMasterList) {
        this.genderMasterList = genderMasterList;
    }

  
    @XmlTransient
    public List<LoginMaster> getLoginMasterList() {
        return loginMasterList;
    }

    public void setLoginMasterList(List<LoginMaster> loginMasterList) {
        this.loginMasterList = loginMasterList;
    }

    @XmlTransient
    public List<CityMaster> getCityMasterList() {
        return cityMasterList;
    }

    public void setCityMasterList(List<CityMaster> cityMasterList) {
        this.cityMasterList = cityMasterList;
    }

   
    @XmlTransient
    public List<EmpInfo> getEmpInfoList() {
        return empInfoList;
    }

    public void setEmpInfoList(List<EmpInfo> empInfoList) {
        this.empInfoList = empInfoList;
    }

    
	
    @XmlTransient
    public List<HeaderImagePath> getHeaderImagePathList() {
        return headerImagePathList;
    }

    public void setHeaderImagePathList(List<HeaderImagePath> headerImagePathList) {
        this.headerImagePathList = headerImagePathList;
    }
   
    
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusMaster)) {
            return false;
        }
        StatusMaster other = (StatusMaster) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.StatusMaster[ statusId=" + statusId + " ]";
    }
    
}
