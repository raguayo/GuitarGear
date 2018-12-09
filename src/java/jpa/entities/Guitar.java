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
@Table(name = "GUITAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guitar.findAll", query = "SELECT g FROM Guitar g")
    , @NamedQuery(name = "Guitar.findByGuitarId", query = "SELECT g FROM Guitar g WHERE g.guitarId = :guitarId")
    , @NamedQuery(name = "Guitar.findByBrand", query = "SELECT g FROM Guitar g WHERE g.brand = :brand")
    , @NamedQuery(name = "Guitar.findByModel", query = "SELECT g FROM Guitar g WHERE g.model = :model")})
public class Guitar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GUITAR_ID")
    private Integer guitarId;
    @Column(name = "BRAND", length = 32)
    private String brand;
    @Column(name = "MODEL", length = 64)
    private String model;
    @OneToMany(mappedBy = "guitarId")
    private Collection<Gear> gearCollection;

    public Guitar() {
    }

    public Guitar(Integer guitarId) {
        this.guitarId = guitarId;
    }

    public Integer getGuitarId() {
        return guitarId;
    }

    public void setGuitarId(Integer guitarId) {
        this.guitarId = guitarId;
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
        hash += (guitarId != null ? guitarId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guitar)) {
            return false;
        }
        Guitar other = (Guitar) object;
        if ((this.guitarId == null && other.guitarId != null) || (this.guitarId != null && !this.guitarId.equals(other.guitarId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//        return "jpa.entities.Guitar[ guitarId=" + guitarId + " ]";
        return this.brand + " " + this.model;
    }
    
}
