/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.Crud01.interfaceService;

import com.jonathan.Crud01.modelo.Empleados;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jonathan
 */
public interface IempleadoService {
    
    public List<Empleados>Listar();
    public Empleados ListarId(int id);
    public Empleados save(Empleados empleados);
    public void delete(int id);
    
}
