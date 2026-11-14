package APIClient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class secondScene extends Application {

	public int flag; // This will store the flag value based on button clicks
    @Override
    
    public void start(Stage primaryStage) {
        // Create a StackPane as the root layout
        StackPane root = new StackPane();
        
       
        Image gifImage = new Image(getClass().getResource("/images/background123.png").toExternalForm());
        ImageView gifImageView = new ImageView(gifImage);
        gifImageView.setFitWidth(1431); // Set your desired width
        gifImageView.setFitHeight(787.5); // Set your desired height
        gifImageView.setPreserveRatio(true);
        gifImageView.setOpacity(0.93);
        // Adding gif image to the StackPane
        
        Image image1 = new Image(getClass().getResource("/images/Commander_Zilyana.png").toExternalForm());
        ImageView imageView1 = new ImageView(image1);
        imageView1.setPreserveRatio(true);
        imageView1.setTranslateX(450);
        imageView1.setTranslateY(100);

        
        Image image2 = new Image(getClass().getResource("/images/General_Graardor.png").toExternalForm());
        ImageView imageView2 = new ImageView(image2);
        imageView2.setPreserveRatio(true);
        imageView2.setTranslateX(150);
        imageView2.setTranslateY(100);
        
        Image image3 = new Image(getClass().getResource("/images/Kreearra.png").toExternalForm());
        ImageView imageView3 = new ImageView(image3);
        imageView3.setPreserveRatio(true);
        imageView3.setTranslateX(-150);
        imageView3.setTranslateY(100);

        
        Image image4 = new Image(getClass().getResource("/images/Kril_Tsutsaroth.png").toExternalForm());
        ImageView imageView4 = new ImageView(image4);
        imageView4.setPreserveRatio(true);
        imageView4.setTranslateX(-450);
        imageView4.setFitWidth(425);
        imageView4.setPreserveRatio(true);
        imageView4.setTranslateY(100);

        
        Button button1 = createStyledButton("K'ril Tsutsaroth");
        Button button2 = createStyledButton("General Graardor");
        Button button3 = createStyledButton("Kree'arra");
        Button button4 = createStyledButton("Commander Zilyana");
        
        button1.setTranslateX(-450);
        button2.setTranslateX(150);
        button3.setTranslateX(-150);
        button4.setTranslateX(450);
        button1.setTranslateY(220);
        button2.setTranslateY(220);
        button3.setTranslateY(220);
        button4.setTranslateY(220);
        
        // Set button actions to set the flag and switch to thirdScene
        button1.setOnAction(e -> switchToThirdScene(primaryStage, 1)); // button 1 -> flag 1
        button2.setOnAction(e -> switchToThirdScene(primaryStage, 3)); // button 2 -> flag 3
        button3.setOnAction(e -> switchToThirdScene(primaryStage, 2)); // button 3 -> flag 2
        button4.setOnAction(e -> switchToThirdScene(primaryStage, 4)); // button 4 -> flag 4
        
        Image image50 = new Image(getClass().getResource("/images/DropMaster-Choose-A-Bos.png").toExternalForm());
        ImageView imageView50 = new ImageView(image50);
        imageView50.setTranslateY(-200);
        
        root.getChildren().addAll(gifImageView,imageView1,imageView2,imageView3,imageView4,button1,button2,button3,button4,imageView50);
        
        

        // Create the scene and set it to the stage
        Scene scene = new Scene(root, 1431, 787.5); // Set the window size as needed
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Background Image Example");
        primaryStage.show();
    }
    
    private void switchToThirdScene(Stage primaryStage, int flag) {
        this.flag = flag; // Set the flag based on the button clicked
        thirdScene newScene = new thirdScene(flag); // Pass flag to thirdScene
        newScene.start(primaryStage); // Switch to thirdScene
    }

    private Button createStyledButton(String text) {
        Button button = new Button(text);
        
        // Styling the button
        button.setStyle(
                "-fx-background-color: rgba(0, 0, 0, 0.7);" + // Semi-transparent black
                "-fx-text-fill: white;" +
                "-fx-font-size: 18px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 10px 20px;" +
                "-fx-background-radius: 10;" // Rounded corners
        );

        // Adding hover effect
        button.setOnMouseEntered(e -> button.setStyle(
                "-fx-background-color: rgba(255, 215, 0, 0.8);" + // Golden hover color
                "-fx-text-fill: black;" +
                "-fx-font-size: 18px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 10px 20px;" +
                "-fx-background-radius: 10;"
        ));
        
        button.setOnMouseExited(e -> button.setStyle(
                "-fx-background-color: rgba(0, 0, 0, 0.7);" + 
                "-fx-text-fill: white;" +
                "-fx-font-size: 18px;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 10px 20px;" +
                "-fx-background-radius: 10;"
        ));

        return button;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
