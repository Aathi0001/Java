package test1;

import java.io.*;

public class t140 {
    public static void main(String[] args) {
        try {
            // 1️⃣ Create a File object
            File file = new File("D://sample.txt");

            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2️⃣ Write to the file
            FileWriter writer = new FileWriter(file, true);
            writer.write("Hello, this is a test file.\n");
            writer.write("Java file handling is easy! \n");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3️⃣ Read from the file
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("\nFile contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
