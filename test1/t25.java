package test1;

public class t25 {
    public static boolean leapyear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(year + " is " + (isLeap ? "Leap Year" : "Not a Leap Year"));

        return isLeap;
    }

    public static void main(String[] args) {
        leapyear(1990);
        leapyear(2004);
    }
}
