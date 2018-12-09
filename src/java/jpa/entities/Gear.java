/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rickaguayo
 */
@Entity
@Table(name = "GEAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gear.findAll", query = "SELECT g FROM Gear g")
    , @NamedQuery(name = "Gear.findByGearId", query = "SELECT g FROM Gear g WHERE g.gearId = :gearId")
    , @NamedQuery(name = "Gear.findByTitle", query = "SELECT g FROM Gear g WHERE g.title = :title")})
public class Gear implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GEAR_ID")
    private Integer gearId;
    @Column(name = "TITLE", length = 256)
    private String title;
    @Lob
    @Column(name = "NOTES", length = 32700)
    private String notes;
    @JoinColumn(name = "AMP_ID", referencedColumnName = "AMP_ID")
    @ManyToOne
    private Amp ampId;
    @JoinColumn(name = "GUITAR_ID", referencedColumnName = "GUITAR_ID")
    @ManyToOne
    private Guitar guitarId;

    public Gear() {
    }

    public Gear(Integer gearId) {
        this.gearId = gearId;
    }

    public Integer getGearId() {
        return gearId;
    }

    public void setGearId(Integer gearId) {
        this.gearId = gearId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Amp getAmpId() {
        return ampId;
    }

    public void setAmpId(Amp ampId) {
        this.ampId = ampId;
    }

    public Guitar getGuitarId() {
        return guitarId;
    }

    public void setGuitarId(Guitar guitarId) {
        this.guitarId = guitarId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gearId != null ? gearId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gear)) {
            return false;
        }
        Gear other = (Gear) object;
        if ((this.gearId == null && other.gearId != null) || (this.gearId != null && !this.gearId.equals(other.gearId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Gear[ gearId=" + gearId + " ]";
    }
    
}
