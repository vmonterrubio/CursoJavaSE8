/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.ordenar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Java
 */
public class TestOrder {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno pepe = new Alumno("Jose",30);
        Alumno pepe2 = new Alumno("Jose",15);
        Alumno juan = new Alumno("Juan",25);
        Alumno lalo = new Alumno("Eduardo",28);
        Alumno lalo2 = new Alumno("Eduardo",18);
        Alumno mike = new Alumno("Miguel",45);
        alumnos.add(pepe);
        alumnos.add(juan);
        alumnos.add(lalo);
        alumnos.add(pepe2);
        alumnos.add(lalo2);
        alumnos.add(mike);
        
        System.out.println("Sin Ordenar");
        System.out.println(alumnos);
        
        System.out.println("Ya Ordenados");
        Collections.sort(alumnos);
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        
        System.out.println(alumnos);

    }
}
