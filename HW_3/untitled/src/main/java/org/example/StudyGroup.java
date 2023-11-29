package org.example;

//Создаем класс учебных групп с параметрами № группы, Имя группы и размер группы
public class StudyGroup implements Comparable<StudyGroup> {
    private int groupNumber;
    private String groupName;
    private int groupSize;

    public StudyGroup(int groupNumber, String groupName, int groupSize) {
        this.groupNumber = groupNumber;
        this.groupName = groupName;
        this.groupSize = groupSize;
    }

//Добавляем геттеры и сеттеры
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

//    Генерируем перезаписанный метод ТуСтринг для удобного вывода групп
    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupNumber='" + groupNumber + '\'' +
                ", groupName=" + groupName +
                ", groupSize=" + groupSize +
                '}';
    }

    @Override
    public int compareTo(StudyGroup o) {
        return Integer.compare(this.groupSize, o.getGroupSize());
    }
}

