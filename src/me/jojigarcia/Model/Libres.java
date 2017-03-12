package me.jojigarcia.Model;

/**
 * Created by joaquinjimenezgarcia on 9/3/17.
 */
public class Libres extends Trabajador{
    private int horasTrabajadasTotal;
    private int horasTrabajadasNoRetr;

    public Libres(String nombre, String apellido, String dni, String direccion, String correo, int numSegSoc, int telefono, int horasTrabajadasTotal, int horasTrabajadasNoRetr) {
        super(nombre, apellido, dni, direccion, correo, numSegSoc, telefono);
        this.horasTrabajadasTotal = horasTrabajadasTotal;
        this.horasTrabajadasNoRetr = horasTrabajadasNoRetr;
    }

    public int getHorasTrabajadasTotal() {
        return horasTrabajadasTotal;
    }

    public void setHorasTrabajadasTotal(int horasTrabajadasTotal) {
        this.horasTrabajadasTotal = horasTrabajadasTotal;
    }

    public int getHorasTrabajadasNoRetr() {
        return horasTrabajadasNoRetr;
    }

    public void setHorasTrabajadasNoRetr(int horasTrabajadasNoRetr) {
        this.horasTrabajadasNoRetr = horasTrabajadasNoRetr;
    }

    @Override
    public String toString() {
        return "Libres{" +
                "horasTrabajadasTotal=" + horasTrabajadasTotal +
                ", horasTrabajadasNoRetr=" + horasTrabajadasNoRetr +
                '}';
    }
}
