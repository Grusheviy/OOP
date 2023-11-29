package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroupList;

    public Stream() {
        this.studyGroupList = new ArrayList<>();
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroupList;
    }

    public void setStudyGroups(List<StudyGroup> studyGroup) {
        this.studyGroupList = studyGroup;
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        studyGroupList.add(studyGroup);

    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroupList.iterator();
    }
}

