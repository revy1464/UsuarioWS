/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
 * @author Usuario
 */
@Entity
@Table(name = "perfiles_modulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilesModulos.findAll", query = "SELECT p FROM PerfilesModulos p")
    , @NamedQuery(name = "PerfilesModulos.findByIdPerfilesModulos", query = "SELECT p FROM PerfilesModulos p WHERE p.idPerfilesModulos = :idPerfilesModulos")})
public class PerfilesModulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPerfiles_Modulos")
    private Integer idPerfilesModulos;
    @JoinColumn(name = "Modulos_idModulos", referencedColumnName = "idModulos")
    @ManyToOne(optional = false)
    private Modulos modulosidModulos;
    @JoinColumn(name = "Perfiles_idPerfil_Usuario", referencedColumnName = "idPerfil_Usuario")
    @ManyToOne(optional = false)
    private Perfiles perfilesidPerfilUsuario;

    public PerfilesModulos() {
    }

    public PerfilesModulos(Integer idPerfilesModulos) {
        this.idPerfilesModulos = idPerfilesModulos;
    }

    public Integer getIdPerfilesModulos() {
        return idPerfilesModulos;
    }

    public void setIdPerfilesModulos(Integer idPerfilesModulos) {
        this.idPerfilesModulos = idPerfilesModulos;
    }

    public Modulos getModulosidModulos() {
        return modulosidModulos;
    }

    public void setModulosidModulos(Modulos modulosidModulos) {
        this.modulosidModulos = modulosidModulos;
    }

    public Perfiles getPerfilesidPerfilUsuario() {
        return perfilesidPerfilUsuario;
    }

    public void setPerfilesidPerfilUsuario(Perfiles perfilesidPerfilUsuario) {
        this.perfilesidPerfilUsuario = perfilesidPerfilUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfilesModulos != null ? idPerfilesModulos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilesModulos)) {
            return false;
        }
        PerfilesModulos other = (PerfilesModulos) object;
        if ((this.idPerfilesModulos == null && other.idPerfilesModulos != null) || (this.idPerfilesModulos != null && !this.idPerfilesModulos.equals(other.idPerfilesModulos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.PerfilesModulos[ idPerfilesModulos=" + idPerfilesModulos + " ]";
    }
    
}
