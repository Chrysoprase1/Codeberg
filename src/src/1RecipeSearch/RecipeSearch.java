// program that reads a txtfile and prints out the recipe
// can print all recipes or single recipe based on name, time or ingredient

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeList list = new RecipeList();
        Program UI = new Program(list, scanner);
        
         UI.start();
        
        /* ArrayList<String> ings = new ArrayList<>();
        ings.add ("flour");
        ings.add ("sugar");
        ings.add ("milk");
        
        ArrayList<String> ing = new ArrayList<>();
        ing.add ("flour");
        ing.add ("sugar");
        ing.add ("milk");
        ing.add ("eggs");
        
        Recipe cake = new Recipe ("cake", 10, ings);
        Recipe eggs = new Recipe ("eggs", 5, ing);
        
        System.out.println(cake.toString());
        System.out.println(eggs.toString());
        System.out.println();
        
        list.add (cake);
        list.add (eggs);
        list.printList();
        */
    }

}
