package com.chinnasoft.realestate.entity.models;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author chinnaiah
 */
@Entity
@Table(name = "department_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DepartmentStatus.findAll", query = "SELECT d FROM DepartmentStatus d"),
    @NamedQuery(name = "DepartmentStatus.findByDepartStatusId", query = "SELECT d FROM DepartmentStatus d WHERE d.departStatusId = :departStatusId"),
    @NamedQuery(name = "DepartmentStatus.findByDescription", query = "SELECT d FROM DepartmentStatus d WHERE d.description = :description")})
@JsonIgnoreProperties(value={ "departmentMasterList"})
public class DepartmentStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "depart_status_id")
    private Integer departStatusId;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deaptStatusId")
    private List<DepartmentMaster> departmentMasterList;

    public DepartmentStatus() {
    }

    public DepartmentStatus(Integer departStatusId) {
        this.departStatusId = departStatusId;
    }

    public DepartmentStatus(Integer departStatusId, String description) {
        this.departStatusId = departStatusId;
        this.description = description;
    }

    public Integer getDepartStatusId() {
        return departStatusId;
    }

    public void setDepartStatusId(Integer departStatusId) {
        this.departStatusId = departStatusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusMaster getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusMaster statusId) {
        this.statusId = statusId;
    }

    @XmlTransient
    public List<DepartmentMaster> getDepartmentMasterList() {
        return departmentMasterList;
    }

    public void setDepartmentMasterList(List<DepartmentMaster> departmentMasterList) {
        this.departmentMasterList = departmentMasterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departStatusId != null ? departStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartmentStatus)) {
            return false;
        }
        DepartmentStatus other = (DepartmentStatus) object;
        if ((this.departStatusId == null && other.departStatusId != null) || (this.departStatusId != null && !this.departStatusId.equals(other.departStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "depd.DepartmentStatus[ departStatusId=" + departStatusId + " ]";
    }
    
}
