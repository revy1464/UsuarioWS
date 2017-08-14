/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.PerfilUsuario;
import Persistencia.PerfilUsuarioFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class perfilesUsuarioLogica implements perfilesUsuarioLogicaLocal {
    
    @EJB
    private PerfilUsuarioFacadeLocal perfilUsuarioFacade;

    @Override
    public void crearPerfilUsuario(PerfilUsuario peru) throws Exception {
        perfilUsuarioFacade.create(peru);
    }

    @Override
    public void modificarPerfilUsuario(PerfilUsuario peru) throws Exception {
        perfilUsuarioFacade.edit(peru);
    }

    @Override
    public void eliminarPerfilUsuario(PerfilUsuario peru) throws Exception {
        perfilUsuarioFacade.remove(peru);
    }

    @Override
    public PerfilUsuario consultarPeru(int idPeru) throws Exception {
        return perfilUsuarioFacade.find(idPeru);
    }

    @Override
    public List<PerfilUsuario> perus() throws Exception {
        return perfilUsuarioFacade.findAll();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<PerfilUsuario> consultarPeruByUser(int idUsuario) throws Exception {
        int usuarioId;
        PerfilUsuario peru= new PerfilUsuario();
        List<PerfilUsuario> perus =perfilUsuarioFacade.findAll();
        List<PerfilUsuario> perusIdUser=new ArrayList<PerfilUsuario>();
        
        for (int i = 0; i < perus.size(); i++) {
            usuarioId=perus.get(i).getUsuarioidUsuario().getIdUsuario();
                      
            if(usuarioId==idUsuario){
                System.out.println("Logica.perfilesUsuarioLogica.consultarPeruByUser()--->"+perus.get(i).getUsuarioidUsuario());
                peru.setIdPerfilUsuario(perus.get(i).getIdPerfilUsuario());
                peru.setUsuarioidUsuario(perus.get(i).getUsuarioidUsuario());
                peru.setPerfilesidPerfilUsuario(perus.get(i).getPerfilesidPerfilUsuario());
                perusIdUser.add(peru);
            }
        }
        return perusIdUser;
    }

}
