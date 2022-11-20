// program that includes a Hold class that holds Suitcase classes that hold Item classes
    // Hold objects store Suitcase objects into arraylist until a maximum weight
    // Hold objects can print their own contents + weight + use Suitcase methods
        // Suitcase objects store Item objects until max weigh 
        // can print suitcases heaviest stored Item
        // Suitcase can print its own weight, list contents and Item methods
            // Item objects (name, weight) hold values
                // example code included in Main

public class Main {

    public static void main(String[] args) {
    
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        
        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone); 
        
        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        System.out.println();
        
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addItem(book);
        suitcase2.addItem(phone);
        suitcase2.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase2.printItems();
        System.out.println("Total weight: " + suitcase2.totalWeight() + " kg");
        
        System.out.println();
        
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        
        System.out.println();
        
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        
        System.out.println();
        
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        
    }

}
