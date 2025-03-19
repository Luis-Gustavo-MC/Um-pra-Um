package com.LSG.Um_pra_Um.services;

import com.LSG.Um_pra_Um.dto.PersonDepartamentDTO;
import com.LSG.Um_pra_Um.entities.Person;
import com.LSG.Um_pra_Um.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {
    @Autowired
    PersonRepository repository;

    public PersonDepartamentDTO insert(PersonDepartamentDTO dto){
        Person entity = new Person();
        return null;
    }


}
