package Service;

import Model.Student;

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


    //Реализация Single Responsibility Principle
    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = findMaxStudentId();
        studentList.add(new Student(maxId + 1, firstName, secondName, lastName));
    }

    private int findMaxStudentId() {
        return studentList.stream()
                .mapToInt(Student::getStudentId)
                .max()
                .orElse(0);
    }
}