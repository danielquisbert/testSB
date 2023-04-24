package com.bisa.app.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bisa.app.rest.models.UsusarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsusarioModel, Long> {
    
}
