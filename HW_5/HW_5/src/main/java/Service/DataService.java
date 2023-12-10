package Service;

import Model.Student;
import Model.Teacher;
import Model.Type;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService <T extends User> {

    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public int getMaxId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }
    public List<User> getAllStudents() {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }
    public List<User> getUserList(){
        return userList;
    }
}
