package com.example.demo.service;

import com.example.demo.model.entities.Student;
import com.example.demo.repositories.userRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userService {

    @Autowired
    userRepoInterface UR;

    public ArrayList<Student> filterAllUSers() {
        // Do stuff here...
        // filter, sort, manipulate
        return UR.getAllUsers();
    }

}
