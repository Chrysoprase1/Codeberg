// progoram that stores points and correlating grades into GradeRegister class
// can print it via UserInterface class as well as print number of grades as *

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(82);
        register.addGradeBasedOnPoints(83);
        register.addGradeBasedOnPoints(96);
        register.addGradeBasedOnPoints(51);
        register.addGradeBasedOnPoints(48);
        register.addGradeBasedOnPoints(56);
        register.addGradeBasedOnPoints(61);

        System.out.println(register.averageOfGrades());
        System.out.println(register.averageOfPoints());
        
    }
}
