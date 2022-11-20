import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe (String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.cookingTime;
    }
    
    public void addIngredient (String ingredient) {
        this.ingredients.add (ingredient);
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public boolean containsIngredient (String ingredientName) {
        for (String singleIngredients : ingredients) {
            if (singleIngredients.equals (ingredientName)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this. cookingTime;
    }
}
