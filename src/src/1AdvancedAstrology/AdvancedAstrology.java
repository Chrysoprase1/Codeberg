// prints a christmas tree of *
    // variable height
    // trunk position scaled to trunk width == 3

import java.util.Scanner;

public class AdvancedAstrology {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println ("This program prints you a christmas tree, "
                    + "enter an integer of choice for the size:");
            System.out.println ("Close the program by entering 0.");
            int input = Integer.valueOf (scanner.nextLine());
            int size = Integer.valueOf (input);
            christmasTree(size);
            System.out.println();
            
            if (input == 0) {
                break;
            }
        }
    }    
        

    public static void printStars(int number) {
        int i = 0;
        for (i = 0; i < number; i++) {
            System.out.print ("*");
        }
    }

    public static void printSpaces(int number) {
        int i = 0;
        for (i = 0; i < number; i++) {
            System.out.print (" ");
        }
    }

    public static void printTriangle(int size) {
        // prints a right leaning triangle
        int line = 0;
        int starCount = 1;
        int spaceCount = size - starCount;
        for (line = 0; line < size; line++) {
            // prints the triangle line from top
            // starts with (size - 1 spaces) + *
            // ends with (size*) + 0 spaces (size - size);
            printSpaces (spaceCount);
            printStars(starCount);
            System.out.println();
            starCount++;
            spaceCount--;
        }
    }

    public static void christmasTree(int height) {
        int line = 0;
        int starCount = 1;
        int spaceCount = height - starCount;
        
        if (height <= 2) {
            System.out.println ("Its just a trunk...");
        }
        
        for (line = 0; line < height; line++) {
            printSpaces (spaceCount);
            printStars (starCount);
            System.out.println();
            starCount += 2;
            spaceCount --;
        }
        treeTrunk(height);
    }
    
    public static void treeTrunk(int height) {
        // prints the trunk (rectangle of *)
        // trunk spaces automatically to be in the center
        // adjust trunkwiwidth and height here
        int trunkHeight = 2;
        int trunkWidth = 3;
        int spacesForTrunk = ((height +1) - trunkWidth);
       
        int i = 0;
        
        for (i= 0; i < trunkHeight; i++) {
            printSpaces (spacesForTrunk);
            printStars (trunkWidth);
            System.out.println();
        }
    }
}
