import Model.StudyGroup;
import Model.Teacher;
import Service.DataService;
import Controller.Controller;
import Service.StudyGroupService;
import View.StudentView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DataService dataService = controller.getDataService();
        StudyGroupService studyGroupService = controller.getStudyGroupService();
        StudentView studentView = controller.getStudentView();
//
//        controller.createStudent("Student_1", "Student_1", "Student_1");
//        controller.createStudent("Student_2", "Student_2", "Student_2");
//        controller.createStudent("Student_3", "Student_3", "Student_3");
//        controller.createStudent("Student_4", "Student_4", "Student_4");
//        System.out.println("All Students:");
//        controller.getAllStudents();

        Teacher teacher = studyGroupService.createTeacher("Teacher_1", "Teacher_1", "Teacher_1");

        List<String> studentFirstNames = List.of("Student_1", "Student_2", "Student_3");
        List<String> studentSecondNames = List.of("Student_1", "Student_2", "Student_3");
        List<String> studentLastNames = List.of("Student_1", "Student_2", "Student_3");

        StudyGroup studyGroup = studyGroupService.createStudyGroup(teacher,
                studyGroupService.createStudents(studentFirstNames, studentSecondNames, studentLastNames));

        System.out.println(studyGroup);
    }
}