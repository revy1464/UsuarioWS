/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Perfiles;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface perfilesLogicaLocal {
        public void crearPerfil(Perfiles per) throws Exception;
    public void modificarPerfil(Perfiles per) throws Exception;
    public void eliminarPerfil(Perfiles per) throws Exception;
    public Perfiles consultarPerfil(String idPer) throws Exception;
    public List<Perfiles> perfiles() throws Exception;
}
