/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.interfazfuncional;

/**
 *
 * @author Java
 */
public class OperacionTest {
     public static double operacion(double x, double y){
        Operacion op = (double n1,double n2) -> n1+n2;
        return op.calcular(x, y);
     }
     
   public static void main(String[] args) {
        double result = OperacionTest.operacion(10,80);
        System.out.println("::" +result);
    }
}
