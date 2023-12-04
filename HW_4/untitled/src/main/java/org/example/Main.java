package org.example;

import org.example.Controller.StudentController;
import org.example.Controller.TeacherController;

public class Main {
    public static void main(String[] args) {
//          Семинар
//        StudentController controller = new StudentController();
//        controller.create("Stundet_1", "Stundet_1", "Stundet_1");
//        controller.create("Stundet_2", "Stundet_2", "Stundet_2");
//        controller.create("Stundet_3", "Stundet_3", "Stundet_3");
//        controller.create("Stundet_4", "Stundet_4", "Stundet_4");
//        controller.sendOnConsoleStudent();
        TeacherController controller = new TeacherController();
        controller.create("Teacher_1", "Teacher_1", "Teacher_1");
        controller.create("Teacher_2", "Teacher_2", "Teacher_2");
        controller.create("Teacher_3", "Teacher_3", "Teacher_3");
        controller.create("Teacher_4", "Teacher_4", "Teacher_4");
        controller.sendOnConsoleTeacher();
    }
}