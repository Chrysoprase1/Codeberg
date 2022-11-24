
package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class InputWords {
    private Dictionary dictionary;
    
    public InputWords (Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        layout.setPadding (new Insets (10,10,10,10));
        layout.setVgap (10);
        layout.setHgap (10);
        layout.setAlignment (Pos.CENTER);
        
        Label askWords = new Label ("Word:");
        TextField askWordsText = new TextField();
        Label askTranslation = new Label ("Translation:");
        TextField askTranslationText = new TextField();
        
        Button addWordsButton = new Button ("Add word pair:");
        addWordsButton.setOnMouseClicked ((event) -> {
            String word = askWordsText.getText();
            String translation = askTranslationText.getText();
            
            dictionary.add (word, translation);
            
            askWordsText.clear();
            askTranslationText.clear();
        });
        
        layout.add (askWords, 0, 0);
        layout.add (askWordsText, 0, 1);
        layout.add (askTranslation, 0, 2);
        layout.add (askTranslationText, 0, 3);
        layout.add (addWordsButton, 0, 4);
        
        return layout;
    }
}
