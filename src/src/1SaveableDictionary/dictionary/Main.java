// program that adds, reads or deletes words and their translations
// Strings are stored in a HashMap<word, translation> in Class SaveableDictionary
// every method works with either word - translation or translation - word
// program can also read, store and add translations from and to a file
// the file iteself  has the format of 2 Strings per line, separated by a :
    // example: (word:translation)\n(apfel, apple)\n ... and so on...
    // file was named words.txt in the code and may be changed at Class
    // method load() will return false if the file does not exist
    // exception is already handled in method save() and doent need to be thrown
    // program will save the new full file after loading instead of adding to it
        // using methods add(word, translation) / delete (word or translation) 
        // method delete (word) works on entering either key or value of the map
        // after load() and before save() will add/delete it in the txt file too
        // program may translate from key to value or value to key (hashmap)
        // will save every word/translation once even if key/value are switched
        // loading multiple different lists and saving will store a merged version

package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("apina", "apfe");
        dictionary.add ("apfel", "apple");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate ("apfel"));
        System.out.println(dictionary.translate ("apple"));
        System.out.println();
        
        dictionary.delete("apina");
        dictionary.delete("banana");
        
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println();
        
        SaveableDictionary dictionary2 = new SaveableDictionary("words.txt");
        dictionary2.load();
        dictionary2.add ("apina", "monkey");
        dictionary2.add ("aaaa", "ddddd");
        dictionary2.add ("ffffff", "rrrrr");
        dictionary2.delete ("ffffff");
        dictionary2.add ("phuong", "specki");
        dictionary2.add ("hau", "auh");
        dictionary2.delete ("specki");
        dictionary2.delete ("hau");
        dictionary2.save();

    }
}
