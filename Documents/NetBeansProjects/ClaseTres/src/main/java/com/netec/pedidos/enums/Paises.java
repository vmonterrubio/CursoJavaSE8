/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos.enums;

/**
 *
 * @author Java
 */
public enum Paises {
    MEXICO(0.16f),
    ESPAÑA(0.21f),
    ARGENTINA(0.20f),
    FRANCIA(0.30f);
    
    private float iva;
    private Paises(float iva){
        this.iva=iva;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
}
