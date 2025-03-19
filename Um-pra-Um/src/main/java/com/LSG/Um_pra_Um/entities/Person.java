package com.LSG.Um_pra_Um.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_person")
@AllArgsConstructor @NoArgsConstructor @Getter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;
    @Setter
    private String name;
    @Setter
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
