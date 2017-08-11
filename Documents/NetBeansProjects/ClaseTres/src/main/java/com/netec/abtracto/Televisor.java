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
//Cumple con IS-A
public class Televisor extends Electronica{
    
    //Cumple con HAS-A
    private ControlRemotoUniversal ctrlRemoto = new ControlRemotoUniversal();

    @Override
    public void tareaDomestica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void encender() {
         System.out.println("Encender como televisor");
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conectividad() {
         System.out.println("Bluetoot, HDMI, USB "); //To change body of generated methods, choose Tools | Templates.
    }
    
}
