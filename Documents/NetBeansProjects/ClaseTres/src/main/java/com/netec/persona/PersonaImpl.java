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
public class PersonaImpl implements IPersona {

    @Override
    public void comer(String comida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse(String persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String otraFunc(){
        this.caminar("Calle de la felicidad.");
        return "";
    }
    
}
