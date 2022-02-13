package project01;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.text.*;


public class WizardOfYesNo extends Application {

	private static final String[]ANSWER = {
			"Yes",
			"No"
	};
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Label label = new Label ("Yes");
		Scene root = new Scene (label, 200,100);
		arg0.setScene(root);
		Random rand = new Random();
		int numberOfAnswer = ANSWER.length;
		int pick = rand.nextInt(numberOfAnswer);
		String answer = ANSWER[pick];
		
//     Label label = new Label ();
     label.setText(answer);
	 Font font = Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,  32);
	 label.setFont(font);

		arg0.show();
	}
	public static void main (String[] args) {
		Application.launch(args);
	}

}
