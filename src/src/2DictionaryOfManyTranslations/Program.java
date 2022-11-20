// program that stores words and their translations in a hashmap (String, arraylist)
// words are stored as single strings, translations as strings in an arraylist
// DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
    // includes a .add(), .remove(), .translate() method
// .add method will store as many translations as wanted
// .print will store the demanded word and return an empty list if it nonexistent
public class Program {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
