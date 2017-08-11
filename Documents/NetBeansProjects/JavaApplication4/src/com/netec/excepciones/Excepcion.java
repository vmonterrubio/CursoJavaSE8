/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.excepciones;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Java
 */
public class Excepcion extends Exception {
    private int codigo;
    private String descripcion;
    private Date date;
    
    public Excepcion(int code,String mensaje, Date fecha, String descripcion){
        super(mensaje);
        this.codigo=code;
        this.descripcion=descripcion;
        this.date=fecha;
    }
    public Excepcion() {
    }

    public Excepcion(String string) {
        super(string);
    }

    public Excepcion(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public Excepcion(Throwable thrwbl) {
        super(thrwbl);
    }

    public Excepcion(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String  getDate() {
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return d.format(this.date);
        
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
