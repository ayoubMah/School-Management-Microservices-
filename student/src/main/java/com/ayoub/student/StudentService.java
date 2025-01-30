package com.ayoub.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo ;

    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> finadAllStudent(){
        return studentRepo.findAll();
    }


}
