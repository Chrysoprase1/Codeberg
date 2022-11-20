// program that adds Strings into an arraylist via interface
// can add, remove, print contents

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList list = new TodoList();
        list.add("one");
        list.add("two");
        list.add("three");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);

        ui.start();
        list.print();
    }
}
