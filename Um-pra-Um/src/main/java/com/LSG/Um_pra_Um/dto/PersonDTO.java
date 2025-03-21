package com.LSG.Um_pra_Um.dto;

import com.LSG.Um_pra_Um.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class PersonDTO {
    private Long id;
    private Double salary;
    private String name;
    private Long departamentId;

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.salary = person.getSalary();
        this.departamentId = person.getDepartment().getId();
    }

}
