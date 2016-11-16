package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author bargunan
 */
@Entity
@Table(name = "subscription_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubscriptionDetails.findAll", query = "SELECT s FROM SubscriptionDetails s"),
    @NamedQuery(name = "SubscriptionDetails.findBySubscriptionId", query = "SELECT s FROM SubscriptionDetails s WHERE s.subscriptionId = :subscriptionId"),
    @NamedQuery(name = "SubscriptionDetails.findByNoOfLogins", query = "SELECT s FROM SubscriptionDetails s WHERE s.noOfLogins = :noOfLogins"),
    @NamedQuery(name = "SubscriptionDetails.findByFromSubsdate", query = "SELECT s FROM SubscriptionDetails s WHERE s.fromSubsdate = :fromSubsdate"),
    @NamedQuery(name = "SubscriptionDetails.findByToSubsdate", query = "SELECT s FROM SubscriptionDetails s WHERE s.toSubsdate = :toSubsdate"),
    @NamedQuery(name = "SubscriptionDetails.findByLastUpdated", query = "SELECT s FROM SubscriptionDetails s WHERE s.lastUpdated = :lastUpdated")})
public class SubscriptionDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subscription_id")
    private Integer subscriptionId;
    @Basic(optional = false)
    @Column(name = "no_of_logins")
    private int noOfLogins;
    @Basic(optional = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "from_subsdate")
    @Temporal(TemporalType.DATE)
    private Date fromSubsdate;
    @Basic(optional = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "to_subsdate")
    @Temporal(TemporalType.DATE)
    private Date toSubsdate;
    @Basic(optional = false)
    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
    @ManyToOne(optional = false)
    private HospitalMaster hospitalId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private LoginMaster userId;

    public SubscriptionDetails() {
    }

    public SubscriptionDetails(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public SubscriptionDetails(Integer subscriptionId, int noOfLogins, Date fromSubsdate, Date toSubsdate, Date lastUpdated) {
        this.subscriptionId = subscriptionId;
        this.noOfLogins = noOfLogins;
        this.fromSubsdate = fromSubsdate;
        this.toSubsdate = toSubsdate;
        this.lastUpdated = lastUpdated;
    }

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getNoOfLogins() {
        return noOfLogins;
    }

    public void setNoOfLogins(int noOfLogins) {
        this.noOfLogins = noOfLogins;
    }

    public Date getFromSubsdate() {
        return fromSubsdate;
    }

    public void setFromSubsdate(Date fromSubsdate) {
        this.fromSubsdate = fromSubsdate;
    }

    public Date getToSubsdate() {
        return toSubsdate;
    }

    public void setToSubsdate(Date toSubsdate) {
        this.toSubsdate = toSubsdate;
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

    public HospitalMaster getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(HospitalMaster hospitalId) {
        this.hospitalId = hospitalId;
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
        hash += (subscriptionId != null ? subscriptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionDetails)) {
            return false;
        }
        SubscriptionDetails other = (SubscriptionDetails) object;
        if ((this.subscriptionId == null && other.subscriptionId != null) || (this.subscriptionId != null && !this.subscriptionId.equals(other.subscriptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SubscriptionDetails[ subscriptionId=" + subscriptionId + " ]";
    }
    
}
