/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.dao;

/**
 *
 * @author Java
 */
public class AccesoDao {

    public void conectarBase() throws Exception{
        try{
            System.out.println("Intentando Conectarme");
            throw new Exception("La Url es incorrecta ...");
        }catch(Exception e){
            throw new Exception(e);
        }
    }
}
