// program that opens a window, containing three buttons at its bottom
// clicking the buttons will do as stated and print a label at the center
    // buttons for: tell joke, answer joke, explain joke
    // Label at the center will overwrite older labels
    // joke buttons will stay active at all times

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class JokeApplication extends Application {
    public void start (Stage window) {
        BorderPane layout = new BorderPane();
        layout.setPrefSize (300, 100);
        
        Label jokeLabel = new Label ("What do you call a bear with no teeth?");
        Label answer = new Label ("A gummy bear");
        Label jokeExplaination = new Label ("like bears, but sweet");

        HBox buttons = new HBox();
        Button joke = new Button ("Click for a joke?");
        Button answerButton = new Button ("Answer");
        Button explainButton = new Button ("Explanation");
        buttons.getChildren().addAll (joke, answerButton, explainButton);
        
        layout.setBottom (buttons);
        
        Scene startJoke = new Scene (layout);
        
        joke.setOnAction ((event) -> {
            layout.setCenter (jokeLabel);
            window.setScene (startJoke);
        });
        
        answerButton.setOnAction ((event) -> {
            layout.setCenter (answer);
            window.setScene (startJoke);
        });
        
        explainButton.setOnAction ((event) -> {
            layout.setCenter (jokeExplaination);
            window.setScene (startJoke);
        });
        
        window.setScene (startJoke);
        window.show();
        
    }


    public static void main(String[] args) {
        launch (JokeApplication.class);
    }
}
