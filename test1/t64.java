package test1;

public class t64 {
    public static void main(String[] args) {
        String s = "Java Sql Sql java";
        String[] a = s.split(" ");
        
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            if (a[i].equals(" "))  // already marked duplicate
                continue;
            
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    count++;
                    a[j] = " "; // mark duplicate
                }
            }
            System.out.println(a[i] + ":" + count);
        }
    }
}
