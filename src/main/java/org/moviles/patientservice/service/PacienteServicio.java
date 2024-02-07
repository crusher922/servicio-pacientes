package org.moviles.patientservice.service;

import org.moviles.patientservice.repository.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteServicio {

    public List<Paciente>findPacientesAll();
    public Optional<Paciente> getPaciente(Long id);
}
