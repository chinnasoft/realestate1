/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jayamurugan
 */
@Entity
@Table(name = "session_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SessionMaster.findAll", query = "SELECT s FROM SessionMaster s"),
    @NamedQuery(name = "SessionMaster.findBySessionId", query = "SELECT s FROM SessionMaster s WHERE s.sessionId = :sessionId"),
    @NamedQuery(name = "SessionMaster.findByIpaddress", query = "SELECT s FROM SessionMaster s WHERE s.ipaddress = :ipaddress"),
    @NamedQuery(name = "SessionMaster.findByStartTime", query = "SELECT s FROM SessionMaster s WHERE s.startTime = :startTime"),
    @NamedQuery(name = "SessionMaster.findByEndTime", query = "SELECT s FROM SessionMaster s WHERE s.endTime = :endTime"),
    @NamedQuery(name = "SessionMaster.findByUserName", query = "SELECT s FROM SessionMaster s WHERE s.userName = :userName")})
public class SessionMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "session_id")
    private String sessionId;
    @Column(name = "ipaddress")
    private String ipaddress;
    @Basic(optional = false)
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;
    public SessionMaster() {
    }

    public SessionMaster(String sessionId) {
        this.sessionId = sessionId;
    }

    public SessionMaster(String sessionId, Date startTime, Date endTime, String userName) {
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userName = userName;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LoginMaster getUserId() {
        return userId;
    }

    public void setUserId(LoginMaster userId) {
        this.userId = userId;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionId != null ? sessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SessionMaster)) {
            return false;
        }
        SessionMaster other = (SessionMaster) object;
        if ((this.sessionId == null && other.sessionId != null) || (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.SessionMaster[ sessionId=" + sessionId + " ]";
    }
    
}
