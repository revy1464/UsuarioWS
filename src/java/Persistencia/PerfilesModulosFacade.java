/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.PerfilesModulos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class PerfilesModulosFacade extends AbstractFacade<PerfilesModulos> implements PerfilesModulosFacadeLocal {

    @PersistenceContext(unitName = "UsuarioWSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PerfilesModulosFacade() {
        super(PerfilesModulos.class);
    }
    
}
