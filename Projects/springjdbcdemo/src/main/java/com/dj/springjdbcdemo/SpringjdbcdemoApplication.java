package com.dj.springjdbcdemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dj.springjdbcdemo.Model.Student;
import com.dj.springjdbcdemo.Model.StudentDAO;
import com.dj.springjdbcdemo.Service.StudentService;

@SpringBootApplication
public class SpringjdbcdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcdemoApplication.class, args);
		
		// Student s = context.getBean(Student.class);
		
		// s.setRollno(100);
		// s.setMarks(78);
		// s.setName("Dhanunjay");

		StudentDAO student = context.getBean(StudentDAO.class);

		student.setMarks(80);
		student.setName("Dhanunjay");

		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(student);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
