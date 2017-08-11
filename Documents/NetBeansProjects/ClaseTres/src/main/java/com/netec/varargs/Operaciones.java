package com.netec.varargs;

public class Operaciones {
 
    public float promedio(int... calificaciones){
        int suma = 0;
        
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (float) suma/calificaciones.length;
    }
    
    /*
        VarArgs simpre va en el parametro final
    */
    public float calculaCalificaciones(String nombre, String carrera, int... calificaciones){
        float promedio = 0;
        for (int calificacion : calificaciones) {
            promedio += calificacion;
        }
        System.out.println("Alumno:"+nombre+"Carrera:"+carrera+ "Promedio: "+(float)promedio/calificaciones.length);
        return (float)promedio/calificaciones.length;
    }
    
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        System.out.println("Promedio = "+op.promedio(7,8,6,7,8,9,8,9));
    }
}
