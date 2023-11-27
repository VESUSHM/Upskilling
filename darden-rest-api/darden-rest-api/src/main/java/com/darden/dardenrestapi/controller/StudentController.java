package com.darden.dardenrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darden.dardenrestapi.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	 
	@GetMapping("/student")
	public ResponseEntity<Student> getStudent(){
		Student student=new Student(
				1,
				"Darden",
				"Project");
		return ResponseEntity.ok()
				.header("custom-header", "Darden")
				.body(student);
	}
	// http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "sushma", "UI"));
        students.add(new Student(2, "Maha", "MS"));
        students.add(new Student(3, "Dhatri", "UI"));
        students.add(new Student(4, "Rajtha", "MS"));
        return ResponseEntity.ok(students);
    }
   // http://localhost:8080/students/1/sushma/UI
    @GetMapping("{id}/{first-name}/{role}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("role") String role){
        Student student = new Student(studentId, firstName, role);
        return ResponseEntity.ok(student);
    }
    
    
  //http://localhost:8080/students/create
    @PostMapping("/create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getRole());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
 // Spring boot REST API that handles HTTP PUT Request - updating existing resource
    //http://localhost:8080/students/14/update
      @PutMapping("{id}/update")
      public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
          System.out.println(student.getFirstName());
          System.out.println(student.getRole());
          return ResponseEntity.ok(student);
      }
  // Spring boot REST API that handles HTTP DELETE Request - deleting the existing resource
    //http://localhost:8080/students/11/delete
      @DeleteMapping("{id}/delete")
      public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
          System.out.println(studentId);
          return ResponseEntity.ok("Student deleted successfully!");
      }
  
}

	


