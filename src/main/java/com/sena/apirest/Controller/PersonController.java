package com.sena.apirest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.apirest.Model.Persona;
import com.sena.apirest.Service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<String> createPersona(@RequestBody Persona person) {
        try {
            personService.createPersona(person);
            return ResponseEntity.status(HttpStatus.CREATED).body("Persona creada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear la persona");
        }
    }

}
