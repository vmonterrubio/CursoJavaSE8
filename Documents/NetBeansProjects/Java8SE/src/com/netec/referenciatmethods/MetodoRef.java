/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.referenciatmethods;

import java.util.Arrays;

/**
 *
 * @author Java
 */
public class MetodoRef {
    public static void referenciaMetodosObjetos(){
        String[] nombres = {"Jerry","Zuri","Toño","Poncho"};
        
        //Usando Lamdas --- Arrays.sort(nombres, (s1,s2)-> s1.compareTo(s2) );
        
        Arrays.sort(nombres, String::compareToIgnoreCase);
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    public void referenciaMetodosParticular(){
        
    }
    public static void referenciaConstructor(){
        IPersona iper = Persona::new;
        Persona per = iper.crear(1, "Victor");
        System.out.println(per);
    }
    public static void main(String[] args) {
       MetodoRef.referenciaMetodosObjetos();
       MetodoRef.referenciaConstructor();
    }
}
