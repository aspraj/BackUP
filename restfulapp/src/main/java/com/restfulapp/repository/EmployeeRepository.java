package com.restfulapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restfulapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Long>{


	@Query("FROM Employee e where e.name=:eName")
	Employee findEmployeeByName(@Param("eName") String name);
	
	@Modifying
	@Query("update Employee e set e.name=:name where e.id=:id")
	Integer updateEmployee(@Param("id") Integer id,@Param("name") String name);

}
