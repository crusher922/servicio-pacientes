package org.moviles.patientservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.moviles.patientservice.repository.entity.Paciente;
import org.moviles.patientservice.service.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/pacientes")
public class PacienteRest {

    @Autowired
    PacienteServicio pacienteServicio;

    //---------------------Recuperar todos los pacientes
    @GetMapping
    public ResponseEntity<List<Paciente>> findAll(){
       List<Paciente> pacientes = pacienteServicio.findPacientesAll();
       if(pacientes.isEmpty()){
           return ResponseEntity.noContent().build();
       }

       return ResponseEntity.ok(pacientes);
    }

    //--------------------Recuperar un solo paciente
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Paciente>> getPaciente(@PathVariable("id") long id){
        Optional<Paciente> paciente = pacienteServicio.getPaciente(id);
        if(null == paciente){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(paciente);
    }

}
