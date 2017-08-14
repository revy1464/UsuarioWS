/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.PerfilUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PerfilUsuarioFacadeLocal {

    void create(PerfilUsuario perfilUsuario);

    void edit(PerfilUsuario perfilUsuario);

    void remove(PerfilUsuario perfilUsuario);

    PerfilUsuario find(Object id);

    List<PerfilUsuario> findAll();

    List<PerfilUsuario> findRange(int[] range);

    int count();
    
}
