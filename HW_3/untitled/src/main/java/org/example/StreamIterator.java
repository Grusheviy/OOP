package org.example;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {
    private List<StudyGroup> studyGroupList;
    private int counter;
    public StreamIterator(Stream stream){
        this.studyGroupList = stream.getStudyGroups();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        if(hasNext()){
            return studyGroupList.get(counter++);
        }
        return null;
    }

//    @Override
//    public void remove() {
//        if(hasNext()){
//            studyGroupList.remove(counter);
//        }
//    }
}

