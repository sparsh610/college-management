package com.gcp.college_management.repo;


import com.gcp.college_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom queries here if needed
    // Example: List<Student> findByDepartment(String department);
}
