package com.example.hw1;

import com.example.hw1.Model.Student;
import com.example.hw1.Repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Hw1Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw1Application.class, args);
	}

	// Dependency injection
	@Autowired
	StudentRepository studentRepository;

	// To add 5 items to the Database when the API is instantiated
	@PostConstruct
	public List<Student> initTable(){
		List<Student> list = studentRepository.saveAll(List.of(
				new Student("Roger Fereder", "art", 4),
				new Student("Rafael Nadal", "Physics", 4),
				new Student("Novak Djokovic", "Chemistry", 2),
				new Student("James Henderson", "Psychology", 3),
				new Student("Lenny Jacob", "History", 1)

		));
		return list;
	}
}
