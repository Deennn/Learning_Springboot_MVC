package com.deenn.school_management_app;

import com.deenn.school_management_app.entity.Student;
import com.deenn.school_management_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementAppApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("awal@gmail.com","Abideen","abayomi");
//        studentRepository.save(student1);
//        Student student2 = new Student("Drlington@gmail.com " , "Oleleww", "olelewe");
//        studentRepository.save(student2);
//        Student student3 = new Student("Law@gmail.com","Abideen","abaom");
//        studentRepository.save(student3);
//        Student student4 = new Student("Darlingtn@gmail.com " , "Oleleww", "olelew");
//        studentRepository.save(student4);
//        Student student5 = new Student("Darlingto@gmail.com " , "Oleleww", "olele");
//        studentRepository.save(student5);
    }

}
