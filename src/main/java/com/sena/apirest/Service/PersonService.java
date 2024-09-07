package com.sena.apirest.Service;

import org.springframework.stereotype.Service;

import com.sena.apirest.Model.Persona;
import com.sena.apirest.Repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepos;

    public void createPersona(Persona person){
            personRepos.save(person);
    }
}
