package com.LSG.Um_pra_Um.dto;

import com.LSG.Um_pra_Um.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Getter
public class PersonDepartamentDTO {
    private Long id;
    private String name;
    private Double salary;

    private DepartamentDTO department;

    public PersonDepartamentDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.salary = person.getSalary();
            this.department = new DepartamentDTO(person.getDepartment());

    }
}
