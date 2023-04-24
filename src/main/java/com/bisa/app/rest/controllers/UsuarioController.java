package com.bisa.app.rest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bisa.app.rest.models.UsusarioModel;
import com.bisa.app.rest.services.UsuarioService;

@RestController
@RequestMapping( "/usuario" )
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ArrayList<UsusarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public UsusarioModel guardarUsuario(@RequestBody UsusarioModel usuario ){
        return this.usuarioService.guardarUsuario(usuario);
    }
    
}
