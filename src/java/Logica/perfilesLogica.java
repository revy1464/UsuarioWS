/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Perfiles;
import Persistencia.PerfilesFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class perfilesLogica implements perfilesLogicaLocal {

    @EJB
    private PerfilesFacadeLocal perfilFacade;
    
    
    @Override
    public void crearPerfil(Perfiles per) throws Exception {
        perfilFacade.create(per);
    }

    @Override
    public void modificarPerfil(Perfiles per) throws Exception {
        perfilFacade.edit(per);
    }

    @Override
    public void eliminarPerfil(Perfiles per) throws Exception {
        perfilFacade.remove(per);
    }

    @Override
    public Perfiles consultarPerfil(String idPer) throws Exception {
        return perfilFacade.find(idPer);
    }

    @Override
    public List<Perfiles> perfiles() throws Exception {
        return perfilFacade.findAll();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
