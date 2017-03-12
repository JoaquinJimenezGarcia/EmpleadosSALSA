package me.jojigarcia.Model;

/**
 * Created by joaquinjimenezgarcia on 9/3/17.
 */
public class Trabajador {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String correo;
    private int numSegSoc;
    private int telefono;

    public Trabajador(String nombre, String apellido, String dni, String direccion, String correo, int numSegSoc, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.correo = correo;
        this.numSegSoc = numSegSoc;
        this.telefono = telefono;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumSegSoc() {
        return numSegSoc;
    }

    public void setNumSegSoc(int numSegSoc) {
        this.numSegSoc = numSegSoc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", numSegSoc=" + numSegSoc +
                ", telefono=" + telefono +
                '}';
    }
}
