package com.dj.springdatajpaex;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dj.springdatajpaex.Model.Student;
import com.dj.springdatajpaex.Repo.StudentRepo;

@SpringBootApplication
public class SpringdatajpaexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdatajpaexApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);
		
		// Student s1 = context.getBean(Student.class);
		// Student s2 = context.getBean(Student.class);
		// Student s3 = context.getBean(Student.class);
		
		// s1.setRollno(101);
		// s1.setName("Dhanunjay");
		// s1.setMarks(100);

		// s2.setRollno(102);
		// s2.setName("Dhanunjay");
		// s2.setMarks(100);

		// s3.setRollno(103);
		// s3.setName("Dhanunjay");
		// s3.setMarks(100);

		// repo.save(s2);
		// repo.save(s3);

		// System.out.println(repo.findAll());
		// Optional<Student> s = repo.findById(103);
		// System.out.println(s.orElse(new Student()));

		System.out.println(repo.findByName("Dhanunjay"));
		System.out.println(repo.findByMarks(100));
		//for update 
		//repo.save(s1);
		//for delete
		//repo.delete(s2);
	}

}
