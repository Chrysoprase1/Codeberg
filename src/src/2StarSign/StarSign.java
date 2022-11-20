// prints a line, asquare, a rectangle and a triangle of *, based on input


import java.util.Scanner;

public class StarSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input line length (integer > 0):");
        printStars(Integer.valueOf (scanner.nextLine()));
        System.out.println();  // printing --- between the shapes
        
        System.out.println("Input square size (integer > 0):");
        printSquare(Integer.valueOf (scanner.nextLine()));
        System.out.println();
        
        System.out.println("Input rectangle width (integer > 0):");
        int width = Integer.valueOf (scanner.nextLine());
        System.out.println ("input rectangle height (integer > 0):");
        int height = Integer.valueOf (scanner.nextLine());
        printRectangle(width, height);
        System.out.println();
        
        System.out.println("Input triangle size (integer > 0):");
        printTriangle(Integer.valueOf (scanner.nextLine()));
        System.out.println();
    }

    public static void printStars(int number) {
        // prints a variable line of *
        int e = 0;
        for (e = 0; e < number; e++) {
            System.out.print ("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        // prints a square made of * on inputable size
        
        // prints * columns equal to value size
        int e = 0;
        for (e = 0; e < size; e++) {
            
            // prints a line of * until * equals size
            int start = 0;
            while (start < size) {
                System.out.print ("*");
                start++;
            }
            // linebreak after lenght of line has been finished
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        // prints a variable *-rectangle with inputable width and height
        // prints the column / as many lines as given height (line + linebreak);
        int e = 0;
        for (e = 0; e < height; e++) {
            
            // prints the line
            int i = 0;
            while (i < width) {
                System.out.print ("*");
                i++;
            }
            // linebreak
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        // prints a right-sided triangle of *
        
        // columns
        int e = 0;
        int starcount = 1;
        int spacecount = size - 1;
        for (e = 0; e < size; e++) {
            
            // lines
            //int starcount = 1;
            // int spacecount = size - 1;
            
            printstars(starcount);
            // printspaces(spacecount, size);
            starcount++;
            System.out.println();
        }
    }
    
    public static void printstars (int starcount) {
        int counter = 0;
        for (counter = 0; counter < starcount; counter++) {
            System.out.print ("*");
        }
    }
    
    
    public static void printspaces (int count, int size) {
        int counter = (count - size) * (-1);
        for (counter = 0; counter < size; counter++) {
            System.out.print (" ");
        }
    }
}
