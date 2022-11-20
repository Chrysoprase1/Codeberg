// textinterface

import java.util.Scanner;

public class Program {
    private GradeList gradeList;
    private Scanner scanner;
    
    public Program (GradeList list, Scanner scanner) {
        this.gradeList = list;
        this.scanner = scanner;
    }
    
    public void start() {
        readInputs();
        printResults();
        
        
    }
    
    public void readInputs() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int input = Integer.valueOf (scanner.nextLine());
            
            if (input == (-1)) {
                break;
            }
            
            if (input > 100 || input < 0) {
                continue;
            }
            this.gradeList.addGrade (input);
        }
    }
    
    public void printResults() {
        System.out.println("Point average (all): " + gradeList.averagePoints());
        
        if (gradeList.noPass()) {
            System.out.println("-");
        } else {
            System.out.println("Point average (passing): " 
                    +gradeList.passAveragePoints());
        }
        
        System.out.println("Pass percentage: " + gradeList.passPercent());
        gradeList.gradeDistribution();
    }
    
}
