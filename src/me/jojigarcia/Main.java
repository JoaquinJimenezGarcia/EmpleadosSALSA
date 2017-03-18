package me.jojigarcia;

import me.jojigarcia.Model.*;

public class Main {

    public static void main(String[] args) {

        Oficina juan = new Oficina(
                "juan",
                "dominguez",
                "45235345d",
                "asdad",
                "adad",
                123424,
                234234,
                5,
                "i+d",
                "informatica",
                "sistemas",
                "1",
                7,
                2);

        Libres pepe = new Libres(
                "Pepe",
                "Gordo Cabron",
                "23134324A",
                "Avd/ Turia",
                "pepe@comil.on",
                4323,
                342345,
                8,
                8
        );

        System.out.println(juan);
        System.out.println(pepe);
    }
}
