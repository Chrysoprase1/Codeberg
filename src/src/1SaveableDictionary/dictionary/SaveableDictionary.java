
package dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {
    private String fileName;
    private HashMap<String, String> list;
    private Scanner scanner;
    
    public SaveableDictionary() {
        this.list = new HashMap<>();
    }
    
    public SaveableDictionary(String fileName) {
        this.fileName = fileName;
        this.scanner = scanner;
        this.list = new HashMap<>();
    }
    
    public boolean load () {
        if (!this.fileName.isEmpty()) {
            try (Scanner scanner = new Scanner (Paths.get (fileName))) {
                while (scanner.hasNextLine()) {
                    String row = scanner.nextLine();
                    String[] rowsplit = row.split (":");
                    String word = rowsplit[0];
                    String translation = rowsplit[1];
                    
                    this.list.put (word, translation);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            return true;
        }
        return false;
    }
    
    public boolean save() {
        
        try (PrintWriter writer = new PrintWriter (fileName);) {
            for (String key : this.list.keySet()) {
                String word = key;
                String translation = this.list.get (key);
            
                if (!this.list.containsKey (word) || 
                !this.list.containsValue (word)) {
                    writer.println (word + ":" + translation);
                }
            }
        } catch (Exception e) {
            System.out.println("Errot: " + e);
        }
        return true;
    }
            
            
        
            
    public void add (String word, String translation) {
        if (this.list.containsKey (word)) {
            
        } else {
            this.list.put (word, translation);
        }
    }
    
    public String translate (String word) {
        if (this.list.containsKey (word)) {
            return this.list.get (word);
        }
        String keys = null;
        if (this.list.containsValue (word)) {
            for (String key : this.list.keySet()) {
                if (this.list.get (key).equals (word)) {
                    keys = key;
                }
            }
        }
        return keys;
    }
    
    public void delete (String word) {
        // stream() might be fancier, but this is way too simple to not do it
        String translatedWord = translate (word);
        this.list.remove (word);
        this.list.remove (translatedWord);
    }
}
