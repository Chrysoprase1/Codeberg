import java.util.ArrayList;




public class GradeList {
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> gradesList;
    private int passes;
    
    public GradeList () {
        this.pointsList = new ArrayList<Integer>();
        this.gradesList = new ArrayList<Integer>();
        this.passes = 0;
    }
    
    public int pointsToGrade (int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        }
        return 5;
    }
    
    public void addGrade (int points) {
        this.pointsList.add (points);
        this.gradesList.add (pointsToGrade (points));
        if (pointsToGrade(points) >= 1) {
            this.passes = this.passes + 1;
        }
    }
    
    public double averagePoints () {
        // return -1 if empty
        if (this.pointsList.isEmpty()) {
            return -1;
        }
        // calc allpoints and / with number of grades in arraylist
        int allPoints = 0;
        double average = 0;
        for (int singleGrade : this.pointsList) {
            allPoints =  allPoints + singleGrade;
        }
        
        average = 1.0 * allPoints / (this.pointsList.size());
        return average;
    }
    
    
    public double averageGrade () {
        if (this.gradesList.isEmpty()) {
            return -1;
        } 
        
        int allGrades = 0;
        double average = 0;
        for (int singleGrade : gradesList) {
            allGrades = allGrades + singleGrade;
        }
        
        average = 1.0 * allGrades / (gradesList.size());
        return average;
    }
    
    public double passPercent () {
        return (100.0 * this.passes) / (this.gradesList.size());
    }
    
    public double passAveragePoints () {
        if (this.gradesList.isEmpty()) {
            return -1;
        }
        
        int allPoints = 0;
        double average = 0;
        for (int singleGrade : pointsList) {
            if (singleGrade >= 50) {
                allPoints = allPoints + singleGrade;
            }
        }
        average = 1.0 * allPoints / (this.passes);
        return average;
    }
    
    public double passAverageGrade () {
        if (this.gradesList.isEmpty()) {
            return -1;
        }
        
        int passGrades = 0;
        double passPercent = 0;
        for (int singleGrade : this.gradesList) {
            if (singleGrade >= 1) {
                passGrades = passGrades + singleGrade;
            }
        }
        passPercent = 1.0 * passGrades / (this.passes);
        return passPercent;
    }
    
    public int singleGradeDistribution (int grade) {
        int amountOfGrade = 0;
        for (int singleGrade : gradesList) {
            if (singleGrade == grade) {
                amountOfGrade = amountOfGrade + 1;
            }
        }
        return amountOfGrade;
    }
    
    public void gradeDistribution () {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            for (int stars = singleGradeDistribution (grade); stars > 0; stars--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public boolean noPass() {
        boolean noPass = true;
        if (this.passes > 0) {
            noPass = false;
        }
        return noPass;
    }
}
