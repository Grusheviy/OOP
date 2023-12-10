package Controller;

import Model.Student;
import Model.Teacher;
import Model.StudyGroup;
import Model.Type;
import Model.User;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService(service);
    private final StudentView studentView = new StudentView();
    private final List<Student> createdStudents = new ArrayList<>();

    public List<User> getUserList() {
        return service.getUserList();
    }

    public DataService getDataService() {
        return service;
    }

    public StudyGroupService getStudyGroupService() {
        return studyGroupService;
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public void createStudent(String firstName, String secondName, String lastName){
        Student student = new Student(firstName, secondName, lastName, service.getMaxId(Type.STUDENT));
        createdStudents.add(student);
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllStudents(){
        List<User> userList = service.getAllStudents();
        for (User user: userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public StudyGroup createStudyGroup(String teacherFirstName, String teacherSecondName, String teacherLastName) {
        // Получение преподавателя
        Teacher teacher = new Teacher(teacherFirstName, teacherSecondName, teacherLastName, service.getMaxId(Type.TEACHER));

        // Используем ранее созданных студентов
        List<Student> students = new ArrayList<>(createdStudents);

        // Формирование учебной группы
        return studyGroupService.createStudyGroup(teacher, students);
    }
}
