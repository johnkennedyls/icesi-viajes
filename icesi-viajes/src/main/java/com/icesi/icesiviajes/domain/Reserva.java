package com.icesi.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "reservas")
@Data
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_destino", nullable = false)
    private Destino destino;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false)
    private Plan plan;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "numero_personas", nullable = false)
    private int numeroPersonas;

    @Column(name = "precio_total", nullable = false)
    private BigDecimal precioTotal;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_agente", nullable = false)
    private Usuario agente;

}
