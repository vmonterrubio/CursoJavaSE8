/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consulta.dao;

import com.oracle.consultas.dao.DoctorDAO;
import com.oracle.consultas.dao.DoctorDAOImpl;
import com.oracle.consultas.model.Doctor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java
 */
public class DoctorDaoTest {
    @Test
    public void creaDoctorTest(){
        DoctorDAO doctorDao = new DoctorDAOImpl();
        Doctor simi = new Doctor();
        simi.setCodigo(1);
        simi.setNombre("Dr simi");
        simi.setApellido("Juarez");
        simi.setEspecialidad("Generico");
        
        doctorDao.crearDoctor(simi);
    }
}
