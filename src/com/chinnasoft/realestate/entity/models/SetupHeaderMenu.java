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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author babu
 */
@Entity
@Table(name = "setup_header_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SetupHeaderMenu.findAll", query = "SELECT s FROM SetupHeaderMenu s"),
    @NamedQuery(name = "SetupHeaderMenu.findBySetupHeaderMenuId", query = "SELECT s FROM SetupHeaderMenu s WHERE s.setupHeaderMenuId = :setupHeaderMenuId"),
    @NamedQuery(name = "SetupHeaderMenu.findBySetupHeaderName", query = "SELECT s FROM SetupHeaderMenu s WHERE s.setupHeaderName = :setupHeaderName"),
    @NamedQuery(name = "SetupHeaderMenu.findBySetupHeaderImage", query = "SELECT s FROM SetupHeaderMenu s WHERE s.setupHeaderImage = :setupHeaderImage")})
@JsonIgnoreProperties(value={"setupMenuMasterList"})
public class SetupHeaderMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "setupHeaderId")
    private List<SetupMenuMaster> setupMenuMasterList;

    public SetupHeaderMenu() {
    }

    public SetupHeaderMenu(Integer setupHeaderMenuId) {
        this.setupHeaderMenuId = setupHeaderMenuId;
    }

    public SetupHeaderMenu(Integer setupHeaderMenuId, String setupHeaderName) {
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

    @XmlTransient
    public List<SetupMenuMaster> getSetupMenuMasterList() {
        return setupMenuMasterList;
    }

    public void setSetupMenuMasterList(List<SetupMenuMaster> setupMenuMasterList) {
        this.setupMenuMasterList = setupMenuMasterList;
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
        if (!(object instanceof SetupHeaderMenu)) {
            return false;
        }
        SetupHeaderMenu other = (SetupHeaderMenu) object;
        if ((this.setupHeaderMenuId == null && other.setupHeaderMenuId != null) || (this.setupHeaderMenuId != null && !this.setupHeaderMenuId.equals(other.setupHeaderMenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.SetupHeaderMenu[ setupHeaderMenuId=" + setupHeaderMenuId + " ]";
    }
    
}
