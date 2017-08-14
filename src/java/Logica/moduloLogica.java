/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Modulos;
import Persistencia.ModulosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class moduloLogica implements moduloLogicaLocal {

    @EJB
    private ModulosFacadeLocal modFacade;
    
    @Override
    public void crearModulo(Modulos mod) throws Exception {
        modFacade.create(mod);
    }

    @Override
    public void modificarModulo(Modulos mod) throws Exception {
        modFacade.edit(mod);
    }

    @Override
    public void eliminarModulo(Modulos mod) throws Exception {
        modFacade.remove(mod);
    }

    @Override
    public Modulos consultarModulo(String idMod) throws Exception {
        return modFacade.find(idMod);
    }

    @Override
    public List<Modulos> modulos() throws Exception {
        return modFacade.findAll();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
