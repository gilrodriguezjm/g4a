/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g4a.entity;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gil
 */
@Entity
@Table(name = "RANKING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ranking.findAll", query = "SELECT r FROM Ranking r"),
    @NamedQuery(name = "Ranking.findByRankingId", query = "SELECT r FROM Ranking r WHERE r.rankingId = :rankingId"),
    @NamedQuery(name = "Ranking.findByAlta", query = "SELECT r FROM Ranking r WHERE r.alta = :alta"),
    @NamedQuery(name = "Ranking.findByUltima", query = "SELECT r FROM Ranking r WHERE r.ultima = :ultima")})
public class Ranking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RANKING_ID")
    private Integer rankingId;
    @Basic(optional = false)
    @Column(name = "ALTA")
    private int alta;
    @Basic(optional = false)
    @Column(name = "ULTIMA")
    private int ultima;
    @JoinColumn(name = "JUEGO_ID", referencedColumnName = "JUEGO_ID")
    @ManyToOne(optional = false)
    private Juego juegoId;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false)
    private Usuario usuarioId;

    public Ranking() {
    }

    public Ranking(Integer rankingId) {
        this.rankingId = rankingId;
    }

    public Ranking(Integer rankingId, int alta, int ultima) {
        this.rankingId = rankingId;
        this.alta = alta;
        this.ultima = ultima;
    }

    public Integer getRankingId() {
        return rankingId;
    }

    public void setRankingId(Integer rankingId) {
        this.rankingId = rankingId;
    }

    public int getAlta() {
        return alta;
    }

    public void setAlta(int alta) {
        this.alta = alta;
    }

    public int getUltima() {
        return ultima;
    }

    public void setUltima(int ultima) {
        this.ultima = ultima;
    }

    public Juego getJuegoId() {
        return juegoId;
    }

    public void setJuegoId(Juego juegoId) {
        this.juegoId = juegoId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rankingId != null ? rankingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ranking)) {
            return false;
        }
        Ranking other = (Ranking) object;
        if ((this.rankingId == null && other.rankingId != null) || (this.rankingId != null && !this.rankingId.equals(other.rankingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "g4a.entity.Ranking[ rankingId=" + rankingId + " ]";
    }
    
}
