package com.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
	
	@Autowired
    private StudentRepository studentrepo;

    public List<StudentProjection> getAllStudents() {
        return studentrepo.findAllProjectedBy();
    }
	
    
    public List<StudentProjection> getAllFields(){
    	return studentrepo.fetchAllFields();
    }

}
