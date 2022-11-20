// program can ask user to do command inputs (add, draw, print a joke
// jokes are stored in an arraylist variable in JokeManager class
// textinterface included

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
