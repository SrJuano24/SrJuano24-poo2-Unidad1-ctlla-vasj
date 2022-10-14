/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber2;

/**
 *
 * @author Juano
 */
public class Empleado {
    String nombre;
    int horasMes;
    double costoHora;
    int yearIngreso;
   
public String mostrarInfo() {
        var retorno = "El empleado "+this.nombre + " gana " 
        + this.costoHora+" USD por hora" + " y trabaja "+this.horasMes+" horas al mes";
        return retorno;
}
    
public int calcularTiempo(int yearActual){
        var retorno=0;    
        retorno =yearActual- this.yearIngreso;
        return retorno;
 
}
 public double calcularIngreso(){
        var retorno=0.0d;
        retorno = this.horasMes*this.costoHora;
        return retorno;
    }

 public double calcularSueldo(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularTiempo(yearActual)*0.02;
        retorno = this.calcularIngreso()*edad+this.calcularIngreso();
        return retorno;
    }
 //<>
 public double calcularBono(){
        var retorno=0.0d;
        if(this.horasMes>160){retorno= ((this.horasMes-160)*(this.costoHora*2));}
        else { retorno = 0;
       }
 
        return retorno;
    }
 
 public double calcularImpuesto(){
        var retorno=0.0d;
        var sueldo=this.horasMes*this.costoHora;
        
        if (sueldo<100){retorno=0;}
        else{if(sueldo>=100 && sueldo<200){
            retorno=sueldo*0.05;}
        else{if(sueldo>=200 && sueldo<300){
            retorno=sueldo*0.12;}
        else{if(sueldo>=300){
            retorno=sueldo*0.25;}
    
        }}}
        return retorno;
    }
 
 public double calcularTotal(int yearActual){
        var retorno=0.0d;
        retorno =this.calcularSueldo(yearActual)+this.calcularBono()-this.calcularImpuesto();
 
        return retorno;
    }
 }
 

