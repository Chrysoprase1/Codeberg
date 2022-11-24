// program that opens a window, containing a label, passwordfield and button
// entering a string in the passwordfield and then the button will prompt a
// welcome message on another scene with the input string

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class GreeterApplication extends Application {
    
    public void start(Stage window) {
        VBox askName = new VBox();
        StackPane welcome = new StackPane();
        
        Label startLabel = new Label ("Enter your name and start");
        Button start = new Button ("Start");
        Label welcomeLabel = new Label ("");
        TextField textfield = new TextField();
        
        askName.setPrefSize (300, 100);
        askName.setAlignment (Pos.CENTER);
        askName.getChildren().add (startLabel);
        askName.getChildren().add (textfield);
        askName.getChildren().add (start);
        
        welcome.setPrefSize (300, 100);
        welcome.setAlignment (Pos.CENTER);
        welcome.getChildren().add (welcomeLabel);
        
        Scene naming = new Scene (askName);
        Scene welcoming = new Scene (welcome);
        
        start.setOnAction ((event) -> {
            if (textfield.getText().isEmpty()) {
                welcomeLabel.setText ("Empty input");
            }
            
            welcomeLabel.setText ("Welcome " + textfield.getText() + "!");
            window.setScene (welcoming);
        });
        
        window.setScene (naming);
        window.show();
    }

    public static void main(String[] args) {
        launch (GreeterApplication.class);
    }
}
