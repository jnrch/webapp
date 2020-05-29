package com.jr.webapp.models.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "El campo no pude estar vacío")
    @Size(min=4, max=12, message = "El tamaño tiene que estar entre a y 12")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "El campo no puede estar vacío")
    @Column(nullable = false)
    private String apellido;

    @NotEmpty(message = "El campo no puede estar vacío")
    @Email(message = "No es una dirección de mail válida")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "La fecha no puede estar vacía")
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    private String foto;
//    @PrePersist
//    public void prePersist() {
//        createAt = new Date();
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
