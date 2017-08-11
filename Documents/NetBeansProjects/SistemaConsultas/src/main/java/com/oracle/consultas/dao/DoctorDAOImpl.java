/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Java
 */
public class DoctorDAOImpl extends Dao implements DoctorDAO {
    private String creaSql="insert into TBDoctor(Codigo,Nombre,Apellido,Especialidad) values(?,?,?,?)";

    @Override
    public void crearDoctor(Doctor doctor) {
        this.conectar();
        try{
            PreparedStatement pst = this.getConnection().prepareStatement(creaSql);
            pst.setInt(1, doctor.getCodigo());
            pst.setString(2, doctor.getNombre());
            pst.setString(3, doctor.getApellido());
            pst.setString(4, doctor.getEspecialidad());
            pst.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.cerrarConexion();
        }
    }

    @Override
    public void eliminarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> listaDoctor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
