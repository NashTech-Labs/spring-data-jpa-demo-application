package com.knoldus.springdatajpademo2.repository;

import com.knoldus.springdatajpademo2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
