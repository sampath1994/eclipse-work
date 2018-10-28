package application;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application{

	private MyController ctrl;
	 @Override
	    public void start(Stage primaryStage) {
	        
	            // Read file fxml and draw interface.
	            Parent root;
				try {
					root = FXMLLoader.load(getClass().getClassLoader()
					        .getResource("MyScene.fxml"));
				
	 
	            primaryStage.setTitle("My Application");
	            primaryStage.setScene(new Scene(root));
	            primaryStage.show();
	            //ctrl.shrtcut();
	         } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 launch(args);
		 BasicConfigurator.configure();
		 
	}

}
