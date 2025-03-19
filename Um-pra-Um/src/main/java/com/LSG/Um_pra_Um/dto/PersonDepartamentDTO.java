package com.LSG.Um_pra_Um.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Getter
public class PersonDepartamentDTO {
    private Long id;
    private String name;
    private Double salary;

    private DepartamentDTO departamentDTO;
}
