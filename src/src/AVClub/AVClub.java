// program that reads String inputs from user until user input is empty
// the program will split the inputs by the spaces and print only words containing "av"

import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            String[] inputSplit = input.split (" ");
            
            for (int i = 0; i < inputSplit.length; i++) {
                if (inputSplit[i].contains ("av")) {
                    System.out.println (inputSplit [i]);
                }
            }
            
            if (input.equals ("")) {
                break;
            }
        }
    }
}
