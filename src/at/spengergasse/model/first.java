package at.spengergasse.model;
import com.sun.javafx.scene.input.InputEventUtils;
import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import at.spengergasse.model.ConfirmBox;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class first extends Application{
	
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		final Label introLabel = new Label("Welcome to the app");
		final Label continueLabel = new Label("Please enter your username and passwort");
		
		final TextField inputUsername = new TextField();
		inputUsername.setPromptText("username");
		final TextField inputPassword = new TextField();
		inputPassword.setPromptText("password");
		
		final Button button = new Button("Login");
		final Button button1 = new Button("Register");
		
		button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of Window", "Welcome back");
            System.out.println(result);
        });
		button1.setOnAction(e -> {
            boolean result = ConfirmBox2.display("Title of Window", "Enter the following");
            System.out.println(result);
        });
		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);

		Scene scene = new Scene(grid, 400, 400);
		primaryStage.setScene(scene);
		 GridPane.setHalignment(button, HPos.CENTER);
		
		grid.add(introLabel, 1, 0);
		grid.add(continueLabel, 1, 1);
		grid.add(inputUsername, 1, 2);
		grid.add(inputPassword, 1, 3);
		grid.add(button, 1, 4);
		grid.add(button1, 1, 5);
		
		
		
		primaryStage.setTitle("APP NAME");
		primaryStage.show();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
