package com.akash.studentmanagment.controller;

import com.akash.studentmanagment.model.Response;
import com.akash.studentmanagment.model.Student;
import com.akash.studentmanagment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
   StudentRepository studentRepository;
    @PostMapping("/saveStudent")
    public @ResponseBody Response SaveStudent(@RequestBody Student student){
        Response response = new Response();
        studentRepository.save(student);
        response.setMessage("Record has been inserted:");
        return response;

    }


}
