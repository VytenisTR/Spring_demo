package spring.calculator;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class GradeAverageCalculator {

    public Double calculateAverage(List<Integer> marks) {
        double sum = 0;

        for (Integer mark : marks) {
            sum += mark;
        }

        return sum / marks.size();
    }
}
