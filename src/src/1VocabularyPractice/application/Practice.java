
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Practice {
    public Dictionary dict;
    public String word;
    
    public Practice (Dictionary dict) {
        this.dict = dict;
        this.word = dict.getQuestion();
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        layout.setPadding (new Insets (10,10,10,10));
        layout.setVgap (10);
        layout.setHgap (10);
        layout.setAlignment (Pos.CENTER);
        
        Label wordInstruction = new Label ("Translate the word: " + this.word);
        TextField translationField = new TextField();
        Label feedback = new Label ("");
        Button checkTranslation = new Button ("Check");
        
        layout.add (wordInstruction, 0,0);
        layout.add (translationField, 0, 1);
        layout.add (checkTranslation, 0,2);
        layout.add (feedback, 0,3);
        
        checkTranslation.setOnMouseClicked ((event) -> {
            String translation = translationField.getText();
            if (dict.getTranslation (word).equals (translation)) {
                feedback.setText ("Correct, good job!");
            } else {
                feedback.setText ("Incorrect. Correkt answer would be: " + dict.getTranslation (word));
                return;
            }
            
            this.word = this.dict.getQuestion();
            wordInstruction.setText ("Translate the word: " + this.word);
            translationField.clear();
        });
        
        return layout;
    }
}
