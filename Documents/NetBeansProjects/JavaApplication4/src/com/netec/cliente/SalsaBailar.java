/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.cliente;

import com.netec.excepciones.Excepcion;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Java
 */
public class SalsaBailar {
    public static void main(String[] args){
        try{
        validaEntrar("Victor", 15);
        }catch(Excepcion e){
            JOptionPane.showMessageDialog(null,"MyException["+e.getCodigo()+"]: "+e.getDate()+ e.getDescripcion()+e.getMessage(), "My Exception", 0);
        }
    }
    public static boolean validaEntrar(String nombre, int edad) throws Excepcion{
        boolean esMayor=false;
        if(edad >= 18){
            esMayor=true;
            System.out.println("");
        }else{
            throw new Excepcion(400,"Valida edad del Cliente",new Date(),"Eres menor de Edad.");
        }
        return esMayor;
    }
    
}
