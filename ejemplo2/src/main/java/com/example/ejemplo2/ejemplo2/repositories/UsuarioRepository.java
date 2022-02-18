package com.example.ejemplo2.ejemplo2.repositories;


import com.example.ejemplo2.ejemplo2.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

    // crea un arreglo donde se guardaran los usuarios que compartan una cierta prioridad
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

    public abstract ArrayList<UsuarioModel> findByNombre(String nombre);
}
