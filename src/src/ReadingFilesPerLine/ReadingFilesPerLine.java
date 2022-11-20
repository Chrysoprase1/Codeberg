// program that has a readmethod to read files based on given String input (filename)
// will then read the file with inputname and add it line per line to an arraylist

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        

    }

    public static List<String> read (String file) {
        List <String> fileList = new ArrayList<>();
        
        try {
            Files.lines (Paths.get (file)).forEach (row -> fileList.add (row));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return fileList;
    }
}
