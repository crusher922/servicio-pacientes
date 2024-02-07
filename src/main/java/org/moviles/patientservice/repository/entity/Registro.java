package org.moviles.patientservice.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "registros")
public class Registro implements Serializable {

    @Id
    @Column(name = "id_registro")
    private long id;

    @JoinColumn(name = "id_medico")
    @ManyToOne(fetch = FetchType.LAZY)
    private Medico medico;

    @Column(name = "result_tb")
    private String result_tb;

    @Column(name = "result_no_tb")
    private String result_no_tb;

    @Column(name = "result_normal")
    private float result_normal;

    private String no_tb;

    private String enfermo;

    private String tb;

    @JoinColumn(name = "id_paciente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;
}
