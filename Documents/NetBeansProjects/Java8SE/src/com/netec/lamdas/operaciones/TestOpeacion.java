/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.lamdas.operaciones;

/**
 *
 * @author Java
 */
public class TestOpeacion {
    public static void main(String[] args) {
        TestOpeacion op = new TestOpeacion();
        op.calcular(2);
    }
    public void calcular(double valor){
       Operacion op = (x,y) -> (x+y)/valor;
        System.out.println("Promedio:" + op.calcularPromedio(10, 4));
    }
}
