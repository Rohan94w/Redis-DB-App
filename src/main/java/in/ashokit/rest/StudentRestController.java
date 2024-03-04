package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository srepo;
	
	@GetMapping("/students")
	public Iterable<Student> getAllStudents(){
		return srepo.findAll();
	}
	
	@PostMapping("/student")
	public String addStudnet(@RequestBody Student Student) {
		
		srepo.save(Student);
		return "Student Added";
	}
	
}
