package test1;

//Regular interface
interface Vehicle121 {
 void start();
 void stop();
}

class Car121 implements Vehicle121 {
 public void start() {
     System.out.println("Car started.");
 }

 public void stop() {
     System.out.println("Car stopped.");
 }
}

public class t121 {
 public static void main(String[] args) {
     Vehicle121 myCar = new Car121();
     myCar.start();
     myCar.stop();
 }
}


//A normal interface that can have any number of abstract methods.