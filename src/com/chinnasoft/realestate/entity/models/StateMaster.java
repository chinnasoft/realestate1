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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author anand
 */
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "state_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StateMaster.findAll", query = "SELECT s FROM StateMaster s"),
    @NamedQuery(name = "StateMaster.findByStateId", query = "SELECT s FROM StateMaster s WHERE s.stateId = :stateId"),
    @NamedQuery(name = "StateMaster.findByStateName", query = "SELECT s FROM StateMaster s WHERE s.stateName = :stateName")})
@JsonIgnoreProperties(value={"statusId", "cityMasterList"})
public class StateMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "state_id")
    private Integer stateId;
    @Basic(optional = false)
    @Column(name = "state_name")
    private String stateName;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private List<CityMaster> cityMasterList;

    public StateMaster() {
    }

    public StateMaster(Integer stateId) {
        this.stateId = stateId;
    }

    public StateMaster(Integer stateId, String stateName) {
        this.stateId = stateId;
        this.stateName = stateName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    @XmlTransient
    public List<CityMaster> getCityMasterList() {
        return cityMasterList;
    }

    public void setCityMasterList(List<CityMaster> cityMasterList) {
        this.cityMasterList = cityMasterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StateMaster)) {
            return false;
        }
        StateMaster other = (StateMaster) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.StateMaster[ stateId=" + stateId + " ]";
    }
    
}
