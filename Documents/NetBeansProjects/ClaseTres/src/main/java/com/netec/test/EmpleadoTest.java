package com.netec.test;

import com.netec.testdefault.EmpleadoDao;
import com.netec.testprotec.EmpleadoDaoImpl;
import com.netec.testpublic.Empleado;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        EmpleadoDao empDao = new EmpleadoDao();
        EmpleadoDaoImpl empDaoI = new EmpleadoDaoImpl();
        empleado.apellido ="Gomez";
        //empDao.    --> no puede ver los miembros de la clase
        //empDaoI. --> no se muestran fuera del paquete
    }
    
}
