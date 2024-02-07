package org.moviles.patientservice.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@Table(name = "medicos")
public class Medico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String last_name;

    @Column(name = "usuario")
    private String user;

    @Column(name = "contraseña")
    private String pass;

}
