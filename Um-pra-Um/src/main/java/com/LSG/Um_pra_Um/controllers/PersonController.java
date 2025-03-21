package com.LSG.Um_pra_Um.controllers;

import com.LSG.Um_pra_Um.dto.PersonDTO;
import com.LSG.Um_pra_Um.dto.PersonDepartamentDTO;
import com.LSG.Um_pra_Um.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
    @Autowired
    private PersonServices services;
    //@PostMapping
    public ResponseEntity<PersonDepartamentDTO> insert(@RequestBody PersonDepartamentDTO dto){
         dto = services.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
    @PostMapping
    public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO dto){
        dto = services.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
