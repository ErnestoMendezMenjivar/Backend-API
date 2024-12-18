/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.Backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

/**
 *
 * @author duglas
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "nombre es requerido")
    @Size(min = 4, max = 20, message = "nombre debe tener entre 4 y 12 caracteres")
    @Column(name = "nombre", columnDefinition = "VARCHAR(255) NOT NULL", nullable = false)
    private String nombre;

    @NotEmpty(message = "apellido es requerido")
    @Size(min = 4, max = 20, message = "apellido debe tener entre 4 y 12 caracteres")
    @Column(name = "apellido", columnDefinition = "VARCHAR(255) NOT NULL")
    private String apellido;

    @NotEmpty(message = "email es requerido")
    @Email
    @Column(name = "email", columnDefinition = "VARCHAR(255) NOT NULL", nullable = false, unique = true )
    private String email;

    @NotNull(message = "fecha es requerido")
    @Column(name = "create_at")
    //@Temporal(TemporalType.LocalDate)//TIMESTAMP
    private LocalDate createAt;
    
    
    private String foto;
    
    @NotNull(message = "la region no puede estar vacio")
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="region_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Region region;
    
    //@PrePersist
    //public void prePersist(){
    //    createAt = new Timestamp(System.currentTimeMillis());
    //}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }
    
        public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    
}
