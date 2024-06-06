import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class APICall {
    //    Set up to make API call for Ollama
    //    One-shot is used for single, isolated queries.
    //    Chat maintains a conversation context.
    //    Generate is used to produce responses based on a prompt.
    //    Prompt is the input given to the model.
    //    API documentation missing, will come back to this
    //    Link for Ollama documentation https://wiki.mutable.ai/ollama/ollama
    public static void main(String[] args) {
        try {
            // URL for the generate API endpoint
            URL url = new URL("http://localhost:11434/api/generate");

            // Establish the connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            // JSON payload
            String jsonInputString = "{\"model\": \"llama3\", \"prompt\": \"Why is the sky blue?\"}";

            // Send the request
            try(OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read the response
            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
