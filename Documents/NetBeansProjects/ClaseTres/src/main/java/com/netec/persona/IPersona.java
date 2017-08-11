/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.persona;

/**
 *
 * @author Java
 */
public interface IPersona {
    String NACIONALIDAD = "MEXICANA";
    void comer(String comida);
    void reproducirse(String persona);
    
    // Solo para Java8
    public default void caminar(String calle){
        System.out.println("Caminando por : "+ calle);
    }
}
