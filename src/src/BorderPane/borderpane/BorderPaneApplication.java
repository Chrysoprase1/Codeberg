// empty program that opens a window with three labels via borderpane
    // top/north, bottom/south, right/east

package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class BorderPaneApplication extends Application {
    public void start (Stage window) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop (new Label ("NORTH"));
        borderPane.setRight (new Label ("EAST"));
        borderPane.setBottom (new Label ("SOUTH"));
        
        Scene scenery = new Scene(borderPane);
        window.setScene (scenery);
        window.show();
    }


    public static void main(String[] args) {
        launch (BorderPaneApplication.class);
    }

}
