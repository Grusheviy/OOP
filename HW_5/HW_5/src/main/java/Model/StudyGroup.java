package Model;

import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentsList;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.studentsList = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("StudyGroup:\n");

        result.append("TEACHER\n");
        result.append("teacher=").append(teacher).append('\n');

        result.append("STUDENTS\n");
        for (Student student : studentsList) {
            result.append(student).append('\n');
        }

        return result.toString();
    }
}
