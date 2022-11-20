// program that sorts a given ArrayList<Student> alphabetically
    // override in Student.java

public class MainProgram {

    public static void main(String[] args) {
        
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
    }
}
