/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rickaguayo
 */
@Entity
@Table(name = "AMP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Amp.findAll", query = "SELECT a FROM Amp a")
    , @NamedQuery(name = "Amp.findByAmpId", query = "SELECT a FROM Amp a WHERE a.ampId = :ampId")
    , @NamedQuery(name = "Amp.findByBrand", query = "SELECT a FROM Amp a WHERE a.brand = :brand")
    , @NamedQuery(name = "Amp.findByModel", query = "SELECT a FROM Amp a WHERE a.model = :model")})
public class Amp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AMP_ID")
    private Integer ampId;
    @Column(name = "BRAND", length = 32)
    private String brand;
    @Column(name = "MODEL", length = 64)
    private String model;
    @OneToMany(mappedBy = "ampId")
    private Collection<Gear> gearCollection;

    public Amp() {
    }

    public Amp(Integer ampId) {
        this.ampId = ampId;
    }

    public Integer getAmpId() {
        return ampId;
    }

    public void setAmpId(Integer ampId) {
        this.ampId = ampId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @XmlTransient
    public Collection<Gear> getGearCollection() {
        return gearCollection;
    }

    public void setGearCollection(Collection<Gear> gearCollection) {
        this.gearCollection = gearCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ampId != null ? ampId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Amp)) {
            return false;
        }
        Amp other = (Amp) object;
        if ((this.ampId == null && other.ampId != null) || (this.ampId != null && !this.ampId.equals(other.ampId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//        return "jpa.entities.Amp[ ampId=" + ampId + " ]";
        return this.brand + " " + this.model;
    }
    
}
