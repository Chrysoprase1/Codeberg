// program that opens a window with an empty button and a nonfunctional textfield
package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {
    public void start (Stage window) {
        Button buttonName = new Button ("buttontest");
        TextField textHere = new TextField();
        
        FlowPane component1 = new FlowPane();
        component1.getChildren().add (buttonName);
        component1.getChildren().add (textHere);
        
        Scene scenery = new Scene(component1);
        
        window.setScene(scenery);
        window.show();
    }


    public static void main(String[] args) {
        launch (ButtonAndTextFieldApplication.class);
    }

}
