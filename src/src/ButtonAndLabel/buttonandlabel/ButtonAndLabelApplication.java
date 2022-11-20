// program that opens a label and a buton in a window
    // both dont lead to anything other than showing that they exist

package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application {
    public void start(Stage window) {
        Label labelName = new Label ("labeltest");
        Button buttonName = new Button ("buttontest");
        
        FlowPane component1 = new FlowPane();
        component1.getChildren().add (labelName);
        component1.getChildren().add (buttonName);
        
        Scene scenery = new Scene (component1);
        window.setScene (scenery);
        window.show();
    }


    public static void main(String[] args) {
        launch (ButtonAndLabelApplication.class);
    }

}
