package com.proyectos.katerin.app.crud;

import org.springframework.data.repository.CrudRepository;

import com.proyectos.katerin.app.variables.Usuarios;

public interface CrudUsuarios extends CrudRepository<Usuarios, Integer> {

}
