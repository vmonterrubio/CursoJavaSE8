/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.animales;

class Animal{
    String nombre;
    public Animal(String nombre){
        this.nombre = nombre;
    }
    Animal reproducirse(Animal a){
        Animal hijo = new Animal(nombre);
        return hijo;
    }
}

class Gato extends Animal{
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a) {
        if(! (a instanceof Gato) ){
            System.out.println("No se pueden  reproducir un "+a.getClass().getName()+" con un"+this.getClass().getName());
            return null;
        }
        return new Animal("Benito");
    }
    
}

class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a) {
        if(! (a instanceof Perro) ){
            System.out.println("No se pueden  reproducir un "+a.getClass().getName()+" con un "+this.getClass().getName());
            return null;
        }
        return new Animal("ScoobyDoo");
    }
    
}
/**
 *
 * @author Java
 */
public class TestAnimales {

    public static void main(String[] args) {
        Gato donGato = new Gato("DonGato");
        Perro Lasy = new Perro("Lasy");
    
        Lasy.reproducirse(donGato);
                
        
    }
}
