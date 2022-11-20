// program that simulates an airport asset control as well as a flight control
// FlightControl stores airplane, flight and place objects into arraylists
// flightcontrol takes input from textui and creates objects to create new flights
// example code added, program should run like this and ask for asset control
// and then flight control
// ids can be given freely by user as there is no list with included ids

package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.TextUI.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI textUI = new TextUI(flightControl, scanner);
        textUI.start();
    }
}
