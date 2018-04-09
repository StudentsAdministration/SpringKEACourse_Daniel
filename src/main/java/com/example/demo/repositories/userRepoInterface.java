package com.example.demo.repositories;

import com.example.demo.model.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//@Repository
public interface userRepoInterface {

    ArrayList<Student> getAllUsers();



}
