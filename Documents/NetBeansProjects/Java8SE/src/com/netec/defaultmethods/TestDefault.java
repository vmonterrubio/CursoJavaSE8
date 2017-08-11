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
public class TestDefault implements PersonaA, PersonaB{

    @Override
    public void hablar() { // Se usa para elegir el metodo que esta duplicado en dos interfaces
        PersonaB.super.hablar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        TestDefault test = new TestDefault();
        test.hablar();
    }
}
