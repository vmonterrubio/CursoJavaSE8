/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.service;

import com.netec.dao.AccesoDao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class Service {
    
    public static void conectarOracle() throws Exception{
        AccesoDao dao = new AccesoDao();
        dao.conectarBase();
    }
    
    public static void main(String[] args) {
        try {
            Service.conectarOracle();
        } catch (Exception ex) {
            // System.out.println(ex.getMessage());
            
        }
    }
}
