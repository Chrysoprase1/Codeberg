
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradePoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradePoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradePoints.add (points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        int grade = 0;
        int number = 0;
        double average = -1;
        
        for (int singleGrade : grades) {
            grade = grade + singleGrade;
            number = number + 1;
        }
        
        if (number > 0) {
            average = 1.0 * grade / number;
        }
        return average;
    }
    
    public double averageOfPoints() {
        int points = 0;
        int number = 0;
        double average = -1;
        
        for (int singlePoints : gradePoints) {
            points = points + singlePoints;
            number = number + 1;
        }
        
        if (number > 0) {
            average = 1.0 * points / number;
        }
        return average;
    }
}
