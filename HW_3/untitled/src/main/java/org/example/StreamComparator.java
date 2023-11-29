package org.example;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int sizeOfStream1 = stream1.getStudyGroups().size();
        int sizeOfStream2 = stream2.getStudyGroups().size();

        if (sizeOfStream2 > sizeOfStream1){
            System.out.println("\nStream2 have more StudyGroups then Stream1");
        } else if (sizeOfStream2 < sizeOfStream1) {
            System.out.println("\nStream1 have more StudyGroups then Stream2");
        } else {
            System.out.println("\nSize of StudyGroups in Stream1 and Stream2 is equal");
        }
        return Integer.compare(sizeOfStream2, sizeOfStream1);
    }
}
