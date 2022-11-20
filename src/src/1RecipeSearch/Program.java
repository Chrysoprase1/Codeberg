// TextUI

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Program {
    private RecipeList list;
    private Scanner scanner;
    
    public Program(RecipeList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        readFile();
        menu();
        command();
        
        
    }
    
    
    public void readFile() {
        // input file
        System.out.println("File to read: ");
        String readInput = scanner.nextLine();
        
        try (Scanner scanner = new Scanner (Paths.get (readInput))) {
            
            ArrayList<String> lines = new ArrayList<>();
            
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                lines.add (input);
                
                if (input.isEmpty() || !scanner.hasNextLine()) {
                    String name = lines.get(0);
                    int cookingTime = Integer.valueOf (lines.get (1));
                    
                    ArrayList<String> ingredients = new ArrayList<>();
                    for (int i = 2; i < lines.size(); i++) {
                        ingredients.add (lines.get (i));
                    }
                    
                    Recipe recipe = new Recipe (name, cookingTime, ingredients);
                    list.add (recipe);
                    lines.removeAll (lines);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void command() {
        // commands until stop is entered
        boolean commandsRunning = true;
        while (commandsRunning) {
        System.out.println("Enter commands: ");
        String input = scanner.nextLine();
        
        switch (input) {
            case ("stop"):
                commandsRunning = false;
                break;
            case ("list"):
                list.printList();
                break;
            case ("find name"):
                System.out.println("Searched word");
                String word = scanner.nextLine();
                list.findRecipe(word);
                break;
            case ("find cooking time"):
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf (scanner.nextLine());
                list.findCookingTime (maxTime);
                break;
            case ("find ingredient"):
                System.out.println("Ingredient:");
                String findIngredient = scanner.nextLine();
                list.containsIngredient (findIngredient);
                break;
            }
        }
    }
    
    public void menu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
    }
}
        
        
        /*
        // input file try with split // not working that way
        System.out.println("File to read: ");
        String input = scanner.nextLine();
        // read input file and store it it in recipe 
        try (Scanner scanner = new Scanner (Paths.get (input))) {
            // loop until file is empty
            // arraylist as a size() method is needed to find all ingredients
            ArrayList <String> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                // loop once more until theres an empty line (single recipe end)
                while (lines.get (lines.size()).isEmpty() || scanner.hasNextLine()) {
                    String[] inputSplit = input.split ("\n");
                    String name = inputSplit[0];
                    int cookingTime = Integer.valueOf (inputSplit[1]);
                    
                    // store ingredients in different list to add 
                        // update if you find a better way to store the x lines
                    ArrayList<String> ingredientList = new ArrayList<>();
                    // start i = 2 as i = 0, 1 are name + cookingtime
                    for (int i = 2; i < lines.size(); i++) {
                        ingredientList.add (inputSplit[i]);
                    }
                    Recipe recipe = new Recipe (name, cookingTime, ingredientList);
                    list.add (recipe);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
                    */
    
