package org.moviles.patientservice.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "telefono")
    private String phone;

    private String email;

    @Column(name = "imagen_uri")
    private String img_uri;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico")
    private Medico medico;
}
