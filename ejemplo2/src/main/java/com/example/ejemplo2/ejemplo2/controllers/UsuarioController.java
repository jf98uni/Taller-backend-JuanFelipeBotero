package com.example.ejemplo2.ejemplo2.controllers;

import com.example.ejemplo2.ejemplo2.models.UsuarioModel;
import com.example.ejemplo2.ejemplo2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    // Conecta a controller con service
    @Autowired
    UsuarioService usuarioService;

    // inicia la funcion get, lo que consultara los datos almacenados y los retorna
    @GetMapping()
    public ArrayList<UsuarioModel>obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    // inicia la funcion post, lo que agrega nuevos usuarios al array
    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }
    // inicializa la busqueda de un usuario dado su id y lo retorna
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId (@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorID(id);
    }
    // // inicializa la busqueda de los usuarios que compartan una priorida y los retorna en un array
    @GetMapping(path = "/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad (@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }
    // inicializa el proceso de eliminacion de un usuario de la base de datos dado su id
    @DeleteMapping (path = "/{id}")
    public String eliminarPorID(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "Se elimino el usuario con id" + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }

    }

    // // inicializa la busqueda de los usuarios que compartan el mismo nombre y los retorna en un array
    @GetMapping(path = "/name")
    public ArrayList<UsuarioModel> obtenerUsuarioPorNombre (@RequestParam("nombre") String nombre){
        return this.usuarioService.obtenerPorNombre(nombre);
    }



}
