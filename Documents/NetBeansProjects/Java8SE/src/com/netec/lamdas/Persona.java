/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.lamdas;

/**
 *
 * @author Java
 */
public class Persona {
    public String nombre;
    public String edad;
    public String tipoFiscal;

    public Persona(String nombre){
        this.nombre = nombre;
        
    }
    public Persona(String nombre, String edad, String tipoFiscal) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoFiscal = tipoFiscal;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", tipoFiscal=" + tipoFiscal + '}';
    }
    
}
