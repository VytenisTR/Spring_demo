package spring;

import java.util.List;

public class ExternalMarksDao implements MarksDao {

    public List<Integer> getMarks() {
        return List.of(2, 4, 5, 3, 2, 6, 5);
    }
}
