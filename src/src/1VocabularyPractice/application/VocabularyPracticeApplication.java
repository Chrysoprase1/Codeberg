// program to test and practice translations, includes a gui for the options
// has two option buttons to either add a translation or practice already input translations at random


package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;

public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dict;
    
    public void init() throws Exception {
        this.dict = new Dictionary();
    }
    
    public void start(Stage window) throws Exception {
        // add overall layout + views
        
        InputWords wordsView = new InputWords (dict);
        Practice practiceView = new Practice (dict);
        BorderPane layout = new BorderPane();
        
        // add inner layout mechanics / hbox with buttons
        HBox hbox = new HBox();
        hbox.setPadding (new Insets (20, 20, 20, 20));
        hbox.setSpacing (10);
        
        Button enterWordsButton = new Button ("Enter new words");
        Button practiceButton = new Button ("Practice");
        hbox.getChildren().addAll (enterWordsButton, practiceButton);
        layout.setTop (hbox);
        
        // link the two buttons to InputWords (add) / Practice object functionality
        enterWordsButton.setOnAction ((event) -> {
            layout.setCenter (wordsView.getView());
        });
        
        practiceButton.setOnAction ((event) -> {
            layout.setCenter (practiceView.getView());
        });
        
        //starting layout
        layout.setCenter (wordsView.getView());
        
        Scene scenery = new Scene (layout, 400, 300);
        
        window.setScene (scenery);
        window.show();
    }


    public static void main(String[] args) {
        launch (VocabularyPracticeApplication.class);
    }
}
