import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BirdLibrary list = new BirdLibrary();
        Program UI = new Program (list, scan);
        
        UI.start();
    }

}
