package com.chinnasoft.realestate.entity.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bargunan
 */
@Entity
@Table(name = "setup_header_menu_super")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SetupHeaderMenuSuper.findAll", query = "SELECT s FROM SetupHeaderMenuSuper s"),
    @NamedQuery(name = "SetupHeaderMenuSuper.findBySetupHeaderMenuId", query = "SELECT s FROM SetupHeaderMenuSuper s WHERE s.setupHeaderMenuId = :setupHeaderMenuId"),
    @NamedQuery(name = "SetupHeaderMenuSuper.findBySetupHeaderName", query = "SELECT s FROM SetupHeaderMenuSuper s WHERE s.setupHeaderName = :setupHeaderName"),
    @NamedQuery(name = "SetupHeaderMenuSuper.findBySetupHeaderImage", query = "SELECT s FROM SetupHeaderMenuSuper s WHERE s.setupHeaderImage = :setupHeaderImage")})
public class SetupHeaderMenuSuper implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "setup_header_menu_id")
    private Integer setupHeaderMenuId;
    @Basic(optional = false)
    @Column(name = "setup_header_name")
    private String setupHeaderName;
    @Column(name = "setup_header_image")
    private String setupHeaderImage;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;

    public SetupHeaderMenuSuper() {
    }

    public SetupHeaderMenuSuper(Integer setupHeaderMenuId) {
        this.setupHeaderMenuId = setupHeaderMenuId;
    }

    public SetupHeaderMenuSuper(Integer setupHeaderMenuId, String setupHeaderName) {
        this.setupHeaderMenuId = setupHeaderMenuId;
        this.setupHeaderName = setupHeaderName;
    }

    public Integer getSetupHeaderMenuId() {
        return setupHeaderMenuId;
    }

    public void setSetupHeaderMenuId(Integer setupHeaderMenuId) {
        this.setupHeaderMenuId = setupHeaderMenuId;
    }

    public String getSetupHeaderName() {
        return setupHeaderName;
    }

    public void setSetupHeaderName(String setupHeaderName) {
        this.setupHeaderName = setupHeaderName;
    }

    public String getSetupHeaderImage() {
        return setupHeaderImage;
    }

    public void setSetupHeaderImage(String setupHeaderImage) {
        this.setupHeaderImage = setupHeaderImage;
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
        hash += (setupHeaderMenuId != null ? setupHeaderMenuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SetupHeaderMenuSuper)) {
            return false;
        }
        SetupHeaderMenuSuper other = (SetupHeaderMenuSuper) object;
        if ((this.setupHeaderMenuId == null && other.setupHeaderMenuId != null) || (this.setupHeaderMenuId != null && !this.setupHeaderMenuId.equals(other.setupHeaderMenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.SetupHeaderMenuSuper[ setupHeaderId=" + setupHeaderMenuId + " ]";
    }
    
}
