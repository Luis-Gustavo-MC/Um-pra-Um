package com.LSG.Um_pra_Um.repositories;

import com.LSG.Um_pra_Um.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
