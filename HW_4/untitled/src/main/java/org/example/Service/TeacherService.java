package org.example.Service;

import org.example.Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final List<Teacher> teacherList;
    public TeacherService() {this.teacherList = new ArrayList<>();
    }
    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher i: teacherList) {
            if (maxId < i.getTeacherId())
                maxId = i.getTeacherId();
        }
        maxId++;
        teacherList.add(new Teacher(maxId, firstName, secondName, lastName));
    }
}
