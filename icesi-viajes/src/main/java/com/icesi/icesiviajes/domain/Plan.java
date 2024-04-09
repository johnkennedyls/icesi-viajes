package com.icesi.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "plan")
@Data
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plan")
    private Long id;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "descripcion_solicitud", nullable = false)
    private String descripcionSolicitud;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "cantidad_personas", nullable = false)
    private int cantidadPersonas;

    @Column(name = "fecha_solicitud", nullable = false)
    private LocalDate fechaSolicitud;

    @Column(name = "fecha_inicio_viaje")
    private LocalDate fechaInicioViaje;

    @Column(name = "fecha_fin_viaje")
    private LocalDate fechaFinViaje;

    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;

    @Column(name = "usu_creador", nullable = false)
    private String usuCreador;

    @Column(name = "usu_modificador")
    private String usuModificador;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_clie", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_usua", nullable = false)
    private Usuario usuario;

}
