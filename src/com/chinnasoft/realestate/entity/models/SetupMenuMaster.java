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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "setup_menu_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SetupMenuMaster.findAll", query = "SELECT s FROM SetupMenuMaster s"),
    @NamedQuery(name = "SetupMenuMaster.findBySetupMenuMasterId", query = "SELECT s FROM SetupMenuMaster s WHERE s.setupMenuMasterId = :setupMenuMasterId"),
    @NamedQuery(name = "SetupMenuMaster.findBySetupMenuName", query = "SELECT s FROM SetupMenuMaster s WHERE s.setupMenuName = :setupMenuName")})
public class SetupMenuMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Basic(optional = false)
    @Column(name = "setup_menu_master_id")
    private Integer setupMenuMasterId;
    @Basic(optional = false)
    @Column(name = "setup_menu_name")
    private String setupMenuName;
    @Basic(optional = false)
    @Lob
    @Column(name = "setup_menu_link")
    private String setupMenuLink;
    @Basic(optional = false)
    @Lob
    @Column(name = "setup_menu_image")
    private String setupMenuImage;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "setup_header_id", referencedColumnName = "setup_header_menu_id")
    @ManyToOne(optional = false)
    private SetupHeaderMenu setupHeaderId;

    public SetupMenuMaster() {
    }

    public SetupMenuMaster(Integer setupMenuMasterId) {
        this.setupMenuMasterId = setupMenuMasterId;
    }

    public SetupMenuMaster(Integer setupMenuMasterId, String setupMenuName, String setupMenuLink, String setupMenuImage) {
        this.setupMenuMasterId = setupMenuMasterId;
        this.setupMenuName = setupMenuName;
        this.setupMenuLink = setupMenuLink;
        this.setupMenuImage = setupMenuImage;
    }

    public Integer getSetupMenuMasterId() {
        return setupMenuMasterId;
    }

    public void setSetupMenuMasterId(Integer setupMenuMasterId) {
        this.setupMenuMasterId = setupMenuMasterId;
    }

    public String getSetupMenuName() {
        return setupMenuName;
    }

    public void setSetupMenuName(String setupMenuName) {
        this.setupMenuName = setupMenuName;
    }

    public String getSetupMenuLink() {
        return setupMenuLink;
    }

    public void setSetupMenuLink(String setupMenuLink) {
        this.setupMenuLink = setupMenuLink;
    }

    public String getSetupMenuImage() {
        return setupMenuImage;
    }

    public void setSetupMenuImage(String setupMenuImage) {
        this.setupMenuImage = setupMenuImage;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    public SetupHeaderMenu getSetupHeaderId() {
        return setupHeaderId;
    }

    public void setSetupHeaderId(SetupHeaderMenu setupHeaderId) {
        this.setupHeaderId = setupHeaderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (setupMenuMasterId != null ? setupMenuMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SetupMenuMaster)) {
            return false;
        }
        SetupMenuMaster other = (SetupMenuMaster) object;
        if ((this.setupMenuMasterId == null && other.setupMenuMasterId != null) || (this.setupMenuMasterId != null && !this.setupMenuMasterId.equals(other.setupMenuMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.SetupMenuMaster[ setupMenuMasterId=" + setupMenuMasterId + " ]";
    }
    
}
