package com.example.ejemplo2.ejemplo2.repositories;


import com.example.ejemplo2.ejemplo2.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
