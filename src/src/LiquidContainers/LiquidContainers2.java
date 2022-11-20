// program that 

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputSplit = input.split (" ");
            String command = inputSplit[0];
            int value = Integer.valueOf (inputSplit[1]);
            
            if (command.equals ("add")) {
                first.add (value);
            }
            
            if (command.equals ("move")) {
                int moveValue = value;
                if (first.contains() < value) {
                    moveValue = first.contains();
                }
                first.remove (moveValue);
                second.add (moveValue);
            }
            
            if (command.equals ("remove")) {
                second.remove (value);
            }

        }
    }

}
