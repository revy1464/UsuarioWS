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
@Table(name = "modulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulos.findAll", query = "SELECT m FROM Modulos m")
    , @NamedQuery(name = "Modulos.findByIdModulos", query = "SELECT m FROM Modulos m WHERE m.idModulos = :idModulos")
    , @NamedQuery(name = "Modulos.findByNombreModulo", query = "SELECT m FROM Modulos m WHERE m.nombreModulo = :nombreModulo")
    , @NamedQuery(name = "Modulos.findByDescripcionModulo", query = "SELECT m FROM Modulos m WHERE m.descripcionModulo = :descripcionModulo")})
public class Modulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "idModulos")
    private String idModulos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_modulo")
    private String nombreModulo;
    @Size(max = 150)
    @Column(name = "descripcion_modulo")
    private String descripcionModulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modulosidModulos")
    private List<PerfilesModulos> perfilesModulosList;

    public Modulos() {
    }

    public Modulos(String idModulos) {
        this.idModulos = idModulos;
    }

    public Modulos(String idModulos, String nombreModulo) {
        this.idModulos = idModulos;
        this.nombreModulo = nombreModulo;
    }

    public String getIdModulos() {
        return idModulos;
    }

    public void setIdModulos(String idModulos) {
        this.idModulos = idModulos;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getDescripcionModulo() {
        return descripcionModulo;
    }

    public void setDescripcionModulo(String descripcionModulo) {
        this.descripcionModulo = descripcionModulo;
    }

    @XmlTransient
    public List<PerfilesModulos> getPerfilesModulosList() {
        return perfilesModulosList;
    }

    public void setPerfilesModulosList(List<PerfilesModulos> perfilesModulosList) {
        this.perfilesModulosList = perfilesModulosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModulos != null ? idModulos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulos)) {
            return false;
        }
        Modulos other = (Modulos) object;
        if ((this.idModulos == null && other.idModulos != null) || (this.idModulos != null && !this.idModulos.equals(other.idModulos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idModulos;
    }
    
}
