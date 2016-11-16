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
 * @author bargunan
 */
@Entity
@Table(name = "header_image_path")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HeaderImagePath.findAll", query = "SELECT h FROM HeaderImagePath h"),
    @NamedQuery(name = "HeaderImagePath.findByHeadeImagePathId", query = "SELECT h FROM HeaderImagePath h WHERE h.headeImagePathId = :headeImagePathId"),
    @NamedQuery(name = "HeaderImagePath.findByFilepath", query = "SELECT h FROM HeaderImagePath h WHERE h.filepath = :filepath")})
public class HeaderImagePath implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "heade_image_path_id")
    private Integer headeImagePathId;
    @Basic(optional = false)
    @Column(name = "filepath")
    private String filepath;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private StatusMaster statusId;
    @JoinColumn(name = "hospital_id", referencedColumnName = "hospital_id")
    @ManyToOne(optional = false)
    private HospitalMaster hospitalId;

    public HeaderImagePath() {
    }

    public HeaderImagePath(Integer headeImagePathId) {
        this.headeImagePathId = headeImagePathId;
    }

    public HeaderImagePath(Integer headeImagePathId, String filepath) {
        this.headeImagePathId = headeImagePathId;
        this.filepath = filepath;
    }

    public Integer getHeadeImagePathId() {
        return headeImagePathId;
    }

    public void setHeadeImagePathId(Integer headeImagePathId) {
        this.headeImagePathId = headeImagePathId;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (headeImagePathId != null ? headeImagePathId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HeaderImagePath)) {
            return false;
        }
        HeaderImagePath other = (HeaderImagePath) object;
        if ((this.headeImagePathId == null && other.headeImagePathId != null) || (this.headeImagePathId != null && !this.headeImagePathId.equals(other.headeImagePathId))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "javaapplication42.HeaderImagePath[ headeImagePathId=" + headeImagePathId + " ]";
    }
    
}
