package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.calculator.GradeAverageCalculator;
import spring.config.SpringContextConfig;

public class App {

    public static void main(String[] args) {
        //dependencyInjectionUsingSimpleJava();
        dependencyInjectionUsingSpringInternal();
        dependencyInjectionUsingSpringExternal();
    }

    private static void dependencyInjectionUsingSimpleJava() {
        final MarksDao marksDao = new ExternalMarksDao();
        final GradeAverageCalculator gradeAverageCalculator = new GradeAverageCalculator();

        System.out.println("Pažymių vidurkis: " +
                String.format("%.2f",
                        new GradeServiceInternal(marksDao, gradeAverageCalculator).averageGrade()));
    }

    private static void dependencyInjectionUsingSpringInternal() {
        final ApplicationContext springContext =
                new AnnotationConfigApplicationContext(SpringContextConfig.class);
        final GradeServiceInternal gradeServiceInternal = springContext.getBean(GradeServiceInternal.class);

        System.out.println("Pažymių vidurkis (internal): " +
                String.format("%.2f", gradeServiceInternal.averageGrade()));
    }

    private static void dependencyInjectionUsingSpringExternal() {
        final ApplicationContext springContext =
                new AnnotationConfigApplicationContext(SpringContextConfig.class);
        final GradeServiceExternal gradeServiceExternal = springContext.getBean(GradeServiceExternal.class);

        System.out.println("Pažymių vidurkis (external): " +
                String.format("%.2f", gradeServiceExternal.averageGrade()));
    }
}