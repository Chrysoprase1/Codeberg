// program that adds a Person class, inherited by Student and Teacher classes
// inherited classes add credit (students) or salary (teacher) parameters
// included overwritten toString methods to print the class objects

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        System.out.println();

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
        System.out.println();
        
        Teacher adaa = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher eskoo = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(adaa);
        System.out.println(eskoo);
        System.out.println();
        
        int i = 0;
        while (i < 25) {
          ollie.study();
          i = i + 1;
        }
        System.out.println(ollie);
        System.out.println();
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
