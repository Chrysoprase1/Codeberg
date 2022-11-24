// program that opens a window with a label and a button (first scene)
// pressing the button will switch to the second scene (button, label)
// pressing the button will switch to the third scene (label,0,0) (button,1,1)
// pressing the button again will switch to the first scene and repeat
// sdifferent scene layouts for easy testing purposes (borderpane, vbox, gridpane)

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
        
public class MultipleViews extends Application{
    
    public void start (Stage window) {
        BorderPane firstView = new BorderPane();
        VBox secondView = new VBox ();
        GridPane thirdView = new GridPane();
        
        Label firstLabel = new Label ("First view!");
        Button firstButton = new Button ("To the second view!");
        firstView.setTop (firstLabel);
        firstView.setCenter (firstButton);
        
        Button secondButton = new Button ("To the third view!");
        Label secondLabel = new Label ("Second view!");
        secondView.getChildren().add (secondButton);
        secondView.getChildren().add (secondLabel);
        
        Label thirdLabel = new Label ("Third view!");
        Button thirdButton = new Button ("To the first view");
        thirdView.add (thirdLabel, 0, 0);
        thirdView.add (thirdButton, 1, 1);
        
        Scene firstScene = new Scene (firstView);
        Scene secondScene = new Scene (secondView);
        Scene thirdScene = new Scene (thirdView);
        
        firstButton.setOnAction ((event) -> {
            window.setScene (secondScene);
        });
        secondButton.setOnAction ((event) -> {
            window.setScene (thirdScene);
        });
        thirdButton.setOnAction ((event) -> {
            window.setScene (firstScene);
        });
        
        window.setScene (firstScene);
        window.show();
    }

    public static void main(String[] args) {
        launch (MultipleViews.class);
    }

}
