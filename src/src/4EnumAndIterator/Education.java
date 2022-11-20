
public enum Education {
    PHD("Doctoral degree"), 
    MA("Masters degree"), 
    BA("Bachelors degree"), 
    HS("Highschool degree");
    
    private String degree;
    
    private Education (String fullDegree) {
        this.degree = fullDegree;
    }
    
    private String getEducation() {
        return this.degree;
    }
}
