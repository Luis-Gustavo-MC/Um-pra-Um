package com.LSG.Um_pra_Um.repositories;

import com.LSG.Um_pra_Um.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}