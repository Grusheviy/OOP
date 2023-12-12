import Controller.StudentController;
import Controller.UserController;
import Model.Student;
import Service.StudentService;
import View.StudentView;

public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр StudentController используя реализацию есть реализация UserService<Student> и StudentView
        UserController<Student> controller = new StudentController(new StudentService(), new StudentView());
        controller.create("qwe", "qwe", "qwe");
        controller.create("vqwe", "asvxw", "avwe");
        controller.create("qevcxq", "tvqwx", "axqwv");
        controller.create("qwvex", "wqevv", "eeqvwv");
        ((StudentController) controller).sendOnConsoleStudent();
    }
}