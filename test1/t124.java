package test1;

import java.io.*;

//Marker Interface
interface Special {}

class Document implements Special, Serializable {
 String content = "Confidential File";
}

public class t124 {
 public static void main(String[] args) throws Exception {
     Document doc = new Document();

     // Check if class is marked
     if (doc instanceof Special) {
         System.out.println("This document is marked as special.");
     }

     // Serialization demo
     FileOutputStream fos = new FileOutputStream("doc.ser");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(doc);
     oos.close();

     System.out.println("Document serialized.");
 }
}


//Interface with no methods.
//Used to mark a class for special treatment (like tagging).