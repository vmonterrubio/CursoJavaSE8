/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.ordenar;

/**
 *
 * @author Java
 */
public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int edad ;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//    @Override
//    public int compareTo(Alumno o) {
//        return this.nombre.compareTo(o.nombre);
//    }
    @Override
    public int compareTo(Alumno o) {
//        String a = String.valueOf(this.edad)+this.nombre;
//        String b = String.valueOf(o.edad)+o.nombre;
        String a = this.nombre+String.valueOf(this.edad);
        String b = o.nombre+String.valueOf(o.edad);
        return a.compareTo(b);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }


}
