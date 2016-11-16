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
@Table(name = "user_type_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserTypeMaster.findAll", query = "SELECT u FROM UserTypeMaster u"),
    @NamedQuery(name = "UserTypeMaster.findByUserTypeId", query = "SELECT u FROM UserTypeMaster u WHERE u.userTypeId = :userTypeId"),
    @NamedQuery(name = "UserTypeMaster.findByUserTypeName", query = "SELECT u FROM UserTypeMaster u WHERE u.userTypeName = :userTypeName")})
public class UserTypeMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "user_type_id")
    private Integer userTypeId;
    @Basic(optional = false)
    @Column(name = "user_type_name")
    private String userTypeName;
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "userTypeId")
    private List<LoginMaster> loginMasterList;*/
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;

    public UserTypeMaster() {
    }

    public UserTypeMaster(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public UserTypeMaster(Integer userTypeId, String userTypeName) {
        this.userTypeId = userTypeId;
        this.userTypeName = userTypeName;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    /*@XmlTransient
    public List<LoginMaster> getLoginMasterList() {
        return loginMasterList;
    }

    public void setLoginMasterList(List<LoginMaster> loginMasterList) {
        this.loginMasterList = loginMasterList;
    }
*/
    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userTypeId != null ? userTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserTypeMaster)) {
            return false;
        }
        UserTypeMaster other = (UserTypeMaster) object;
        if ((this.userTypeId == null && other.userTypeId != null) || (this.userTypeId != null && !this.userTypeId.equals(other.userTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.UserTypeMaster[ userTypeId=" + userTypeId + " ]";
    }
    
}
