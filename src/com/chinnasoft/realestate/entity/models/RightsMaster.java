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

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author anand
 */
@Entity
@Table(name = "rights_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RightsMaster.findAll", query = "SELECT r FROM RightsMaster r"),
    @NamedQuery(name = "RightsMaster.findByRightsId", query = "SELECT r FROM RightsMaster r WHERE r.rightsId = :rightsId"),
    @NamedQuery(name = "RightsMaster.findByRightsName", query = "SELECT r FROM RightsMaster r WHERE r.rightsName = :rightsName")})
public class RightsMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "rights_id")
    private Integer rightsId;
    @Basic(optional = false)
    @Column(name = "rights_name")
    private String rightsName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rightsId")
    private List<UserRights> userRightsList;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;

    public RightsMaster() {
    }

    public RightsMaster(Integer rightsId) {
        this.rightsId = rightsId;
    }

    public RightsMaster(Integer rightsId, String rightsName) {
        this.rightsId = rightsId;
        this.rightsName = rightsName;
    }

    public Integer getRightsId() {
        return rightsId;
    }

    public void setRightsId(Integer rightsId) {
        this.rightsId = rightsId;
    }

    public String getRightsName() {
        return rightsName;
    }

    public void setRightsName(String rightsName) {
        this.rightsName = rightsName;
    }

    @XmlTransient
    public List<UserRights> getUserRightsList() {
        return userRightsList;
    }

    public void setUserRightsList(List<UserRights> userRightsList) {
        this.userRightsList = userRightsList;
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
        hash += (rightsId != null ? rightsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RightsMaster)) {
            return false;
        }
        RightsMaster other = (RightsMaster) object;
        if ((this.rightsId == null && other.rightsId != null) || (this.rightsId != null && !this.rightsId.equals(other.rightsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.RightsMaster[ rightsId=" + rightsId + " ]";
    }
    
}
