package spring;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class InternalMarksDao implements MarksDao {

    public List<Integer> getMarks() {
        return List.of(1, 7, 10, 5, 6, 4, 3);
    }
}
