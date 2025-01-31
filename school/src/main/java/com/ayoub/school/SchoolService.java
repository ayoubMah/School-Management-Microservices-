package com.ayoub.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo schoolRepo ;

    public void saveSchool(School school){
        schoolRepo.save(school);
    }

    public List<School> finadAllSchool(){
        return schoolRepo.findAll();
    }


}
