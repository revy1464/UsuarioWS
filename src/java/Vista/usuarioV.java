/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.usuarioLogicaLocal;
import Modelo.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Usuario
 */
@ManagedBean(name = "usuarioV")
@RequestScoped
public class usuarioV {
    
    @EJB
    private usuarioLogicaLocal usuarioLogica;
    
    private InputText txtId; 
    private InputText txtNombre;
    private InputText txtApellido;
    private InputText txtTelefono;
    
    private CommandButton btnRegistrar;
    private CommandButton btnModificar;
    private CommandButton btnEliminar;
    private CommandButton btnConsultar;
    
    private List<Usuario> listaUsuario;
    private List<Usuario> filteredUser;

    /**
     * Creates a new instance of clienteV
     */
    public usuarioV() {
        
    }
    
    @PostConstruct
    public void init(){
        try {
            listaUsuario=usuarioLogica.usuarios();
        } catch (Exception ex) {
            Logger.getLogger(usuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public usuarioLogicaLocal getUsuarioLogica() {
        return usuarioLogica;
    }

    public void setUsuarioLogica(usuarioLogicaLocal usuarioLogica) {
        this.usuarioLogica = usuarioLogica;
    }

    public InputText getTxtId() {
        return txtId;
    }

    public void setTxtId(InputText txtId) {
        this.txtId = txtId;
    }

    public InputText getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(InputText txtNombre) {
        this.txtNombre = txtNombre;
    }

    public InputText getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(InputText txtApellido) {
        this.txtApellido = txtApellido;
    }

    public InputText getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(InputText txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public CommandButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(CommandButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public CommandButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(CommandButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public CommandButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(CommandButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public CommandButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(CommandButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuario = listaUsuarios;
    }

    public List<Usuario> getFilteredUser() {
        return filteredUser;
    }

    public void setFilteredUser(List<Usuario> filteredUser) {
        this.filteredUser = filteredUser;
    }
    public void onRowEdit(RowEditEvent event) {
        try {
            Usuario user=(Usuario) event.getObject();
            usuarioLogica.modificarUsuario(user);
            FacesMessage msg = new FacesMessage("Usuario Editado", ((Usuario) event.getObject()).getIdUsuario().toString());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception ex) {
            Logger.getLogger(usuarioV.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Mensaje", new FacesMessage(ex.getMessage()));
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Usuario) event.getObject()).getIdUsuario().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    
}
