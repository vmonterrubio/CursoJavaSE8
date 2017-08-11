/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.referenciatmethods;

/**
 *
 * @author Java
 */
public class Persona {
    public int id;
    public String nombre;
    public String edad;
    public String tipoFiscal;

    public Persona(int id, String nombre){
        this.nombre = nombre;
        this.id = id;

    }
    public Persona(String nombre, String edad, String tipoFiscal) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoFiscal = tipoFiscal;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", tipoFiscal=" + tipoFiscal + '}';
    }

    
}
