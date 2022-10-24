package com.zaurtregulov.spring.springboot.spring_data_rest.dao;

import com.zaurtregulov.spring.springboot.spring_data_rest.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
