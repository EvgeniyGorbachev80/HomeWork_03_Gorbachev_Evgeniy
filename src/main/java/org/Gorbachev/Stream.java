package org.Gorbachev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// 1. Create a Stream class containing a list of StudyGroups and implementing the Iterable interface.
public class Stream implements Iterable<StudyGroup>{
    private List<StudyGroup> studyGroups;

    public Stream() {
        studyGroups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        studyGroups.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    public int size() {
        return studyGroups.size();
    }
}

// StudyGroup class
class StudyGroup {
    private String name;

    public StudyGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
