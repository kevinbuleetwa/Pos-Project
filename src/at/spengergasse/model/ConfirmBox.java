package at.spengergasse.model;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {
	static boolean answer;
	
	public static boolean display(String title, String message){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("APP NAME");
		window.setMinWidth(300);
		Label label = new Label();
		label.setText(message);
		
		Button continueButton = new Button ("Continue");
		Button cancelButton = new Button ("Cancel");
		
		continueButton.setOnAction(e -> {
			answer = true;
			boolean result = Main.display("Title of Window", "Welcome back");
            System.out.println(result);
			
		});
		cancelButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		VBox layout = new VBox(10);
		
		layout.getChildren().addAll(label, continueButton, cancelButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return answer;


		
	}
}
