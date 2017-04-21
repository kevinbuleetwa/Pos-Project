package at.spengergasse.model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AlertBox extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("APP NAME");
        button = new Button("Click Me");

        
		button.setOnAction(e -> AlertBox.display("Title of Window", "Wow this is some ********!"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

	public static Object display(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}