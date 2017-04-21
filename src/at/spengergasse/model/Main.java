package at.spengergasse.model;


	import javafx.stage.*;
	import javafx.scene.*;
	import javafx.scene.layout.*;
	import javafx.scene.control.*;
	import javafx.geometry.*;

	public class Main {
		static boolean answer;
		//kev
		
		public static boolean display(String title, String message){
			Stage window = new Stage();
			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle("APP NAME");
			window.setMinWidth(300);
			Label label = new Label();
			label.setText(message);
			//HEY ICH BINS DA DOMASCH
			
			Button continueButton = new Button ("Continue");
			Button cancelButton = new Button ("Cancel");
			
			continueButton.setOnAction(e -> {
				answer = true;
				
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
