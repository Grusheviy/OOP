package Controller;

import Model.Student;
import Service.UserService;
import View.StudentView;

//Реализация Dependency Inversion Principle

public class StudentController implements UserController<Student> {
    private final UserService<Student> userService;  // Используем интерфейс вместо конкретной реализации
    private final StudentView studentView;

    // Внесены изменения в конструктор
    public StudentController(UserService<Student> userService, StudentView studentView) {
        this.userService = userService;
        this.studentView = studentView;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        userService.create(firstName, secondName, lastName);
    }

    public void sendOnConsoleStudent() {
        studentView.sendOnConsole(userService.getStudentList());
    }
}
