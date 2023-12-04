package org.example.Controller;

import org.example.Model.Student;
import org.example.Service.StudentService;
import org.example.View.StudentView;

public class StudentController implements UserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    public void sendOnConsoleStudent(){
        studentView.sendOnConsole(studentService.getStudentList());
    }
}
