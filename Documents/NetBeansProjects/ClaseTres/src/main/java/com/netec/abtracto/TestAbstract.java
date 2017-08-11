/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.abtracto;

/**
 *
 * @author Java
 */
public class TestAbstract {
    public static void main(String[] args) {
        // Electrodomestico televisor = new Electrodomestico(); es un error ya que no esta implementado el comportamiento.
        Televisor televisor = new Televisor();
        televisor.encender();
        televisor.conectividad();
        Lavadora lavadora = new Lavadora();
        lavadora.encender();
        
        Electrodomestico tvSony = new Televisor();
        Electrodomestico wshMabe = new Lavadora();
        
        // LineaBlanca tvLG = new Televisor(); /* porque son dos ramas diferentes */
        
    }
}
