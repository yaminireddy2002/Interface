package com.rest.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	@Query("SELECT s.studentid As studentId, s.name As name, s.gender As gender   FROM Student s")  
	List<StudentProjection> findAllProjectedBy();
	
	
	@Query(value="SELECT s.studentid As studentId, s.name As name, s.gender As gender  FROM Student s", nativeQuery=true)
	List<StudentProjection> fetchAllFields();
	

}
