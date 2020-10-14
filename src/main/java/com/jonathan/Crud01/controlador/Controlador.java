/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.Crud01.controlador;

import com.jonathan.Crud01.interfaceService.IempleadoService;
import com.jonathan.Crud01.modelo.Empleados;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jonathan
 */
@RestController
@RequestMapping("/api")
public class Controlador {
    
       @Autowired
       private IempleadoService service;
       
       @GetMapping("/productos")
       public List<Empleados>empleado(){
           return service.Listar();
       }
       
       @PostMapping("/productos")
       public Empleados save(@RequestBody Empleados empleados){
           return service.save(empleados);
       }
       
       @GetMapping("/productos/{id}")
       public Empleados mostrar(@PathVariable int id){
           return service.ListarId(id);
       }
       
       @PutMapping("/productos/{id}")
       public Empleados update(@RequestBody Empleados empleados,@PathVariable int id){
           Empleados empleadoactual= service.ListarId(id);
           empleadoactual.setNombre(empleados.getNombre());
           empleadoactual.setSalario(empleados.getSalario());
           return service.save(empleadoactual);
       }
       
       @DeleteMapping("/productos/{id}")
       public void delete(@PathVariable int id){
           service.delete(id);
       }
       @GetMapping
       public String mensaje(){
           return "ininio";
       }
       
}
