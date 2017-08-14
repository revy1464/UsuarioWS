/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "perfiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfiles.findAll", query = "SELECT p FROM Perfiles p")
    , @NamedQuery(name = "Perfiles.findByIdPerfilUsuario", query = "SELECT p FROM Perfiles p WHERE p.idPerfilUsuario = :idPerfilUsuario")
    , @NamedQuery(name = "Perfiles.findByNombrePerfil", query = "SELECT p FROM Perfiles p WHERE p.nombrePerfil = :nombrePerfil")
    , @NamedQuery(name = "Perfiles.findByDescripcionPerfil", query = "SELECT p FROM Perfiles p WHERE p.descripcionPerfil = :descripcionPerfil")})
public class Perfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "idPerfil_Usuario")
    private String idPerfilUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nombre_Perfil")
    private String nombrePerfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion_Perfil")
    private String descripcionPerfil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilesidPerfilUsuario")
    private List<PerfilesModulos> perfilesModulosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilesidPerfilUsuario")
    private List<PerfilUsuario> perfilUsuarioList;

    public Perfiles() {
    }

    public Perfiles(String idPerfilUsuario) {
        this.idPerfilUsuario = idPerfilUsuario;
    }

    public Perfiles(String idPerfilUsuario, String nombrePerfil, String descripcionPerfil) {
        this.idPerfilUsuario = idPerfilUsuario;
        this.nombrePerfil = nombrePerfil;
        this.descripcionPerfil = descripcionPerfil;
    }

    public String getIdPerfilUsuario() {
        return idPerfilUsuario;
    }

    public void setIdPerfilUsuario(String idPerfilUsuario) {
        this.idPerfilUsuario = idPerfilUsuario;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }

    @XmlTransient
    public List<PerfilesModulos> getPerfilesModulosList() {
        return perfilesModulosList;
    }

    public void setPerfilesModulosList(List<PerfilesModulos> perfilesModulosList) {
        this.perfilesModulosList = perfilesModulosList;
    }

    @XmlTransient
    public List<PerfilUsuario> getPerfilUsuarioList() {
        return perfilUsuarioList;
    }

    public void setPerfilUsuarioList(List<PerfilUsuario> perfilUsuarioList) {
        this.perfilUsuarioList = perfilUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfilUsuario != null ? idPerfilUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfiles)) {
            return false;
        }
        Perfiles other = (Perfiles) object;
        if ((this.idPerfilUsuario == null && other.idPerfilUsuario != null) || (this.idPerfilUsuario != null && !this.idPerfilUsuario.equals(other.idPerfilUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idPerfilUsuario;
    }
    
}
