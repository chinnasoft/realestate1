/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author anand
 */
@Entity
@Table(name = "menu_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuMaster.findAll", query = "SELECT m FROM MenuMaster m"),
    @NamedQuery(name = "MenuMaster.findByMenuId", query = "SELECT m FROM MenuMaster m WHERE m.menuId = :menuId"),
    @NamedQuery(name = "MenuMaster.findByMenuName", query = "SELECT m FROM MenuMaster m WHERE m.menuName = :menuName"),
    @NamedQuery(name = "MenuMaster.findByLink", query = "SELECT m FROM MenuMaster m WHERE m.link = :link"),
    @NamedQuery(name = "MenuMaster.findByMenuType", query = "SELECT m FROM MenuMaster m WHERE m.menuType = :menuType"),
    @NamedQuery(name = "MenuMaster.findByGroupHead", query = "SELECT m FROM MenuMaster m WHERE m.groupHead = :groupHead"),
    @NamedQuery(name = "MenuMaster.findBySubGroupHead", query = "SELECT m FROM MenuMaster m WHERE m.subGroupHead = :subGroupHead"),
    @NamedQuery(name = "MenuMaster.findByPriorityId", query = "SELECT m FROM MenuMaster m WHERE m.priorityId = :priorityId"),
    @NamedQuery(name = "MenuMaster.findByMenuUrlName", query = "SELECT m FROM MenuMaster m WHERE m.menuUrlName = :menuUrlName")})
public class MenuMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "menu_id", nullable = false)
    private Integer menuId;
    @Basic(optional = false)
    @Column(name = "menu_name")
    private String menuName;
    @Column(name = "link")
    private String link;
    @Basic(optional = false)
    @Column(name = "menu_type")
    private String menuType;
    @Column(name = "group_head")
    private Integer groupHead;
    @Column(name = "sub_group_head")
    private Integer subGroupHead;
    @Basic(optional = false)
    @Column(name = "priority_id")
    private int priorityId;
    @Column(name = "menu_url_name")
    private String menuUrlName;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;

    public MenuMaster() {
    }

    public MenuMaster(Integer menuId) {
        this.menuId = menuId;
    }

    public MenuMaster(Integer menuId, String menuName, String menuType, int priorityId) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuType = menuType;
        this.priorityId = priorityId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public Integer getGroupHead() {
        return groupHead;
    }

    public void setGroupHead(Integer groupHead) {
        this.groupHead = groupHead;
    }

    public Integer getSubGroupHead() {
        return subGroupHead;
    }

    public void setSubGroupHead(Integer subGroupHead) {
        this.subGroupHead = subGroupHead;
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public String getMenuUrlName() {
        return menuUrlName;
    }

    public void setMenuUrlName(String menuUrlName) {
        this.menuUrlName = menuUrlName;
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
        hash += (menuId != null ? menuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuMaster)) {
            return false;
        }
        MenuMaster other = (MenuMaster) object;
        if ((this.menuId == null && other.menuId != null) || (this.menuId != null && !this.menuId.equals(other.menuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ariel.hmserp.entity.models.MenuMaster[ menuId=" + menuId + " ]";
    }
    
}
