package me.jojigarcia.Model;

/**
 * Created by joaquinjimenezgarcia on 9/3/17.
 */
public class Oficina extends Trabajador {
    private int planta = 0;
    private String oficina = "";
    private String area = "";
    private String seccion = "";
    private String lugar = planta + ", " + oficina + ". " + area + ", " + seccion;
    private int añosTrabajados;

    public Oficina(String nombre, String apellido, String dni, String direccion, String correo, int numSegSoc, int telefono, int planta, String oficina, String area, String seccion, String lugar, int añosTrabajados) {
        super(nombre, apellido, dni, direccion, correo, numSegSoc, telefono);
        this.planta = planta;
        this.oficina = oficina;
        this.area = area;
        this.seccion = seccion;
        this.lugar = lugar;
        this.añosTrabajados = añosTrabajados;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getAñosTrabajados() {
        return añosTrabajados;
    }

    public void setAñosTrabajados(int añosTrabajados) {
        this.añosTrabajados = añosTrabajados;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                ", lugar='" + lugar + '\'' +
                ", añosTrabajados=" + añosTrabajados +
                '}';
    }
}
