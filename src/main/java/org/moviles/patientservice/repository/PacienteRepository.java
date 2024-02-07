package org.moviles.patientservice.repository;

import org.moviles.patientservice.repository.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {

}
