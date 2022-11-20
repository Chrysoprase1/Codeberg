
public class Book {
    private String name;
    private int ageRecommendation;
    
    public Book (String name, int age) {
        this.name = name;
        this.ageRecommendation = age;
    }
    
    public int getAge() {
        return this.ageRecommendation;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + 
                " year-olds or older)";
    }
}
