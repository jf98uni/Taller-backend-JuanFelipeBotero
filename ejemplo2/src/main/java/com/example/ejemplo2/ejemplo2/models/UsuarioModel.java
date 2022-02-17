package com.example.ejemplo2.ejemplo2.models;

import javax.persistence.*;


//se dice que la clase es una entidad
@Entity
// Se indica que el nombre de la tabla es usuario
@Table (name = "usuario")
public class UsuarioModel {

    // se indica que es un id que crese automaticamente, que es unico y no puede ser nulo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    // constructores de la la clase usuario y del ID

    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}


