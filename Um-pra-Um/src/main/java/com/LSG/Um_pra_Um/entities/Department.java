package com.LSG.Um_pra_Um.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_department")
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;
    @Setter
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Person> people = new ArrayList<>();

}

