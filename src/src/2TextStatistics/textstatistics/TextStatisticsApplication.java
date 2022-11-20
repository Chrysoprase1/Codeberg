// program that opens a window with a textarea and a hbox containing 3 labels
    // the textarea has functionality to count total letters, words, and keep
    // track of the longest word written
    // the labels will show these three statistics

package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {
    
    public void start (Stage window) {
        BorderPane mainPane = new BorderPane();
        
        Label letterCounter = new Label ("Letters: 0");
        Label wordCounter = new Label ("Words: 0");
        Label longestWord = new Label ("No words so far");
        
        HBox bottomHBox = new HBox();
        bottomHBox.setSpacing (10);
        bottomHBox.getChildren().add (letterCounter);
        bottomHBox.getChildren().add (wordCounter);
        bottomHBox.getChildren().add (longestWord);
        
        TextArea text = new TextArea ("");
        // add functionality for text so that it finds out letter + word count
        // as well as the longest word written
        text.textProperty().addListener ((change, oldValue, newValue) -> {
            int charactersIn = newValue.length();
            // split newValue to count each word + stream for each word length
            String[] valueParts = newValue.split (" ");
            int wordCount = valueParts.length;
            String longest = Arrays.stream (valueParts)
                    .sorted ((value1, value2) -> value2.length() - value1.length())
                    .findFirst()
                    .get();        
            
            // add it to label content
            letterCounter.setText ("Letters: " + charactersIn);
            wordCounter.setText ("Words: " + wordCount);
            longestWord.setText ("The longest word is: " + longest);
        });
        
        
        
        mainPane.setCenter (text);
        mainPane.setBottom (bottomHBox);
        
        Scene scenery = new Scene(mainPane);
        window.setScene (scenery);
        window.show();
    }


    public static void main(String[] args) {
        launch (TextStatisticsApplication.class);
    }

}
