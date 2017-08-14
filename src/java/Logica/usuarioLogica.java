/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Usuario;
import Persistencia.UsuarioFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class usuarioLogica implements usuarioLogicaLocal {
    @EJB
    private UsuarioFacadeLocal usuFacade;

    @Override
    public void crearUsuario(Usuario usu) throws Exception {
        usuFacade.create(usu);
    }

    @Override
    public void modificarUsuario(Usuario usu) throws Exception {
        usuFacade.edit(usu);
    }

    @Override
    public void eliminarUsuario(Usuario usu) throws Exception {
        usuFacade.remove(usu);
    }

    @Override
    public Usuario consultarUsuario(String idUsu) throws Exception {
        return usuFacade.find(idUsu);
    }

    @Override
    public List<Usuario> usuarios() throws Exception {
        return usuFacade.findAll();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Usuario consultarUsuariobyCedula(String cedulaUsu) throws Exception {
        System.out.println("Logica.usuarioLogica.consultarUsuariobyCedula()----------> Buscando");
        Usuario user=new Usuario();
        List<Usuario> listaUser=usuFacade.findAll();
        for (int i = 0; i < usuFacade.count(); i++) {
            if((listaUser.get(i).getCedulaUsuario()).equals(cedulaUsu)){
                user=listaUser.get(i);
            }
        }
        System.out.println("Logica.usuarioLogica.consultarUsuariobyCedula()----------> Saliendo");
        return user;
    }
}
