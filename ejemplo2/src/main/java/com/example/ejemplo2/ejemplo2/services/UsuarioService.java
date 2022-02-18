package com.example.ejemplo2.ejemplo2.services;

import com.example.ejemplo2.ejemplo2.models.UsuarioModel;
import com.example.ejemplo2.ejemplo2.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    // devuelve todos los ususarios
    public ArrayList<UsuarioModel> obtenerUsuarios(){
       return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    // guarda a los usuarios posteados
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    // Obtiene a un usuario en especifico llamando por su id
    public Optional<UsuarioModel> obtenerPorID(Long id){
        return usuarioRepository.findById(id);
    }
    // Obtiene a todos los usuarios con cierta prioridad
    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return usuarioRepository.findByPrioridad(prioridad);
    }

    // Elimina al usuario, pero primero valida que el id si existe
    public boolean eliminarUsuario(long id){
        try {
            usuarioRepository.deleteById(id);
            return  true;
        }catch (Exception err){
            return false;
        }
    }

    // Obtener una lista de usuarios dado su nombre.
    public ArrayList<UsuarioModel> obtenerPorNombre(String  nombre){
        return usuarioRepository.findByNombre(nombre);
    }


}
