/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.PerfilesModulos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PerfilesModulosFacadeLocal {

    void create(PerfilesModulos perfilesModulos);

    void edit(PerfilesModulos perfilesModulos);

    void remove(PerfilesModulos perfilesModulos);

    PerfilesModulos find(Object id);

    List<PerfilesModulos> findAll();

    List<PerfilesModulos> findRange(int[] range);

    int count();
    
}
