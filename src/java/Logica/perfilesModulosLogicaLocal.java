/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.PerfilesModulos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface perfilesModulosLogicaLocal {
    public void crearPerfilesModulos(PerfilesModulos permo) throws Exception;
    public void modificarPerfilesModulos(PerfilesModulos permo) throws Exception;
    public void eliminarPerfilesModulos(PerfilesModulos permo) throws Exception;
    public PerfilesModulos consultarPermo(String idPermo) throws Exception;
    public List<PerfilesModulos> consultarPermobyModulos(String idPermo) throws Exception;
    public List<PerfilesModulos> consultarPermobyPerfiles(String idPermo) throws Exception;
    public PerfilesModulos consultarPermobyModuloPerfil(String idMod, String idPer) throws Exception;
    public List<PerfilesModulos> permos() throws Exception;
}
