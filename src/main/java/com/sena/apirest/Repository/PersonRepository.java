package com.sena.apirest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.apirest.Model.Persona;

@Repository
public interface  PersonRepository extends JpaRepository <Persona,Integer>{




}
