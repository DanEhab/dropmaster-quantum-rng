package APIClient;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class QuantumAPIClient {

    public static void main(String[] args) {
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
                System.out.println("Response from API: " + response.toString());
                String numberStr = r.replaceAll("[^0-9]", "");  // Keep only digits
                int extractedNumber = Integer.parseInt(numberStr);   // Convert to integer
                System.out.println("Extracted Number: " + extractedNumber);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
