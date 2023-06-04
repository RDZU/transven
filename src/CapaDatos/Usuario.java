
package CapaDatos;

public class Usuario {
    
    
    private int cedula_usuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String acceso;
    private String login;
    private String contraseña;

    public Usuario(int cedula_usuario, String nombre, String apellido, String direccion, String telefono, String acceso, String login, String contraseña) {
        this.cedula_usuario = cedula_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.acceso = acceso;
        this.login = login;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public int getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(int cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}

