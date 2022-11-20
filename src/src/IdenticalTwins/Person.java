
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared) {
        // true / equal if compared and this are stored in same location
        if (this == compared) {
            return true;
        }
        // false / not equal if compared is not a Person object
        if (!(compared instanceof Person)) {
            return false;
        }
        // true if every compared variable are the same as this(variables)
        // birthday equalsmethod is check with boolean method in simpleData.java
        Person comparedPerson = (Person) compared;
        
        if (this.name.equals (comparedPerson.name) &&
                this.birthday.equals (comparedPerson.birthday) &&
                this. height == comparedPerson.height &&
                this.weight == comparedPerson.weight) {
            return true;
        }
        return false;
    }
}
