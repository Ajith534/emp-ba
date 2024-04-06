package com.EmployeeManagement.demo.repository;
import com.EmployeeManagement.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
