package com.deenn.school_management_app.repository;

import com.deenn.school_management_app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
