package com.proyectos.katerin.app.crud;

import org.springframework.data.repository.CrudRepository;

import com.proyectos.katerin.app.variables.Estudiante;

public interface CrudEstudiante extends CrudRepository<Estudiante, Integer> {

}
