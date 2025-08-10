package test1;

import java.io.*;

public class t141 {
    public static void main(String[] args) {
        try {
            // 1️⃣ Write data using FileOutputStream
            FileOutputStream fos = new FileOutputStream("D://byteData.dat");
            String text = "Hello, this is byte stream example!";
            fos.write(text.getBytes()); // Convert string to bytes
            fos.close();
            System.out.println("✍️ Data written to byteData.dat");

            // 2️⃣ Read data using FileInputStream
            FileInputStream fis = new FileInputStream("D://byteData.dat");
            int data;
            System.out.print("📖 File contents: ");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert byte back to char for printing
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

