package com.example.demo.controller;


import com.example.demo.model.entities.Student;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.sql.Connection;
import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    userService US;

    ArrayList<Student> students;

    @GetMapping("/")
    public String index(Model model) {
        students = US.filterAllUSers();
        model.addAttribute("stud", students);

        return "/Home/index";
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student",   new   Student());
        return "/Home/create";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Student student) {

        int studentID = students.size() + 1;
        student.setId(studentID);

        students.add(student);

        return "redirect:/";
    }

}
