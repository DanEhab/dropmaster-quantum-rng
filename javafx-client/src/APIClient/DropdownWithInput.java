package APIClient;



import java.awt.Dimension;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.KeyCode;

public class DropdownWithInput extends Application {
	
    public void start(Stage primaryStage) {
        // Creating a StackPane to hold all the elements
        StackPane root = new StackPane();
        
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		double diagonal = Math.sqrt((height*height)+(width*width));
        
        // Setting StackPane background color to black
        root.setStyle("-fx-background-color: black;");
        
       
        
        // Loading gif image
        Image gifImage = new Image(getClass().getResource("/images/Team-Name-Is-Out-of-Schr.png").toExternalForm());
        ImageView gifImageView = new ImageView(gifImage);
        gifImageView.setFitWidth(width/2); // Set your desired width
        gifImageView.setFitHeight(height/5.357142857); // Set your desired height
        gifImageView.setPreserveRatio(true);
        // Adding gif image to the StackPane
        root.getChildren().add(gifImageView);
        
        
        
        
        // Adding text
        Text text = new Text("Press 'Enter' to start...");
        text.setFont(Font.font("Arial",height/45));
        text.setStyle("-fx-fill: white");
        text.setTranslateY(height/10.8);
        
        
        
        
        
        // Adding text to the StackPane
        root.getChildren().add(text);
        
        // Apply scale transformation to zoom out everything
        root.setScaleX(1); // Scale down to 80%
        root.setScaleY(1); // Scale down to 80%
        

        // Creating the scene and setting it to the stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Game Window");
        primaryStage.setFullScreen(true);
        primaryStage.show();
        
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                // Switch to secondScene
                secondScene newScene = new secondScene();
                newScene.start(primaryStage); // Switch to secondScene
            }
        });
        
       
    }


    public static void main(String[] args) {
        System.setProperty("prism.allowhidpi", "false"); // Disable high DPI scaling for JavaFX
        System.setProperty("glass.gtk.uiScale", "1.0");
        launch(args);
    }
}
