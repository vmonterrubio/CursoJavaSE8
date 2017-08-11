/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.serializacion;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 *
 * @author Java
 */
public class Gato implements Serializable {
    public String nombre;
    public String raza;
    private static final long serialVersionUID = 1112131415L; 

    public Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }



    
}
