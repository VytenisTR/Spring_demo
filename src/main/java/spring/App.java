package spring;

public class App {

    public static void main(String[] args) {
        MarksDao marksDao = new ExternalMarksDao();

        System.out.println("Pažymių vidurkis: " +
                String.format("%.2f", new GradeService(marksDao).averageGrade()));
    }
}