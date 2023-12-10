package Service;

import Model.Student;
import Model.Teacher;
import Model.StudyGroup;
import Model.Type;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private final DataService service;

    public StudyGroupService(DataService service) {
        this.service = service;
    }

    public Teacher createTeacher(String firstName, String secondName, String lastName) {
        return new Teacher(firstName, secondName, lastName, service.getMaxId(Type.TEACHER));
    }

    public List<Student> createStudents(List<String> studentFirstNames, List<String> studentSecondNames, List<String> studentLastNames) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentFirstNames.size(); i++) {
            int studentId = service.getMaxId(Type.STUDENT) + i;
            students.add(new Student(studentFirstNames.get(i), studentSecondNames.get(i), studentLastNames.get(i), studentId));
        }
        return students;
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
