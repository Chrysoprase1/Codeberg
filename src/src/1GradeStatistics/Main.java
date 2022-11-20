// program that asks the user for points inputs (0-100) 
// via textinterface (class Program)
// program will store an GradeList arraylist
// GradeList stores points themselves as well as convert them into a fitting grade
// Program prints average points, passing points, passing percentage as well as
// a grade distribution


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeList list = new GradeList ();
        Scanner scanner = new Scanner(System.in);
        
        Program UI = new Program (list, scanner);
        UI.start();
    }
}
