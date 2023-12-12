package Model;

//Реализация Liskov Substitution Principle
//Создан подкласс, который расширяет UserComparator для сравнения дополнительных полей, для класса Student
public class StudentComparator extends UserComparator<Student>{

    @Override
    protected int compareAdditionalFields(Student o1, Student o2) {
        return Integer.compare(o1.getStudentId(), o2.getStudentId());
    }
}