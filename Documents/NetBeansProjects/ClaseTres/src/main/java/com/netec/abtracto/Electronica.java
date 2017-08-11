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
public abstract class Electronica extends Electrodomestico {
    
    public abstract void tareaDomestica();
    
    public void conectividad(){
        System.out.println("Implementar de otra forma");
    }
    
}
