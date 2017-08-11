/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Java
 */
public class Dao {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public void conectar(){
        String url="jdbc:derby://localhost:1527/";
        String dbName="DBConsultas";
        String driver="org.apache.derby.jdbc.ClientDriver";
        String userName="root";
        String password="v1ct0r01";
        try{
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url+dbName, userName, password);
            System.out.println("Conexion Exitosa");
           
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void cerrarConexion(){
        try{
            if(connection != null){
                if(!connection.isClosed()){
                    connection.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
//    public static void main(String[] args) {
//        Dao dao = new Dao();
//        dao.conectar();
//    }
}
