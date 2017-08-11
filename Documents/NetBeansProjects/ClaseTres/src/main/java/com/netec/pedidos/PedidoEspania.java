/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

import static com.netec.pedidos.enums.Paises.*;

/**
 *
 * @author Java
 */
public class PedidoEspania extends Pedido{
 
    public PedidoEspania(){
        pais = ESPAÑA.toString();        
    }

    @Override
    public double calculaIVA(double precio) {
        iva = precio - (precio /1.1);
        return iva;
    }

    @Override
    public double calculaPrecioCIVA(double precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
