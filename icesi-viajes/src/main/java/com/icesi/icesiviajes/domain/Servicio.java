package com.icesi.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "servicios")
@Data
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio", precision = 10, scale = 2)
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_tipo_servicio", nullable = false)
    private TipoServicio tipoServicio;

}
