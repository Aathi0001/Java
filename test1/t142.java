package test1;

import java.io.*;

public class t142 {
    public static void main(String[] args) {
        try {
            // 1️⃣ Write to a file using BufferedWriter
            FileWriter fw = new FileWriter("D://buffered.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello, this is written using BufferedWriter!");
            bw.newLine(); // adds a new line
            bw.write("It is faster than FileWriter alone.");
            bw.newLine();
            bw.write("End of file content.");

            bw.close(); // closes both BufferedWriter & FileWriter
            System.out.println("✍️ Data written successfully using BufferedWriter.");

            // 2️⃣ Read back the file using BufferedReader
            FileReader fr = new FileReader("D://buffered.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\n📖 File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

