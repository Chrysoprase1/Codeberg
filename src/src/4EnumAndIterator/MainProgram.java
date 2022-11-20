// program that stored Person objects into Employees object
// Person objects have an Education enum
// Person objects can be fired or added (whole or as list) from Employees object
public class MainProgram {

    public static void main(String[] args) {
        
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);
        
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);
        System.out.println();
        university.fire (Education.PHD);


        university.print();
    }
}
