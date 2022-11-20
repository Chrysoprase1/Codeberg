// program that stores values (abbreviations, explanaitions) in a hashmal
// adds, checks and prints them on demand
// example code to test it included

public class Main {

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            
            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println();
    }
}
