package com.example.demo.repositories;

import com.example.demo.model.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class userRepo implements userRepoInterface {

    ArrayList<Student> students = new ArrayList<>();

    public userRepo() {

        students.add(new Student(1,"Claus", 34));
        students.add(new Student(2,"Bob", 44));
        students.add(new Student(3,"Ole", 14));
    }

    @Override
    public ArrayList<Student> getAllUsers() {
        return students;
    }
}
