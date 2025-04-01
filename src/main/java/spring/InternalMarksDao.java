package spring;

import java.util.List;

public class InternalMarksDao implements MarksDao {

    public List<Integer> getMarks() {
        return List.of(1, 7, 10, 5, 6, 4, 3);
    }
}
