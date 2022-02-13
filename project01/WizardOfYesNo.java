package project01;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.text.*;


public class WizardOfYesNo extends Application {

//	private static final String [] ANSWER = {
//			"Yes" , 
//			"Go for it!",
//			"Yes, definitely.",
//			"For sure!",
//			"I would say yes.",
//			"Most likely yes.",
//			"No.",
//			"I wouldn't.",
//			"In my opinion, no.",
//			"Definitely not!",
//			"Probably not.",
//			"It is very doubtful."
//	};
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
//     Label label = new Label ();
//     label.setText(ANSWER);
//		Random rand = new Random();
//		int numberOfAnswer = ANSWER.length;
//		int pick = rand.nextInt(numberOfAnswer);
//		String answer = ANSWER [pick];
//		
//		Label label = new Label();
//		label.setText(answer);
//		
//		Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 32);
//		label.setFont(font);
//     
//     Scene root = new Scene (label);
//     arg0.setScene(root);
//     arg0.sizeToScene();
//     arg0.setResizable(false);
//     arg0.setTitle("Wizard of Yes/No");
//     
//     arg0.setScene(root);
		arg0.show();
	}
	public static void main (String[] args) {
		Application.launch(args);
	}

}
