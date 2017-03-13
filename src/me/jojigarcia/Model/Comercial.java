package me.jojigarcia.Model;

/**
 * Created by joaquinjimenezgarcia on 9/3/17.
 */
public class Comercial extends Trabajador{
    private String provincia;
    private int altasNuevasSin;

    public Comercial(String nombre, String apellido, String dni, String direccion, String correo, int numSegSoc, int telefono, String provincia, int altasNuevasSin) {
        super(nombre, apellido, dni, direccion, correo, numSegSoc, telefono);
        this.provincia = provincia;
        this.altasNuevasSin = altasNuevasSin;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getAltasNuevasSin() {
        return altasNuevasSin;
    }

    public void setAltasNuevasSin(int altasNuevasSin) {
        this.altasNuevasSin = altasNuevasSin;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "provincia='" + provincia + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellido() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", nº ss='" + getNumSegSoc() + '\'' +
                ", telf='" + getTelefono()+ '\'' +
                ", altasNuevasSin=" + altasNuevasSin +
                '}';
    }

    static void calcularSueldo(){
        final int SUELDOBASE = 580;
        int sueldo;
    }
}
