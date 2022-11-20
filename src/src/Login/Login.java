
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] users = new String [2];
        String[] passwords = new String [2];
        
        users[0] = "alex";
        users[1] = "emma";
        
        passwords [0] = "sunshine";
        passwords [1] = "haskell";
        
        System.out.println ("Enter username:");
        String input1 = scanner.nextLine();
        System.out.println ("Enter password:");
        String input2 = scanner.nextLine();

        if (input1.equals (users[0]) && input2.equals (passwords[0]) ||
                input1.equals (users[1]) && input2.equals (passwords[1])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
}
