package DiceRollerDugan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiceMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Load the fxml
		Parent parent = FXMLLoader.load(getClass().getResource("dice.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Set & show the stage
		primaryStage.setTitle("Super-Crazy Dice Party Extravaganza Deluxe 7");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
			}
	}