package me.jojigarcia.Model;

/**
 * Created by joaquinjimenezgarcia on 9/3/17.
 */
public class Comercial extends Trabajador{
    private String provincia;
    private int altasNuevasSin;
    private int clientesNuevos;

    public Comercial(String nombre, String apellido, String dni, String direccion, String correo, int numSegSoc, int telefono, String provincia, int altasNuevasSin, int clientesNuevos) {
        super(nombre, apellido, dni, direccion, correo, numSegSoc, telefono);
        this.provincia = provincia;
        this.altasNuevasSin = altasNuevasSin;
        this.clientesNuevos = clientesNuevos;
    }

    public int getClientesNuevos() {
        return clientesNuevos;
    }

    public void setClientesNuevos(int clientesNuevos) {
        this.clientesNuevos = clientesNuevos;
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

    public double calcularSueldo(){
        final int SUELDO_BASE = 850;
        final int PLUS_CLIENTE = 12;
        final double PRIMER_PLUS = 0.08;
        final double SEGUNDO_PLUS = 0.1;
        final double TERCER_PLUS = 0.15;
        final double RETENCIONES = 0.12;

        double sueldoTotal = SUELDO_BASE;

        if(clientesNuevos > 100 && clientesNuevos <= 300){
            sueldoTotal = sueldoTotal + (sueldoTotal*PRIMER_PLUS);
        }else if(clientesNuevos > 300 && clientesNuevos <= 500){
            sueldoTotal = sueldoTotal + (sueldoTotal*SEGUNDO_PLUS);
        }else if(clientesNuevos > 500){
            sueldoTotal = sueldoTotal + (sueldoTotal*TERCER_PLUS);
        }

        sueldoTotal = sueldoTotal + (PLUS_CLIENTE*clientesNuevos);
        sueldoTotal = sueldoTotal - (sueldoTotal * RETENCIONES);

        return sueldoTotal;
    }

    @Override
    public String toString() {
        calcularSueldo();

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
}
