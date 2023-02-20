package com.knoldus.springdatajpademo2.repository;

import com.knoldus.springdatajpademo2.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student= Student.builder()
                .firstName("abc")
                .lastName("xyz")
                .emailId("abc123@gmail.com")
                .guardianName("www")
                .guardianEmail("ww12345@gmail.com")
                .guardianMobile("1234569870")
                .build();
        studentRepository.save(student);
    }
}