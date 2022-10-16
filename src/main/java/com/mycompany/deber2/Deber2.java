/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.deber2;

/**
 *
 * @author Juano
 */
public class Deber2 {

    public static void main(String[] args) {

        var empleado1 = new Empleado();
        empleado1.nombre = "Juan Mendoza";
        empleado1.horasMes = 160;
        empleado1.costoHora = 1.8;
        empleado1.yearIngreso = 2010;

        System.out.println(empleado1.mostrarInfo());
        System.out.println("El empleado tiene: " + empleado1.calcularTiempo(2022)
                + " años en la empresa" + " gana: " + empleado1.calcularIngreso() + " USD al mes"
                + " con extras gana " + empleado1.calcularSueldo(2022)
                + " USD al mes," + " tiene un bono de " + empleado1.calcularBono()
                + " USD" + " y paga: " + empleado1.calcularImpuesto(250, 500, 750) + " USD de impuestos.");
        System.out.println("El empleado en total gana: " + empleado1.calcularTotal(2022, 250, 500, 750) + " USD ");
        System.out.println("");

        var empleado2 = new Empleado();
        empleado2.nombre = "Liz Alvarez";
        empleado2.horasMes = 200;
        empleado2.costoHora = 2.7;
        empleado2.yearIngreso = 2017;

        System.out.println(empleado2.mostrarInfo());
        System.out.println("El empleado tiene: " + empleado2.calcularTiempo(2022)
                + " años en la empresa" + " gana: " + empleado2.calcularIngreso() + " USD al mes"
                + " con extras gana " + empleado2.calcularSueldo(2022)
                + " USD al mes," + " tiene un bono de " + empleado2.calcularBono()
                + " USD" + " y paga: " + empleado2.calcularImpuesto(250, 500, 750) + " USD de impuestos.");
        System.out.println("El empleado en total gana: " + empleado2.calcularTotal(2022, 250, 500, 750) + " USD ");
        System.out.println("");

        var empleado3 = new Empleado();
        empleado3.nombre = "Pedro Gonzales";
        empleado3.horasMes = 220;
        empleado3.costoHora = 3.5;
        empleado3.yearIngreso = 2013;

        System.out.println(empleado3.mostrarInfo());
        System.out.println("El empleado tiene: " + empleado3.calcularTiempo(2022)
                + " años en la empresa" + " gana: " + empleado3.calcularIngreso() + " USD al mes"
                + " con extras gana " + empleado3.calcularSueldo(2022)
                + " USD al mes," + " tiene un bono de " + empleado3.calcularBono()
                + " USD" + " y paga: " + empleado3.calcularImpuesto(250, 500, 750) + " USD de impuestos.");
        System.out.println("El empleado en total gana: " + empleado3.calcularTotal(2022, 250, 500, 750) + " USD ");
        System.out.println("");
    }
}
