/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.PerfilUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface perfilesUsuarioLogicaLocal {
    public void crearPerfilUsuario(PerfilUsuario peru) throws Exception;
    public void modificarPerfilUsuario(PerfilUsuario peru) throws Exception;
    public void eliminarPerfilUsuario(PerfilUsuario peru) throws Exception;
    public PerfilUsuario consultarPeru(int idPeru) throws Exception;
    public List<PerfilUsuario> consultarPeruByUser(int idUsuario) throws Exception;
    public List<PerfilUsuario> perus() throws Exception;
}
