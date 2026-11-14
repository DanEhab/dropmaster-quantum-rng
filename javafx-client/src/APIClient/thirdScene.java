package APIClient;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class thirdScene extends Application {

	public int userInput;
	private int flag; // To store the passed flag value

    // Constructor to accept the flag from secondScene
    public thirdScene(int flag) {
        this.flag = flag;
    }
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
        
        
        Image image50 = new Image(getClass().getResource("/images/Add-the-Number-of-kills.png").toExternalForm());
        ImageView imageView50 = new ImageView(image50);
        imageView50.setTranslateY(-200);
        
        
        VBox roots = new VBox(10);
        roots.setAlignment(Pos.CENTER);

        // Label to instruct the user
        Label instructionLabel = new Label("Enter an integer:");
        instructionLabel.setStyle("-fx-text-fill: white;");

        // TextField for user input
        TextField inputField = new TextField();
        inputField.setPromptText("Enter an integer"); // Shows a placeholder
        inputField.setFocusTraversable(true); // Shows blinking cursor when focused
        inputField.setPrefWidth(100);
        inputField.setMaxWidth(100);
        inputField.setMinWidth(100);

        // Button to submit the input
        Button submitButton = new Button("Submit");

     // Event handler for submit button
        submitButton.setOnAction(e -> {
            String inputText = inputField.getText();
            try {
                // Try to parse the input as an integer
                userInput = Integer.parseInt(inputText);

                // Check if the entered integer is greater than or equal to 1
                if (userInput >= 1) {
                    // If valid, switch to fourthScene with the userInput and flag
                    fourthScene newScene = new fourthScene(userInput, flag); // Pass userInput and flag
                    newScene.start(primaryStage); // Transition to fourthScene
                } else {
                    // If the number is less than 1, show an error message
                    showAlert("Invalid Input", "Please enter an integer greater than or equal to 1.", Alert.AlertType.WARNING);
                    inputField.clear();
                }
            } catch (NumberFormatException ex) {
                // If parsing fails, show an error message and clear the input field
                showAlert("Invalid Input", "Please enter a valid integer.", Alert.AlertType.WARNING);
                inputField.clear();
            }
        });

        // Add elements to the layout
        roots.getChildren().addAll(instructionLabel, inputField, submitButton);
        
        root.getChildren().addAll(gifImageView,imageView50,roots);
        
        

        // Create the scene and set it to the stage
        Scene scene = new Scene(root, 1431, 787.5); // Set the window size as needed
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Background Image Example");
        primaryStage.show();
    }
    
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}
