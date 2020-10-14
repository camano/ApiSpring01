/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.Crud01.services;

import com.jonathan.Crud01.interfaceService.IempleadoService;
import com.jonathan.Crud01.interfaces.IEmpleados;
import com.jonathan.Crud01.modelo.Empleados;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author jonathan
 */
@Service
public class EmpleadoService implements IempleadoService {

    @Autowired
    private IEmpleados data;

    @Override
    public List<Empleados> Listar() {
        return (List<Empleados>) data.findAll();
    }

    @Override
    public Empleados save(Empleados empleados) {
        return data.save(empleados);
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public Empleados ListarId(int id) {
        return data.findById(id).orElse(null);
    }

}
