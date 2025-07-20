package test1;

import java.util.Scanner;

public class t11 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int magicnumber = (int)(Math.random()*10);
		boolean flag = true;
		do {
			System.out.println("Guess the Number (0–9) or enter -1 to exit:");
			int num = sc.nextInt();
			if (num == -1) {
                flag = false;
                break;
            }
			if (num < 0 || num > 9) {
                System.out.println("Please enter a number between 0 and 9.");
                continue; 
            }
			if(magicnumber == num) {
				System.out.println("correct ✔");
			}
			else if(magicnumber < num){
				System.out.println("It So High...");
			}
			else if(magicnumber > num) {
				System.out.println("It So Low...");
			}
			else {
				System.out.println("give valid no");
			}
		}while(flag); {
			System.out.println("Exit");
		}
	}

}
