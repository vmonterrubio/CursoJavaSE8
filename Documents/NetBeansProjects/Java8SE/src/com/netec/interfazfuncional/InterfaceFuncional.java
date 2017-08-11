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
// Para definirla como funcional unicamente debe tener un metodo abstracto.
@FunctionalInterface 
public interface InterfaceFuncional {
    double calcular(double n1, double n2);
    
}
