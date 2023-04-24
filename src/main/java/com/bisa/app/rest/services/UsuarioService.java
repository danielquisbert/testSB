package com.bisa.app.rest.services;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bisa.app.rest.models.UsusarioModel;
import com.bisa.app.rest.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsusarioModel> obtenerUsuarios(){
        return (ArrayList<UsusarioModel>)usuarioRepository.findAll();
    }
    public UsusarioModel guardarUsuario(UsusarioModel usuario ){
        return usuarioRepository.save(usuario);
    }

}
