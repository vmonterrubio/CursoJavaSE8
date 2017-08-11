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
public class TestPedido {
    public static void main(String[] args) {
        Pedido espania = new PedidoEspania();
        Pedido francia = new PedidoFrancia();
        
        System.out.println("Pais = "+espania.pais+"\nIva:"+espania.calculaIVA(34.5));
        System.out.println("Pais = "+francia.pais+"\nIva:"+francia.calculaIVA(34.5));
        
    }
    
}
