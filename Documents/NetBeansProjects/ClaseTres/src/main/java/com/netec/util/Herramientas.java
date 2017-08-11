package com.netec.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Herramientas {
    public Date getFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = fecha;
        Date fechaDate= null;
        try{
            fechaDate = formato.parse(strFecha);
            return fechaDate;
        }catch(Exception e){
            e.printStackTrace();
            return fechaDate;
        }
    }
    public static Date getFechaStatic(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = fecha;
        Date fechaDate= null;
        try{
            fechaDate = formato.parse(strFecha);
            return fechaDate;
        }catch(Exception e){
            e.printStackTrace();
            return fechaDate;
        }
    }
    
}
