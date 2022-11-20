// program that reads a file names "literacy.csv" 
    // literacy.csv format in order: theme, age group, gender, country, year, literacy percent
// program will print some line contets: country(year), gender, literacy percentage
// the printed outcome is sorted by literacy percentage (low to high)

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        try {
            Files.lines (Paths.get ("literacy.csv")).forEach (row -> list.add (row));
        } catch (Exception e) {
            System.out.println("Errot: " + e);
        }
        
        list.stream()
                .map (row -> row.split (","))
                .filter (parts -> parts.length <= 6)
                .sorted ((p1, p2) -> {
                    return p1[5].compareTo (p2[5]);
                })
                .forEach (p -> System.out.println(p[3] + " (" + p[4] + "), "
                + String.format(p[2].trim().split ("\\s+")[0]) + ", " + p[5]));
    }
}
