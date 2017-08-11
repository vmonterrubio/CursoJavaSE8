/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

/**
 *
 * @author Java
 */
public abstract class Pedido {
    protected double precioCIVA;
    protected double precioSIVA;
    protected double iva;
    protected String pais;
    public abstract double calculaIVA(double precio);
    public abstract double calculaPrecioCIVA(double precio);
    
}
