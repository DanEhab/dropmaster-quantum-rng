package APIClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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

public class fourthScene extends Application {

	public int userInput;
    public int flag;
    public int extractedNumber = 0;

    // Constructor to accept userInput and flag
    public fourthScene(int userInput, int flag) {
        this.userInput = userInput;
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
        
        
        Image image50 = new Image(getClass().getResource("/images/Result.png").toExternalForm());
        ImageView imageView50 = new ImageView(image50);
        imageView50.setTranslateY(-270);
        
     // TextArea for displaying output
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false); // Make it read-only
        outputArea.setWrapText(true); // Enable text wrapping
        outputArea.setPrefSize(300, 400); // Set preferred size
        outputArea.setMaxHeight(400);
        outputArea.setMinHeight(400);
        outputArea.setMaxWidth(300);
        outputArea.setMinWidth(300);
        outputArea.setStyle("-fx-font-size: 14px;");
        
        for (int i=0; i<userInput;i++) {
        try {
            // Define the URL of the Flask API
            URL url = new URL("http://127.0.0.1:5000/generate");

            // Create a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Define the JSON data to send in the request body
            String jsonInputString = "{\"num_bits\": 17, \"num_random_numbers\": 1}";

            // Write the JSON data to the connection output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Read the response from the API
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                String r = "Response from API: " + response.toString();
                //System.out.println("Response from API: " + response.toString());
                String numberStr = r.replaceAll("[^0-9]", "");  // Keep only digits
                extractedNumber = Integer.parseInt(numberStr);   // Convert to integer
                //System.out.println("Extracted Number: " + extractedNumber);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if(flag == 1) {
        	System.out.println(backend.KT_items(extractedNumber));
        	outputArea.appendText( backend.KT_items(extractedNumber) + "\n\n");
        }
        else {
        	if(flag==2) {
        		System.out.println(backend.KA_items(extractedNumber));
            	outputArea.appendText( backend.KA_items(extractedNumber) + "\n\n");
        	}
        	else {
        		if(flag==3) {
        			System.out.println(backend.General(extractedNumber));
                	outputArea.appendText( backend.General(extractedNumber) + "\n\n");
        		}
        		else {
        			System.out.println(backend.CZ_items(extractedNumber));
                	outputArea.appendText( backend.CZ_items(extractedNumber) + "\n\n");
        		}
        	}
        }
        }
        
        
        root.getChildren().addAll(gifImageView,imageView50,outputArea);
        
        

        // Create the scene and set it to the stage
        Scene scene = new Scene(root, 1431, 787.5); // Set the window size as needed
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Background Image Example");
        primaryStage.show();
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
