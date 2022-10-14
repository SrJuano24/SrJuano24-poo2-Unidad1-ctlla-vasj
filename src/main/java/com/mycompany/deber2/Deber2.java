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
    
        var empleado1= new Empleado();
        empleado1.nombre="Juan";
        empleado1.horasMes=200;
        empleado1.costoHora=2.5;
        empleado1.yearIngreso=2010;
        
        System.out.println(empleado1.mostrarInfo());
        System.out.println("El empleado tiene: "+empleado1.calcularTiempo(2022)+
        " años en la empresa"+" gana: "+empleado1.calcularIngreso()+" USD al mes"
                +" con extras gana "+empleado1.calcularSueldo(2022)+
                " USD al mes,"+" tiene un bono de "+empleado1.calcularBono()+
                " USD"+" y paga: "+empleado1.calcularImpuesto()+" USD de impuestos.");
        
//System.out.println("El empleado gana: "+empleado1.calcularIngreso()+" USD al mes");
//System.out.println("El empleado gana con extras: "+empleado1.calcularSueldo(2022)+" USD al mes");
//System.out.println("El empleado tiene un bono: "+empleado1.calcularBono()+" USD");
//System.out.println("El empleado paga: "+empleado1.calcularImpuesto()+" USD de impuestos");
        System.out.println("El empleado en total gana: "+empleado1.calcularTotal(2022)+" USD ");
    }
}
