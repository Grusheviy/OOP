package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public Stream getStudyStream() {
        return stream;
    }

    public List<StudyGroup> getSortedStream() {
        List<StudyGroup> studyGroupList = new ArrayList<>(stream.getStudyGroups());
        Collections.sort(studyGroupList);
        return studyGroupList;
    }
}
