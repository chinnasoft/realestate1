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
@Table(name = "city_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CityMaster.findAll", query = "SELECT c FROM CityMaster c"),
    @NamedQuery(name = "CityMaster.findByCityId", query = "SELECT c FROM CityMaster c WHERE c.cityId = :cityId"),
    @NamedQuery(name = "CityMaster.findByCityName", query = "SELECT c FROM CityMaster c WHERE c.cityName = :cityName")})
@JsonIgnoreProperties(value={"empPersonalInfoList", "empPersonalInfoList1", "hospitalMasterList", "statusId"})
public class CityMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "city_id")
    private Integer cityId;
    @Basic(optional = false)
    @Column(name = "city_name")
    private String cityName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityId")
    
   /* private List<HospitalMaster> hospitalMasterList;
    @OneToMany(mappedBy = "pcityId")
    private List<EmpPersonalInfo> empPersonalInfoList;
    @OneToMany(mappedBy = "ccityId")
    private List<EmpPersonalInfo> empPersonalInfoList1;*/
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private StateMaster stateId;

    public CityMaster() {
    }

    public CityMaster(Integer cityId) {
        this.cityId = cityId;
    }

    public CityMaster(Integer cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

   /* @XmlTransient
    public List<HospitalMaster> getHospitalMasterList() {
        return hospitalMasterList;
    }

    public void setHospitalMasterList(List<HospitalMaster> hospitalMasterList) {
        this.hospitalMasterList = hospitalMasterList;
    }

    @XmlTransient
    public List<EmpPersonalInfo> getEmpPersonalInfoList() {
        return empPersonalInfoList;
    }

    public void setEmpPersonalInfoList(List<EmpPersonalInfo> empPersonalInfoList) {
        this.empPersonalInfoList = empPersonalInfoList;
    }

    @XmlTransient
    public List<EmpPersonalInfo> getEmpPersonalInfoList1() {
        return empPersonalInfoList1;
    }

    public void setEmpPersonalInfoList1(List<EmpPersonalInfo> empPersonalInfoList1) {
        this.empPersonalInfoList1 = empPersonalInfoList1;
    }
*/
    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    public StateMaster getStateId() {
        return stateId;
    }

    public void setStateId(StateMaster stateId) {
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityId != null ? cityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CityMaster)) {
            return false;
        }
        CityMaster other = (CityMaster) object;
        if ((this.cityId == null && other.cityId != null) || (this.cityId != null && !this.cityId.equals(other.cityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.CityMaster[ cityId=" + cityId + " ]";
    }
    
}
