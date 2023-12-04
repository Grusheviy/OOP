package org.example.Service;

import org.example.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Student i: studentList) {
            if (maxId < i.getStudentId())
                maxId = i.getStudentId();
        }
        maxId++;
        studentList.add(new Student(maxId, firstName, secondName, lastName));

    }
}
