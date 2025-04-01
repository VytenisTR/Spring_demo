package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.calculator.GradeAverageCalculator;

@Service
public class GradeServiceExternal {
    private final MarksDao marksDao;
    private final GradeAverageCalculator gradeAverageCalculator;

    public GradeServiceExternal(@Qualifier("externalMarksDao") MarksDao marksDao,
                                final GradeAverageCalculator gradeAverageCalculator) {
        this.marksDao = marksDao;
        this.gradeAverageCalculator = gradeAverageCalculator;
    }

    public Double averageGrade() {
        return gradeAverageCalculator.calculateAverage(marksDao.getMarks());
    }
}
