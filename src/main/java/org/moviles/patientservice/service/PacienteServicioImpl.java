package org.moviles.patientservice.service;

import lombok.extern.slf4j.Slf4j;
import org.moviles.patientservice.repository.PacienteRepository;
import org.moviles.patientservice.repository.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class PacienteServicioImpl implements PacienteServicio{

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> findPacientesAll() {
        return (List<Paciente>) pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> getPaciente(Long id) {
        return pacienteRepository.findById(id);
    }
}
