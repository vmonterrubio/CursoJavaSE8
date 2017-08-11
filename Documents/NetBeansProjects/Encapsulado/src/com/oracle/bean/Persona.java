/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.bean;

/**
 *
 * @author Java
 */
public class Persona {
    Persona padre;
    Persona madre;
    Persona valida;
    String nombre;
    char sexo;
    public Persona reproducirse(Persona p){
        if(p !=  null && p instanceof Persona ){
            if(this.sexo != p.sexo){
                switch(p.sexo){
                case 'M': this.valida=p;
                break;
                case 'F': this.valida = null;
                break;
                default: this.valida = null;
                }
            }else return null;
        } else return null;
        if( this.valida == null ) return null;
        Persona hijo = new Persona();
                hijo.madre=this;
                hijo.padre=p;
        return hijo;
    }
}
