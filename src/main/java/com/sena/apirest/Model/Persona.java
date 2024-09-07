package com.sena.apirest.Model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Basic

    private String firstname;
    
    @Basic

    private String lastname;
    
    @Basic

    private String email;
}
