package com.icesi.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "destino")
@Data
public class Destino implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dest")
    private Long id;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tierra", nullable = false)
    private String tierra;

    @Column(name = "aire", nullable = false)
    private String aire;

    @Column(name = "mar", nullable = false)
    private String mar;

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
    @JoinColumn(name = "id_tide", nullable = false)
    private TipoDestino tipoDestino;

}
