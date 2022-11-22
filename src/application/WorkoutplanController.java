package application;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkoutplanController {
	
	//Control for the  change in scenes
	private Stage stage;
	private Scene scene;
	

	//This method is used to change into the "Main Menu" Scene
	public void switchToMainMenu(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		VBox root = loader.load(new FileInputStream("src/application/WorkoutPlanView1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//This method is used to change into the "Calorie Calculator" Scene
	public void switchToCalorieCalculatorScene(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader();
		VBox root = loader.load(new FileInputStream("src/application/CalorieCalculatorView.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//This method is used to change into the "Weekly Eating Plan" Scene
	public void switchToWeeklyEatingPlan(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader();
		VBox root = loader.load(new FileInputStream("src/application/WeeklyEatingPlanView.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//This method is used to change into the "Work out Tracker" Scene
	public void switchToWeeklyWorkoutTracker(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader();
		VBox root = loader.load(new FileInputStream("src/application/WorkoutTracker.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	

    @FXML
    private ChoiceBox<String> genderChoicebox;

    @FXML
    private TextField ageTextfield;

    @FXML
    private ChoiceBox<String> measurementSystem;

    @FXML
    void calculateCalories(ActionEvent event) {

    }
	
	}
