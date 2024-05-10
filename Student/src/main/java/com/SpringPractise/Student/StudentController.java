package com.SpringPractise.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository srepo;

    @RequestMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @RequestMapping("/save")
    public String save(@RequestBody Student student){
        srepo.save(student);
        return "The Data Is Saves";
    }

    @RequestMapping("/all")
    public List<Student> all(){
        return srepo.findAll();
    }
}
