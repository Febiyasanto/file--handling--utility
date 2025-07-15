import java.io.*;
public class FileOperations {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // 1. Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello from CodTech Internship!\n");
            writer.write("This is the original content.");
            System.out.println("File written successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 2. Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Reading file content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 3. Modify (append) the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("\nThis line is appended as modification.");
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
}
