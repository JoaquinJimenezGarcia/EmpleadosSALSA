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
    private double sueldoActual;
    private int sueldoBase = 1150; // Sueldo con el que empiezan (anual)
    private int maxTrienios = 10; // Trienios Maximos
    private int subidaTrienio = 35; // Aumento mensual por trienio
    private int sueldoTrienio = subidaTrienio * (añosTrabajados/3);
    private int mesesSinCobrar = 0;

    public Oficina(String nombre, String apellido, String dni, String direccion, String correo, int numSegSoc, int telefono, int planta, String oficina, String area, String seccion, String lugar, int añosTrabajados, int mesesSinCobrar) {
        super(nombre, apellido, dni, direccion, correo, numSegSoc, telefono);
        this.planta = planta;
        this.oficina = oficina;
        this.area = area;
        this.seccion = seccion;
        this.lugar = lugar;
        this.añosTrabajados = añosTrabajados;
        this.mesesSinCobrar = mesesSinCobrar;
    }

    public int getMesesSinCobrar(){
        return mesesSinCobrar;
    }

    public void setMesesSinCobrar(int mesesSinCobrar){
        this.mesesSinCobrar = mesesSinCobrar;
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

    public double salario(){
        if(añosTrabajados<=maxTrienios){
            sueldoActual = (sueldoBase + sueldoTrienio) * mesesSinCobrar;
        }else{
            sueldoActual = (sueldoBase + (subidaTrienio * maxTrienios))*mesesSinCobrar;
        }

        sueldoActual = sueldoActual - (sueldoActual*0.18);

        return sueldoActual;
    }

    @Override
    public String toString() {
        salario();

        return "Oficina{" +
                "lugar='" + lugar + '\'' +
                ", añosTrabajados=" + añosTrabajados + '\'' +
                ", salario=" + sueldoActual + "€" +
                '}';
    }
}
