/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface usuarioLogicaLocal {
    public void crearUsuario(Usuario usu) throws Exception;
    public void modificarUsuario(Usuario usu) throws Exception;
    public void eliminarUsuario(Usuario usu) throws Exception;
    public Usuario consultarUsuario(String idUsu) throws Exception;
    public Usuario consultarUsuariobyCedula(String cedulaUsu) throws Exception;
    public List<Usuario> usuarios() throws Exception;
}
