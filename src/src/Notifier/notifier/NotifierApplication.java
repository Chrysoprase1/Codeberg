// program that opwns a vbox window (textfield, button, label)
    // writing something on the textfield and then pressing the button will copy
    // the textbox contens into the label section
    // label is empty ("") at the beginning

package notifier;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class NotifierApplication extends Application {
    public void start (Stage window) {
        VBox vBox = new VBox();
        
        TextField text = new TextField();
        Label labelName = new Label ("");
        Button buttonName = new Button ("update");
        buttonName.setOnAction ((event) -> {
            labelName.setText (text.getText());
        });
        
        
        vBox.getChildren().addAll (text, buttonName, labelName);
        
        Scene scenery = new Scene (vBox);
        
        window.setScene (scenery);
        window.show();
        
    }


    public static void main(String[] args) {
        launch (NotifierApplication.class);
    }

}
