import java.io.*;

public class aedFinal {
    public static void main(String[] args) {
        // File path updated to use the provided file "Final AED.txt"
        String filePath = System.getProperty("user.home") + "/Downloads/Final AED.txt";

        try {
            // Read the existing content of the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String initialContent = reader.readLine();
            System.out.println("Content of the file: " + initialContent);
            reader.close();

            // Append "A new string" to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.newLine(); // Move to a new line
            writer.write("A new string");
            writer.close();

            System.out.println("New content has been added to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}
