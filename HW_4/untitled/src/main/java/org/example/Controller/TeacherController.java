package org.example.Controller;

import org.example.Model.Teacher;
import org.example.Service.StudentService;
import org.example.Service.TeacherService;
import org.example.View.StudentView;
import org.example.View.TeacherView;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
     teacherService.create(firstName, secondName, lastName);
    }
    public void sendOnConsoleTeacher(){teacherView.sendOnConsole(teacherService.getTeacherList());}
}
