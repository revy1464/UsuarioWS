/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Modulos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface moduloLogicaLocal {
    public void crearModulo(Modulos mod) throws Exception;
    public void modificarModulo(Modulos mod) throws Exception;
    public void eliminarModulo(Modulos mod) throws Exception;
    public Modulos consultarModulo(String idMod) throws Exception;
    public List<Modulos> modulos() throws Exception;
}
