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

    public double calcularSueldo(){
        final int PRECIO_HORA = 25;
        double sueldo = 0;
         if(horasTrabajadasNoRetr < 10){
             sueldo = horasTrabajadasNoRetr * PRECIO_HORA;
         }else if(horasTrabajadasNoRetr >= 10 && horasTrabajadasNoRetr < 25){
             sueldo = horasTrabajadasNoRetr * PRECIO_HORA + (horasTrabajadasNoRetr*PRECIO_HORA*0.03);
         }else if(horasTrabajadasNoRetr >= 25 && horasTrabajadasNoRetr < 50){
             sueldo = horasTrabajadasNoRetr * PRECIO_HORA + (horasTrabajadasNoRetr*PRECIO_HORA*0.05);
         }else if(horasTrabajadasNoRetr >= 50){
             sueldo = horasTrabajadasNoRetr * PRECIO_HORA + (horasTrabajadasNoRetr*PRECIO_HORA*0.1);
         }

         if (sueldo>850){
            sueldo = sueldo - (sueldo * 0.11);
         }

        return sueldo;
    }

    @Override
    public String toString() {
        return "Libres{" +
                "horasTrabajadasTotal=" + horasTrabajadasTotal +
                ", horasTrabajadasNoRetr=" + horasTrabajadasNoRetr +
                '}';
    }
}
