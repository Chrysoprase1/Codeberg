// program that has Person class nad Room class
// person objects can be stored in room arraylist
// room objects can print, add 
// or show / remove the shortest person objects from it 
public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        
        System.out.println();
        
        Room room2 = new Room();
        room2.add(new Person("Lea", 183));
        room2.add(new Person("Kenya", 182));
        room2.add(new Person("Auli", 186));
        room2.add(new Person("Nina", 172));
        room2.add(new Person("Terhi", 185));

        while (!room2.isEmpty()) {
            System.out.println(room2.take());
        }
    }
}
