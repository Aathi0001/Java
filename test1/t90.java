package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class t90 {
    private String name, ram;
    private double price;
    private ArrayList<t89> simSlots;

    public t90(String name, String ram, double price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
        this.simSlots = new ArrayList<>();
    }

    public void insertSim(t89 sim) {
        if (simSlots.size() < 2) { // allow max 2 SIMs
            simSlots.add(sim);
            System.out.println(sim.getOperator() + " SIM added to " + name);
        } else {
            System.out.println("Cannot add more SIMs to " + name + ". Max 2 slots filled.");
        }
    }

    public void removeSim(int index) {
        if (index < 0 || index >= simSlots.size()) {
            System.out.println("Invalid SIM slot number.");
            return;
        }
        t89 removed = simSlots.remove(index);
        System.out.println("Removed SIM: " + removed.getOperator() + " from " + name);
    }

    public void showDetails() {
        System.out.println("\n--- Mobile Details ---");
        System.out.println("Name: " + name);
        System.out.println("RAM: " + ram);
        System.out.println("Price: " + price);
        if (simSlots.isEmpty()) {
            System.out.println("No SIMs inserted.");
        } else {
            System.out.println("SIMs:");
            for (int i = 0; i < simSlots.size(); i++) {
                System.out.println((i + 1) + ". " + simSlots.get(i).getOperator());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        t89 jio = new t89("Jio", "High", 100);
        t89 airtel = new t89("Airtel", "Medium", 120);
        t89 bsnl = new t89("BSNL", "Low", 50);

        t90[] phones = {
            new t90("Samsung", "8GB", 29999),
            new t90("Redmi", "6GB", 19999),
            new t90("iPhone", "12GB", 79999)
        };

        while (true) {
            System.out.println("\nAvailable Mobiles:");
            for (int i = 0; i < phones.length; i++) {
                System.out.println((i + 1) + ". " + phones[i].name);
            }

            System.out.print("Choose Mobile (1-" + phones.length + ") or 0 to Exit: ");
            int mobileChoice = sc.nextInt();

            if (mobileChoice == 0) break;

            if (mobileChoice < 1 || mobileChoice > phones.length) {
                System.out.println("Invalid mobile choice.");
                continue;
            }

            t90 selectedPhone = phones[mobileChoice - 1];

            System.out.println("\n1. Insert SIM\n2. Remove SIM\n3. View Mobile Details\n4. Back");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select SIM to insert:");
                    System.out.println("1. Jio\n2. Airtel\n3. BSNL");
                    int simChoice = sc.nextInt();
                    if (simChoice == 1) selectedPhone.insertSim(jio);
                    else if (simChoice == 2) selectedPhone.insertSim(airtel);
                    else if (simChoice == 3) selectedPhone.insertSim(bsnl);
                    else System.out.println("Invalid SIM choice.");
                    break;

                case 2:
                    if (selectedPhone.simSlots.isEmpty()) {
                        System.out.println("No SIMs to remove.");
                    } else {
                        for (int i = 0; i < selectedPhone.simSlots.size(); i++) {
                            System.out.println((i + 1) + ". " + selectedPhone.simSlots.get(i).getOperator());
                        }
                        System.out.print("Select SIM slot to remove: ");
                        int removeIndex = sc.nextInt() - 1;
                        selectedPhone.removeSim(removeIndex);
                    }
                    break;

                case 3:
                    selectedPhone.showDetails();
                    break;

                case 4:
                    continue;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
        System.out.println("Exited.");
    }
}
