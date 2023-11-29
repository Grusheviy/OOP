package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup(1, "OOP_1", 20);
        StudyGroup group2 = new StudyGroup(2, "PYTHON", 14);
        StudyGroup group3 = new StudyGroup(3, "JAVA_1", 50);
        StudyGroup group4 = new StudyGroup(4, "OOP_2", 48);
        StudyGroup group5 = new StudyGroup(5, "PYTHON_2", 30);

        Stream stream1 = new Stream();
        stream1.addStudyGroup(group1);
        stream1.addStudyGroup(group2);

        Stream stream2 = new Stream();
        stream2.addStudyGroup(group3);
        stream2.addStudyGroup(group4);
        stream2.addStudyGroup(group5);

        StreamService streamService1 =new StreamService(stream1);
        List<StudyGroup> sortedStudyGroups1 = streamService1.getSortedStream();
        System.out.println("Stream1:");
        for (StudyGroup group : sortedStudyGroups1) {
            System.out.println(group);
        }

        StreamService streamService2 = new StreamService(stream2);
        List<StudyGroup> sortedStudyGroups2 = streamService2.getSortedStream();
        System.out.println("Stream2:");
        for (StudyGroup group : sortedStudyGroups2) {
            System.out.println(group);
        }
        StreamComparator streamComparator = new StreamComparator();
        int comparisonResult = streamComparator.compare(stream1, stream2);

    }
}