/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.moduloLogicaLocal;
import Logica.perfilesLogicaLocal;
import Logica.perfilesModulosLogicaLocal;
import Modelo.Modulos;
import Modelo.Perfiles;
import Modelo.PerfilesModulos;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Usuario
 */
@ManagedBean(name = "perfilesUsuarioV")
@RequestScoped
public class perfilesUsuarioV {
    
    @EJB
    private moduloLogicaLocal modLogica;
    @EJB
    private perfilesLogicaLocal perLogica;
    @EJB
    private perfilesModulosLogicaLocal perModLogica;

    
    private SelectOneMenu cmbModulo; 
    private InputText txtIdModulo;
    private InputText txtNombreModulo;
    private InputText txtDescripcionModulo;
    
    private SelectOneMenu cmbPerfiles; 
    private InputText txtIdPerfil;
    private InputText txtNombrePerfil;
    private InputText txtDescripcionPerfil;
    
    private CommandButton btnRegistrarMod;
    private CommandButton btnModificarMod;
    private CommandButton btnEliminarMod;
    private CommandButton btnBuscarMod;
    
    private CommandButton btnRegistrarPer;
    private CommandButton btnModificarPer;
    private CommandButton btnEliminarPer;
    private CommandButton btnBuscarPer;
   
    private CommandButton btnAsignar;
    private CommandButton btnNegar;
    
    private String nameMod;
    private String namePer;
    private PerfilesModulos permoSelect;
    private PerfilesModulos permoSelect1;

    private List<Modulos> listaModulos;
    private List<Perfiles> listaPerfiles;
    private List<PerfilesModulos> listaPermo;
    
    
    
  /**
     * Creates a new instance of perfilesUsuarioV
     */
    public perfilesUsuarioV() {
    }

    public SelectOneMenu getCmbPerfiles() {
        return cmbPerfiles;
    }

    public void setCmbPerfiles(SelectOneMenu cmbPerfiles) {
        this.cmbPerfiles = cmbPerfiles;
    }

    public InputText getTxtIdPerfil() {
        return txtIdPerfil;
    }

    public void setTxtIdPerfil(InputText txtIdPerfil) {
        this.txtIdPerfil = txtIdPerfil;
    }

    public InputText getTxtNombrePerfil() {
        return txtNombrePerfil;
    }

    public void setTxtNombrePerfil(InputText txtNombrePerfil) {
        this.txtNombrePerfil = txtNombrePerfil;
    }

    public InputText getTxtDescripcionPerfil() {
        return txtDescripcionPerfil;
    }

    public void setTxtDescripcionPerfil(InputText txtDescripcionPerfil) {
        this.txtDescripcionPerfil = txtDescripcionPerfil;
    }

    public CommandButton getBtnRegistrarPer() {
        return btnRegistrarPer;
    }

    public void setBtnRegistrarPer(CommandButton btnRegistrarPer) {
        this.btnRegistrarPer = btnRegistrarPer;
    }

    public CommandButton getBtnModificarPer() {
        return btnModificarPer;
    }

    public void setBtnModificarPer(CommandButton btnModificarPer) {
        this.btnModificarPer = btnModificarPer;
    }

    public CommandButton getBtnEliminarPer() {
        return btnEliminarPer;
    }

    public void setBtnEliminarPer(CommandButton btnEliminarPer) {
        this.btnEliminarPer = btnEliminarPer;
    }

    public CommandButton getBtnBuscarPer() {
        return btnBuscarPer;
    }

    public void setBtnBuscarPer(CommandButton btnBuscarPer) {
        this.btnBuscarPer = btnBuscarPer;
    }

    public String getNamePer() {
        return namePer;
    }

    public void setNamePer(String namePer) {
        this.namePer = namePer;
    }
    
    public String getNameMod() {
        return nameMod;
    }

    public void setNameMod(String nameMod) {
        this.nameMod = nameMod;
    }

    public moduloLogicaLocal getModLogica() {
        return modLogica;
    }

    public void setModLogica(moduloLogicaLocal modLogica) {
        this.modLogica = modLogica;
    }

    public SelectOneMenu getCmbModulo() {
        return cmbModulo;
    }

    public void setCmbModulo(SelectOneMenu cmbModulo) {
        this.cmbModulo = cmbModulo;
    }

    public InputText getTxtIdModulo() {
        return txtIdModulo;
    }

    public void setTxtIdModulo(InputText txtIdModulo) {
        this.txtIdModulo = txtIdModulo;
    }

    public InputText getTxtNombreModulo() {
        return txtNombreModulo;
    }

    public void setTxtNombreModulo(InputText txtNombreModulo) {
        this.txtNombreModulo = txtNombreModulo;
    }

    public InputText getTxtDescripcionModulo() {
        return txtDescripcionModulo;
    }

    public void setTxtDescripcionModulo(InputText txtDescripcionModulo) {
        this.txtDescripcionModulo = txtDescripcionModulo;
    }

    public CommandButton getBtnRegistrarMod() {
        return btnRegistrarMod;
    }

    public void setBtnRegistrarMod(CommandButton btnRegistrarMod) {
        this.btnRegistrarMod = btnRegistrarMod;
    }

    public CommandButton getBtnModificarMod() {
        return btnModificarMod;
    }

    public void setBtnModificarMod(CommandButton btnModificarMod) {
        this.btnModificarMod = btnModificarMod;
    }

    public CommandButton getBtnEliminarMod() {
        return btnEliminarMod;
    }

    public void setBtnEliminarMod(CommandButton btnEliminarMod) {
        this.btnEliminarMod = btnEliminarMod;
    }

    public CommandButton getBtnBuscarMod() {
        return btnBuscarMod;
    }

    public void setBtnBuscarMod(CommandButton btnBuscarMod) {
        this.btnBuscarMod = btnBuscarMod;
    }

    public perfilesModulosLogicaLocal getPerModLogica() {
        return perModLogica;
    }

    public void setPerModLogica(perfilesModulosLogicaLocal perModLogica) {
        this.perModLogica = perModLogica;
    }

    public PerfilesModulos getPermoSelect1() {
        return permoSelect1;
    }

    public void setPermoSelect1(PerfilesModulos permoSelect1) {
        this.permoSelect1 = permoSelect1;
    }
    
    

    public List<Modulos> getListaModulos() {
        try {
            listaModulos=modLogica.modulos();
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaModulos;
    }

    public void setListaModulos(List<Modulos> listaModulos) {
        this.listaModulos = listaModulos;
    }

    public CommandButton getBtnAsignar() {
        return btnAsignar;
    }

    public void setBtnAsignar(CommandButton btnAsignar) {
        this.btnAsignar = btnAsignar;
    }

    public CommandButton getBtnNegar() {
        return btnNegar;
    }

    public void setBtnNegar(CommandButton btnNegar) {
        this.btnNegar = btnNegar;
    }

    public PerfilesModulos getPermoSelect() {
        return permoSelect;
    }

    public void setPermoSelect(PerfilesModulos permoSelect) {
        this.permoSelect = permoSelect;
    }
    

    public List<PerfilesModulos> getListaPermo() {
        try {
            listaPermo=perModLogica.permos();
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPermo;
    }

    public void setListaPermo(List<PerfilesModulos> listaPermo) {
        this.listaPermo = listaPermo;
    }
    
    
    public void modificarMod(){
        try {
            Modulos mod=modLogica.consultarModulo(getNameMod());
            mod.setNombreModulo(txtNombreModulo.getValue().toString());
            mod.setDescripcionModulo(txtDescripcionModulo.getValue().toString());
            modLogica.modificarModulo(mod);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarMod(){
        try {
            Modulos mod=modLogica.consultarModulo(getNameMod());
            modLogica.eliminarModulo(mod);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showSelectMod(){
        try {
            Modulos mod=modLogica.consultarModulo(getNameMod());
            System.out.println("Vista.perfilesUsuarioV.showSelectMod()" + mod.getNombreModulo());
            txtNombreModulo.setValue(mod.getNombreModulo());
            txtDescripcionModulo.setValue(mod.getDescripcionModulo());
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Perfiles> getListaPerfiles() {
        try {
            listaPerfiles=perLogica.perfiles();
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
            return listaPerfiles;
    }

    public void setListaPerfiles(List<Perfiles> listaPerfiles) {
        this.listaPerfiles = listaPerfiles;
    }
    
    public void modificarPer(){
        try {
            Perfiles per=perLogica.consultarPerfil(getNamePer());
            per.setNombrePerfil(txtNombrePerfil.getValue().toString());
            per.setDescripcionPerfil(txtDescripcionPerfil.getValue().toString());
            perLogica.modificarPerfil(per);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPer(){
        try {
            Perfiles per=perLogica.consultarPerfil(getNamePer());
            perLogica.eliminarPerfil(per);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showSelectPer(){
        try {
            Perfiles per =perLogica.consultarPerfil(getNamePer());
            txtNombrePerfil.setValue(per.getNombrePerfil());
            txtDescripcionPerfil.setValue(per.getDescripcionPerfil());
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public perfilesLogicaLocal getPerLogica() {
        return perLogica;
    }

    public void setPerLogica(perfilesLogicaLocal perLogica) {
        this.perLogica = perLogica;
    }
    
    public void registrarPer(){
        try {
            Perfiles perfil=perLogica.consultarPerfil(getNamePer());
            if(perfil!=null){
                FacesContext.getCurrentInstance().addMessage("Mensaje", new FacesMessage("Este registro ya existe"));
            }
            Perfiles per=new Perfiles(namePer, txtNombrePerfil.getValue().toString(),txtDescripcionPerfil.getValue().toString());
            perLogica.crearPerfil(per);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void registrarMod(){
        try {
            Modulos modulo=modLogica.consultarModulo(getNameMod());
            if(modulo!=null){
                FacesContext.getCurrentInstance().addMessage("Mensaje", new FacesMessage("Este registro ya existe"));
            }
            Modulos mod=new Modulos(nameMod, txtNombreModulo.getValue().toString());
            mod.setDescripcionModulo(txtDescripcionModulo.getValue().toString());
            modLogica.crearModulo(mod);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Mensaje", new FacesMessage(ex.getMessage()));
        }
    }
    
    public void asignarPermo(){
        try {
            PerfilesModulos permo=new PerfilesModulos();
            Modulos modulo= modLogica.consultarModulo(getNameMod());            
            Perfiles perfil=perLogica.consultarPerfil(getNamePer());
            Random rand = new Random(System.currentTimeMillis());
            permo.setModulosidModulos(modulo);            
            permo.setPerfilesidPerfilUsuario(perfil);                       
            perModLogica.crearPerfilesModulos(permo);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void negarPermo(){
        System.out.println("Vista.perfilesUsuarioV.negarPermo()--->Entrando");
        try {
            PerfilesModulos pm=new PerfilesModulos();
            System.out.println("Vista.perfilesUsuarioV.negarPermo()--->continuando"+getNameMod()+getNamePer());
            if((getNameMod()==null)||(getNamePer()==null)){
                System.out.println("Vista.perfilesUsuarioV.negarPermo()---> Entradas vacias");
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso","Debe espeficifcar un modulo y un perfil"));
            }else{
                pm= perModLogica.consultarPermobyModuloPerfil(getNameMod(),getNamePer());                              
            }
            if(pm==null){
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso","No existe una relaccion entre el modulo y perfil seleccionado"));
            }else{
                perModLogica.eliminarPerfilesModulos(pm);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso", "Asignacion realiza"));
            }
            
            
            btnNegar.setDisabled(true);
        } catch (Exception ex) {
            Logger.getLogger(perfilesUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showSelectPermo(){     
        
        setNameMod(permoSelect.getModulosidModulos().getIdModulos());
        txtNombreModulo.setValue(permoSelect.getModulosidModulos().getNombreModulo());
        txtDescripcionModulo.setValue(permoSelect.getModulosidModulos().getDescripcionModulo());
        
        setNamePer(permoSelect.getPerfilesidPerfilUsuario().getIdPerfilUsuario());
        txtNombrePerfil.setValue(permoSelect.getPerfilesidPerfilUsuario().getNombrePerfil());
        txtDescripcionPerfil.setValue(permoSelect.getPerfilesidPerfilUsuario().getDescripcionPerfil());
        
        btnNegar.setDisabled(false);
    }
}
