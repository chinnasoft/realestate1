/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author babu
 */
@Entity
@Table(name = "user_rights")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRights.findAll", query = "SELECT u FROM UserRights u"),
    @NamedQuery(name = "UserRights.findByUserRightsId", query = "SELECT u FROM UserRights u WHERE u.userRightsId = :userRightsId")})
public class UserRights implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_rights_id")
    private Integer userRightsId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "rights_id", referencedColumnName = "rights_id")
    @ManyToOne(optional = false)
    private RightsMaster rightsId;
    @JoinColumn(name = "menu_id", referencedColumnName = "menu_id")
    @ManyToOne(optional = false)
    private MenuMaster menuId;

    public UserRights() {
    }

    public UserRights(Integer userRightsId) {
        this.userRightsId = userRightsId;
    }

    public Integer getUserRightsId() {
        return userRightsId;
    }

    public void setUserRightsId(Integer userRightsId) {
        this.userRightsId = userRightsId;
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

    public RightsMaster getRightsId() {
        return rightsId;
    }

    public void setRightsId(RightsMaster rightsId) {
        this.rightsId = rightsId;
    }

    public MenuMaster getMenuId() {
        return menuId;
    }

    public void setMenuId(MenuMaster menuId) {
        this.menuId = menuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRightsId != null ? userRightsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRights)) {
            return false;
        }
        UserRights other = (UserRights) object;
        if ((this.userRightsId == null && other.userRightsId != null) || (this.userRightsId != null && !this.userRightsId.equals(other.userRightsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.UserRights[ userRightsId=" + userRightsId + " ]";
    }
    
}
