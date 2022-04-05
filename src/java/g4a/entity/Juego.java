/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g4a.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gil
 */
@Entity
@Table(name = "JUEGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juego.findAll", query = "SELECT j FROM Juego j"),
    @NamedQuery(name = "Juego.findByJuegoId", query = "SELECT j FROM Juego j WHERE j.juegoId = :juegoId"),
    @NamedQuery(name = "Juego.findByNombre", query = "SELECT j FROM Juego j WHERE j.nombre = :nombre")})
public class Juego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JUEGO_ID")
    private Integer juegoId;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juegoId")
    private List<Ranking> rankingList;

    public Juego() {
    }

    public Juego(Integer juegoId) {
        this.juegoId = juegoId;
    }

    public Juego(Integer juegoId, String nombre) {
        this.juegoId = juegoId;
        this.nombre = nombre;
    }

    public Integer getJuegoId() {
        return juegoId;
    }

    public void setJuegoId(Integer juegoId) {
        this.juegoId = juegoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Ranking> getRankingList() {
        return rankingList;
    }

    public void setRankingList(List<Ranking> rankingList) {
        this.rankingList = rankingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (juegoId != null ? juegoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juego)) {
            return false;
        }
        Juego other = (Juego) object;
        if ((this.juegoId == null && other.juegoId != null) || (this.juegoId != null && !this.juegoId.equals(other.juegoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "g4a.entity.Juego[ juegoId=" + juegoId + " ]";
    }
    
}
