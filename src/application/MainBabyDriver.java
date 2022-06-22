package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class MainBabyDriver extends Application 
{
	/**
     * This method is the driver of the JavaFX application
     * @param args
     */
    public static void main(String[] args) 
    {
        launch(args);
    }

    /**
     * This method set create a stage and set its scene for display.
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) throws IOException 
    {
        Pane root = FXMLLoader.load(getClass().getResource("/login/View/LoginView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
