/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.defaultmethods;

/**
 *
 * @author Java
 */
public interface PersonaB {
        default public void hablar(){
        System.out.println("Hablando de varios temas.PersonaB");
    }
 
}
