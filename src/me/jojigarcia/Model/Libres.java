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

    En cuanto a los profesionales libres el cálculo se realiza en base a las horas trabajadas
    (y no remuneradas hasta el momento) durante el último mes a razón de 25€/hora. Con el fin
    de incentivar a los profesionales que más han colaborado con la empresa, SALSA añade un plus de
    productividad en relación a las horas que han trabajado:

    Menos de 10 horas: No tiene plus
    Entre 10 y menos de 25: Plus del 3%.
    Entre 25 y menos de 50: Plus del 5%
    Más de 50: Plus del 10%

    Los sueldos de los profesionales libres solo llevarán retención si superan los 850€ y ésta será del 11%.

    @Override
    public String toString() {
        return "Libres{" +
                "horasTrabajadasTotal=" + horasTrabajadasTotal +
                ", horasTrabajadasNoRetr=" + horasTrabajadasNoRetr +
                '}';
    }
}
