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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jayamurugan
 */
@Entity
@Table(name = "url_navigation_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UrlNavigationMaster.findAll", query = "SELECT u FROM UrlNavigationMaster u"),
    @NamedQuery(name = "UrlNavigationMaster.findByUrlId", query = "SELECT u FROM UrlNavigationMaster u WHERE u.urlId = :urlId")})
public class UrlNavigationMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "url_id")
    private Integer urlId;
    @Lob
    @Column(name = "url")
    private String url;
    @Lob
    @Column(name = "navigation")
    private String navigation;
    @Lob
    @Column(name = "menu")
    private String menu;
    
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne
    private StatusMaster statusId;

    public UrlNavigationMaster() {
    }

    public UrlNavigationMaster(Integer urlId) {
        this.urlId = urlId;
    }

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }
    
    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (urlId != null ? urlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UrlNavigationMaster)) {
            return false;
        }
        UrlNavigationMaster other = (UrlNavigationMaster) object;
        if ((this.urlId == null && other.urlId != null) || (this.urlId != null && !this.urlId.equals(other.urlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.UrlNavigationMaster[ urlId=" + urlId + " ]";
    }
    
}
