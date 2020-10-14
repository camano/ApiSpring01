/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.Crud01.interfaces;

import com.jonathan.Crud01.modelo.Empleados;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jonathan
 */
@Repository
public interface IEmpleados extends CrudRepository<Empleados, Integer>{
    
}
