/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulado;

/**
 *
 * @author Java
 */
public class Empleado {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 100 || edad < 0){
            System.out.println("Valor:"+edad+" inadecuado para la edad. debe ser (0..99)");
            return;
        }
        this.edad = edad;
    }
    
}
