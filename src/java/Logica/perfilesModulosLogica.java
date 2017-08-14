/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.PerfilesModulos;
import Persistencia.PerfilesModulosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class perfilesModulosLogica implements perfilesModulosLogicaLocal {
    
    @EJB
    private PerfilesModulosFacadeLocal permoFacade;

    @Override
    public void crearPerfilesModulos(PerfilesModulos permo) throws Exception {
        System.out.println("Logica.perfilesModulosLogica.crearPerfilesModulos() ID"+permo.getIdPerfilesModulos());
        permoFacade.create(permo);
    }

    @Override
    public void modificarPerfilesModulos(PerfilesModulos permo) throws Exception {
        permoFacade.edit(permo);
    }

    @Override
    public void eliminarPerfilesModulos(PerfilesModulos permo) throws Exception {
        permoFacade.remove(permo);
    }

    @Override
    public PerfilesModulos consultarPermo(String idPermo) throws Exception {
        return permoFacade.find(idPermo);
    }

    @Override
    public List<PerfilesModulos> permos() throws Exception {
        return permoFacade.findAll();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<PerfilesModulos> consultarPermobyModulos(String idPermo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PerfilesModulos> consultarPermobyPerfiles(String idPermo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PerfilesModulos consultarPermobyModuloPerfil(String idMod, String idPer) throws Exception {
        System.out.println("Logica.perfilesModulosLogica.consultarPermobyModuloPerfil()--->");
        String moduloId="";
        String perfilId="";
        PerfilesModulos permo= new PerfilesModulos();
        List<PerfilesModulos> permos =permoFacade.findAll();
        System.out.println("Logica.perfilesModulosLogica.consultarPermobyModuloPerfil()--->Buscando");
        for (int i = 0; i < permos.size(); i++) {
            moduloId=permos.get(i).getModulosidModulos().toString();
            perfilId=permos.get(i).getPerfilesidPerfilUsuario().toString();
            System.out.println("Logica.perfilesModulosLogica.consultarPermobyModuloPerfil()"+moduloId+" "+perfilId);
            if((moduloId.equalsIgnoreCase(idMod))&&(perfilId.equalsIgnoreCase(idPer))){
                System.out.println("Logica.perfilesModulosLogica.consultarPermobyModuloPerfil()--------> Encontrado");
                permo.setIdPerfilesModulos(permos.get(i).getIdPerfilesModulos());
                permo.setModulosidModulos(permos.get(i).getModulosidModulos());
                permo.setPerfilesidPerfilUsuario(permos.get(i).getPerfilesidPerfilUsuario());
            }
        }
        System.out.println("Logica.perfilesModulosLogica.consultarPermobyModuloPerfil()--->Saliendo");
        return permo;
    }
}
