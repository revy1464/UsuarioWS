/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.perfilesLogicaLocal;
import Logica.perfilesUsuarioLogicaLocal;
import Logica.usuarioLogicaLocal;
import Modelo.PerfilUsuario;
import Modelo.Perfiles;
import Modelo.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.component.calendar.Calendar;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.password.Password;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import sun.invoke.empty.Empty;

/**
 *
 * @author Usuario
 */
@Named(value = "registroUsuarioV")
@RequestScoped
public class registroUsuarioV {

    private InputText txtCedula;
    private InputText txtNombre;
    private InputText txtApellido;
    private InputText txtDireccion;
    private InputText txtTelefono;
    private InputText txtCelular;
    private Calendar calFechaN;
    private InputText txtEmail;
    private InputText txtProfesion;
    private InputText txtUsuario; //Login
    private SelectOneMenu cmbPerfil;
    private Password txtContraseña;
    private Password txtContraseñaCheck;

    private CommandButton btnRegistrar;
    private CommandButton btnBuscar;
    private CommandButton btnModificar;
    private CommandButton btnEliminar;
    private CommandButton btnAsignarPerfil;

    private Usuario userSelect;

    @EJB
    private perfilesLogicaLocal perLogica;

    @EJB
    private usuarioLogicaLocal usuLogica;

    @EJB
    private perfilesUsuarioLogicaLocal peruLogica;

    private String name;
    private String namePer;
    private String password3;
    private Date date2;

    private List<Perfiles> listaPerfiles;
    private List<Usuario> listaUsuario;
    private List<Usuario> filteredUser;

    /**
     * Creates a new instance of registroUsuarioV
     */
    public registroUsuarioV() {

    }

    @PostConstruct
    public void init() {
        try {
            listaUsuario = usuLogica.usuarios();
        } catch (Exception ex) {
            Logger.getLogger(usuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario getUserSelect() {
        return userSelect;
    }

    public void setUserSelect(Usuario userSelect) {
        this.userSelect = userSelect;
    }

    public InputText getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(InputText txtCedula) {
        this.txtCedula = txtCedula;
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

    public InputText getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(InputText txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public InputText getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(InputText txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public InputText getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(InputText txtCelular) {
        this.txtCelular = txtCelular;
    }

    public Calendar getCalFechaN() {
        return calFechaN;
    }

    public void setCalFechaN(Calendar calFechaN) {
        this.calFechaN = calFechaN;
    }

    public InputText getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(InputText txtEmail) {
        this.txtEmail = txtEmail;
    }

    public InputText getTxtProfesion() {
        return txtProfesion;
    }

    public void setTxtProfesion(InputText txtProfesion) {
        this.txtProfesion = txtProfesion;
    }

    public InputText getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(InputText txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public SelectOneMenu getCmbPerfil() {
        return cmbPerfil;
    }

    public void setCmbPerfil(SelectOneMenu cmbPerfil) {
        this.cmbPerfil = cmbPerfil;
    }

    public Password getTxtContraseña() {
        return txtContraseña;
    }

    public void setTxtContraseña(Password txtContraseña) {
        this.txtContraseña = txtContraseña;
    }

    public Password getTxtContraseñaCheck() {
        return txtContraseñaCheck;
    }

    public void setTxtContraseñaCheck(Password txtContraseñaCheck) {
        this.txtContraseñaCheck = txtContraseñaCheck;
    }

    public CommandButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(CommandButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public CommandButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(CommandButton btnBuscar) {
        this.btnBuscar = btnBuscar;
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

    public perfilesLogicaLocal getPerLogica() {
        return perLogica;
    }

    public void setPerLogica(perfilesLogicaLocal perLogica) {
        this.perLogica = perLogica;
    }

    public String getNamePer() {
        return namePer;
    }

    public void setNamePer(String namePer) {
        this.namePer = namePer;
    }

    public usuarioLogicaLocal getUsuLogica() {
        return usuLogica;
    }

    public void setUsuLogica(usuarioLogicaLocal usuLogica) {
        this.usuLogica = usuLogica;
    }

    public String getPassword3() {
        return password3;
    }

    public void setPassword3(String password3) {
        this.password3 = password3;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public List<Perfiles> getListaPerfiles() {
        try {
            listaPerfiles = perLogica.perfiles();
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPerfiles;
    }

    public CommandButton getBtnAsignarPerfil() {
        return btnAsignarPerfil;
    }

    public void setBtnAsignarPerfil(CommandButton btnAsignarPerfil) {
        this.btnAsignarPerfil = btnAsignarPerfil;
    }

    public void setListaPerfiles(List<Perfiles> listaPerfiles) {
        this.listaPerfiles = listaPerfiles;
    }

    public perfilesUsuarioLogicaLocal getPeruLogica() {
        return peruLogica;
    }

    public void setPeruLogica(perfilesUsuarioLogicaLocal peruLogica) {
        this.peruLogica = peruLogica;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<Usuario> getFilteredUser() {
        return filteredUser;
    }

    public void setFilteredUser(List<Usuario> filteredUser) {
        this.filteredUser = filteredUser;
    }

    public void showUsuario() {
        try {
            System.out.println("Vista.registroUsuarioV.showUsuario()" + txtCedula.getValue().toString());
            Usuario user = new Usuario();
            user = usuLogica.consultarUsuariobyCedula(txtCedula.getValue().toString());
            if(user.getIdUsuario()==null){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no encontrado",""));
            }
            else{
                System.out.println("Vista.registroUsuarioV.showUsuario() Encontrado");
                System.out.println("Vista.registroUsuarioV.showUsuario()"+ user.getIdUsuario());
                System.out.println("Vista.registroUsuarioV.showUsuario()"+ user.getNombreUsuario());
                txtNombre.setValue(user.getNombreUsuario());
                txtApellido.setValue(user.getApellidoUsuario());
                txtDireccion.setValue(user.getDireccioUsuario());
                txtTelefono.setValue(user.getTelefonoUsuario());
                txtCelular.setValue(user.getCelularUsuario());
                setDate2(ParseFecha(user.getFechaNacimientoUsuario()));
                txtEmail.setValue(user.getEmailUsuario());
                txtProfesion.setValue(user.getProfesionUsuario());
                txtUsuario.setValue(user.getLoginUsuario());
                //Pendiente para que me rescate el perfil del usuario
                txtContraseña.setValue(user.getPasswordUsuario());
                System.out.println("Vista.registroUsuarioV.showUsuario()" + user.getNombreUsuario());
                requeridos(true);
                btnModificar.setDisabled(false);
                btnAsignarPerfil.setDisabled(false);
                btnEliminar.setDisabled(false);
                txtContraseña.setRequired(false);
                txtContraseñaCheck.setRequired(false);
            }
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showSelectRowUsuario(SelectEvent e) {
        System.out.println("Vista.registroUsuarioV.showSelectRowUsuario()");
        try {
            Usuario user = getUserSelect();
            txtCedula.setValue(user.getCedulaUsuario());
            txtNombre.setValue(user.getNombreUsuario());
            txtApellido.setValue(user.getApellidoUsuario());
            txtDireccion.setValue(user.getDireccioUsuario());
            txtTelefono.setValue(user.getTelefonoUsuario());
            txtCelular.setValue(user.getCelularUsuario());
            setDate2(ParseFecha(user.getFechaNacimientoUsuario()));
            txtEmail.setValue(user.getEmailUsuario());
            txtProfesion.setValue(user.getProfesionUsuario());
            txtUsuario.setValue(user.getLoginUsuario());
            //Pendiente para que me rescate el perfil del usuario
            setPassword3(user.getPasswordUsuario());
            txtContraseña.setValue(getPassword3());
            System.out.println("Vista.registroUsuarioV.showSelectRowUsuario()" + user.getNombreUsuario());
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
        requeridos(true);
        btnModificar.setDisabled(false);
        btnEliminar.setDisabled(false);
        btnBuscar.setDisabled(true);
        txtContraseña.setRequired(false);
        txtContraseñaCheck.setRequired(false);
    }

    public Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public String ParseDate(Date date) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(date);
    }

    public void registrar() {
        try {
            Usuario user = new Usuario();
            user.setCedulaUsuario(txtCedula.getValue().toString());
            user.setNombreUsuario(txtNombre.getValue().toString());
            user.setApellidoUsuario(txtApellido.getValue().toString());
            user.setDireccioUsuario(txtDireccion.getValue().toString());
            user.setTelefonoUsuario(txtTelefono.getValue().toString());
            user.setCelularUsuario(txtCelular.getValue().toString());
            user.setFechaNacimientoUsuario(ParseDate(date2));
            user.setEmailUsuario(txtEmail.getValue().toString());
            user.setProfesionUsuario(txtProfesion.getValue().toString());
            user.setLoginUsuario(txtUsuario.getValue().toString());
            user.setPasswordUsuario(txtContraseña.getValue().toString());
            System.out.println("Vista.registroUsuarioV.registrar()1");
            System.out.println("Vista.registroUsuarioV.registrar()");
            usuLogica.crearUsuario(user);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario creado con exito",""));
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "No se pudo crear el nuevo usuario",""));
        }
        limpiar();
    }

    public void modificar() {
        try {
            Usuario user = usuLogica.consultarUsuariobyCedula(txtCedula.getValue().toString());
            if(user.getIdUsuario()==null){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no valido",""));
            }else{
                user.setCedulaUsuario(txtCedula.getValue().toString());
                user.setNombreUsuario(txtNombre.getValue().toString());
                user.setApellidoUsuario(txtApellido.getValue().toString());
                user.setDireccioUsuario(txtDireccion.getValue().toString());
                user.setTelefonoUsuario(txtTelefono.getValue().toString());
                user.setCelularUsuario(txtCelular.getValue().toString());
                user.setFechaNacimientoUsuario(ParseDate(date2));
                
                user.setEmailUsuario(txtEmail.getValue().toString());
                user.setProfesionUsuario(txtProfesion.getValue().toString());
                user.setLoginUsuario(txtUsuario.getValue().toString());
                usuLogica.modificarUsuario(user);
                limpiar();
                requeridos(false);
                txtCedula.setRequired(true);
                btnModificar.setDisabled(true);
                btnBuscar.setDisabled(false);
                btnEliminar.setDisabled(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminar() {
        try {
            Usuario user = usuLogica.consultarUsuariobyCedula(txtCedula.getValue().toString());
            if(user.getIdUsuario()==null){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se pudo eliminar el usuario",""));
            }else{
                usuLogica.eliminarUsuario(user);                
                limpiar();
                requeridos(false);
                txtCedula.setRequired(true);
                btnModificar.setDisabled(true);
                btnEliminar.setDisabled(true);
                btnBuscar.setDisabled(false);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addPerfil() {
        try {
            PerfilUsuario perU=new PerfilUsuario();
            List<PerfilUsuario> perusIdUser=new ArrayList<PerfilUsuario>();
            Perfiles perfil = perLogica.consultarPerfil(getNamePer());
            Usuario user = usuLogica.consultarUsuariobyCedula(txtCedula.getValue().toString());
            
            perusIdUser=peruLogica.consultarPeruByUser(user.getIdUsuario());
            if(perusIdUser.size()>0){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Este usuario ya tiene agregado un perfil",""));
            }else{
                perU.setPerfilesidPerfilUsuario(perfil);
                perU.setUsuarioidUsuario(user);
                peruLogica.crearPerfilUsuario(perU);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Perfil asignado con exito",""));
            }  
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void requeridos(boolean r) {
        txtCedula.setRequired(r);
        txtNombre.setRequired(r);
        txtApellido.setRequired(r);
        txtDireccion.setRequired(r);
        txtTelefono.setRequired(r);
        txtCelular.setRequired(r);
        txtEmail.setRequired(r);
        txtProfesion.setRequired(r);
        txtUsuario.setRequired(r);
        txtContraseña.setRequired(r);
        txtContraseñaCheck.setRequired(r);
    }

    public void limpiar() {
        txtCedula.setValue("");
        txtNombre.setValue("");
        txtApellido.setValue("");
        txtDireccion.setValue("");
        txtTelefono.setValue("");
        txtCelular.setValue("");
        txtEmail.setValue("");
        txtProfesion.setValue("");
        txtUsuario.setValue("");
        txtContraseña.setValue("");
        txtContraseñaCheck.setValue("");
    }

    public void showSelectDBUser(SelectEvent e) {
        try {
            //Usuario user=(Usuario)e.getObject();
            Usuario user = getUserSelect();
            System.out.println("Vista.registroUsuarioV.showSelectDBUser()" + user.getCedulaUsuario());
            txtCedula.setValue(user.getCedulaUsuario());
            txtNombre.setValue(user.getNombreUsuario());
            txtApellido.setValue(user.getApellidoUsuario());
            txtDireccion.setValue(user.getDireccioUsuario());
            txtTelefono.setValue(user.getTelefonoUsuario());
            txtCelular.setValue(user.getCelularUsuario());
            setDate2(ParseFecha(user.getFechaNacimientoUsuario()));
            txtEmail.setValue(user.getEmailUsuario());
            txtProfesion.setValue(user.getProfesionUsuario());
            txtUsuario.setValue(user.getLoginUsuario());
            //Pendiente para que me rescate el perfil del usuario
            System.out.println("Vista.registroUsuarioV.showSelectDBUser()" + user.getPasswordUsuario());
            txtContraseña.setValue(user.getPasswordUsuario());
            System.out.println("Vista.registroUsuarioV.showSelectDBUser()" + txtContraseña.getValue().toString());
            requeridos(true);
        } catch (Exception ex) {
            Logger.getLogger(registroUsuarioV.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnModificar.setDisabled(false);
        btnEliminar.setDisabled(false);
        btnBuscar.setDisabled(true);
        txtContraseña.setRequired(false);
        txtContraseñaCheck.setRequired(false);
        btnAsignarPerfil.setDisabled(false);
    }

    public void addNewQuestion() {//Este metodo sirve para acctivar y deactivar algunos botones a medida que se completan sus campos.
        System.out.println("Vista.registroUsuarioV.addNewQuestion()");
        System.out.println("Vista.registroUsuarioV.addNewQuestion()" + name + "*");
        if (!btnRegistrar.isDisabled() && (name.length() < 2)) {
            System.out.println("Vista.registroUsuarioV.addNewQuestion() -- if");
            btnBuscar.setDisabled(false);
            btnRegistrar.setDisabled(true);
            requeridos(false);
            txtCedula.setRequired(true);
        } else if (name.length() > 1) {
            btnBuscar.setDisabled(true);
            btnRegistrar.setDisabled(false);
            requeridos(true);
            System.out.println("Vista.registroUsuarioV.addNewQuestion() -- Else");
        }

    }

}
