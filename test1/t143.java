package test1;

import java.io.*;

public class t143 {
    public static void main(String[] args) {
        try {
            // ================================
            // 1️⃣ CHARACTER STREAM - FileWriter
            // ================================
            FileWriter fw = new FileWriter("D://charStream.txt");
            fw.write("This is written using FileWriter (Character Stream).\n");
            fw.write("It writes characters directly to the file.\n");
            fw.close();
            System.out.println("✅ Written using FileWriter.");

            // ====================================
            // 2️⃣ CHARACTER STREAM - BufferedWriter
            // ====================================
            FileWriter fw2 = new FileWriter("D://bufferedWriter.txt");
            BufferedWriter bw = new BufferedWriter(fw2);
            bw.write("This is written using BufferedWriter.");
            bw.newLine();
            bw.write("It is faster because it stores data in a buffer first.");
            bw.newLine();
            bw.write("Then writes to file in chunks.");
            bw.close();
            System.out.println("✅ Written using BufferedWriter.");

            // ============================
            // 3️⃣ BYTE STREAM - FileOutputStream
            // ============================
            FileOutputStream fos = new FileOutputStream("D://byteStream.dat");
            String byteText = "This is a Byte Stream example.";
            fos.write(byteText.getBytes()); // String → byte[]
            fos.close();
            System.out.println("✅ Written using FileOutputStream.");

            // ===============================
            // 4️⃣ CHARACTER STREAM READING
            // ===============================
            System.out.println("\n📖 Reading bufferedWriter.txt using BufferedReader:");
            FileReader fr = new FileReader("D://bufferedWriter.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // =========================
            // 5️⃣ BYTE STREAM READING
            // =========================
            System.out.println("\n📖 Reading byteStream.dat using FileInputStream:");
            FileInputStream fis = new FileInputStream("D://byteStream.dat");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert byte → char
            }
            fis.close();
            System.out.println("\n✅ Byte stream reading complete.");

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
