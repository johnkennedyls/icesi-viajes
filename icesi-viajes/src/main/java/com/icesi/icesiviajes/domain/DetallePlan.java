package com.icesi.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "detalle_plan")
@Data
public class DetallePlan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_depl")
    private Long id;

    @Column(name = "alimentacion", nullable = false)
    private String alimentacion;

    @Column(name = "hospedaje", nullable = false)
    private String hospedaje;

    @Column(name = "transporte", nullable = false)
    private String transporte;

    @Column(name = "traslados", nullable = false)
    private String traslados;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "cantidad_noches", nullable = false)
    private int cantidadNoches;

    @Column(name = "cantidad_dias", nullable = false)
    private int cantidadDias;

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
    @JoinColumn(name = "id_plan", nullable = false)
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "id_dest", nullable = false)
    private Destino destino;

}
