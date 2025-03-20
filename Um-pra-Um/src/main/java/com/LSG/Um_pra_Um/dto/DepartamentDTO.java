package com.LSG.Um_pra_Um.dto;

import com.LSG.Um_pra_Um.entities.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Getter
public class DepartamentDTO {
    private Long id;
    private String name;

    public DepartamentDTO(Department department) {
        this.id = department.getId();
        this.name = department.getName();
    }
}
