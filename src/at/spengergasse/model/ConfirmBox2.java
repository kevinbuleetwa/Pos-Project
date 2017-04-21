package at.spengergasse.model;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class ConfirmBox2 {
	
	
		static boolean answer;
		
		public static boolean display(String title, String message){
			Stage window = new Stage();
			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle("APP NAME");
			window.setMinWidth(1000);
			Label label = new Label();
			label.setText(message);
			
			final Label introdLabel = new Label("Please enter the following things");
			final Label textFname = new Label("Firstname: ");
			final Label textLname = new Label("Lastname: ");
			final Label textUsername = new Label("Username: ");
			final Label textAge = new Label("Age: ");
			final Label textHeight = new Label("Height: ");
			final Label textGender = new Label("Gender: ");
			final Label textInfo = new Label("How often would you like to work out: ");
			
			
			final TextField inputFirstname = new TextField();
			inputFirstname.setPromptText("Firstname");
			final TextField inputLastname = new TextField();
			inputLastname.setPromptText("Lastname");
			final TextField inputUsername = new TextField();
			inputUsername.setPromptText("Username");
			final TextField inputAge = new TextField();
			inputAge.setPromptText("Age");
			final TextField inputHeight = new TextField();
			inputHeight.setPromptText("Height");
			final TextField inputGender = new TextField();
			inputGender.setPromptText("Gender");
			final TextField inputInfo = new TextField();
			inputInfo.setPromptText("Amount in days per week");
			
			Button saveButton = new Button ("Save");
			Button cancelButton = new Button ("Cancel");
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			
			grid.add(introdLabel, 1, 0);
			grid.add(textFname, 0, 1);
			grid.add(inputFirstname, 1, 1);
			grid.add(textLname, 0, 2);
			grid.add(inputLastname, 1, 2);
			grid.add(textUsername, 0, 3);
			grid.add(inputUsername, 1, 3);
			grid.add(textAge, 0, 4);
			grid.add(inputAge, 1, 4);
			grid.add(textHeight, 0, 5);
			grid.add(inputHeight, 1, 5);
			grid.add(textGender, 0, 6);
			grid.add(inputGender, 1, 6);
			grid.add(textInfo, 0, 7);
			grid.add(inputInfo, 1, 7);
			
			saveButton.setOnAction(e -> {
				answer = true;
				
			});
			
			cancelButton.setOnAction(e -> {
				answer = false;
				window.close();
			});
			VBox layout = new VBox(10);
			
			layout.getChildren().addAll(grid, saveButton, cancelButton);
	        layout.setAlignment(Pos.CENTER);
	        
	        Scene scene = new Scene(layout);
	        window.setScene(scene);
	        window.showAndWait();
	        
	        return answer;


			
		}
	}


