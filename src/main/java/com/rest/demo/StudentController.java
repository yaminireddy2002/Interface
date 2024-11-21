package com.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<StudentProjection> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    
    @GetMapping("/students/native")
    public List<StudentProjection> getAllstu(){
    	return studentService.getAllFields();
    }
	
	

}
