/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.collections;

import java.util.ArrayList;

/**
 *
 * @author Java
 */
public class Colecciones {
    
    public static void arrayListTest(){
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        personas.add(new Persona("PepeLalo","Ramos"));
        personas.add(new Persona("Mike","Miranda"));
        personas.add(new Persona("Angel","Balcazar"));
        personas.add(new Persona("Paul","Gomez"));
        
        for (Persona persona : personas) {
            System.out.println("Persona:"+persona);
        }
        
        ArrayList<Integer> arrLst = new ArrayList<Integer>();
        arrLst.add(1);
        arrLst.add(10);
        arrLst.add(23);
        arrLst.add(12);
        arrLst.add(45);
        arrLst.add(54);
        arrLst.add(70);
        
        System.out.println("Elementos:"+arrLst.size());
        for (Integer integer : arrLst) {
            System.out.println("Valor="+integer);
        }
    }

    public static void linkedListTest(){
        
    }

    
    public static void setTest(){
        
    }

    public static void Test(){
        
    }
    
    public static void main(String[] args) {
        arrayListTest();
        
    }
       
    
}
