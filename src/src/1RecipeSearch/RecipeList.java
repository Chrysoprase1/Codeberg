import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> list;
    
    public RecipeList() {
        this.list = new ArrayList<>();
    }
    
    public void add (Recipe recipe) {
        this.list.add (recipe);
    }
    
    public void printList() {
        for (Recipe singleRecipe : list) {
            System.out.println(singleRecipe.toString());
        }
    }
    
    public void findRecipe (String name) {
        System.out.println("Recipes: ");
        for (Recipe singleRecipe : list) {
            if (singleRecipe.getName().contains (name)) {
                System.out.println(singleRecipe.toString());
            }
        }
    }
    
    public void findCookingTime(int cookingTime) {
        for (Recipe singleRecipe : list) {
            if (singleRecipe.getTime() <= cookingTime) {
                System.out.println(singleRecipe.toString());
            }
        }
    }
    
    public void containsIngredient (String IngredientName) {
        for (Recipe singleRecipe : list) {
            if (singleRecipe.containsIngredient (IngredientName)) {
                System.out.println(singleRecipe.toString());
            }
        }
    }
}
