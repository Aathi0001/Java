package test1;

import java.util.function.Function;

public class t127 {
    public static void main(String[] args) {
        Function<String, String> func = String::toUpperCase;
        String result = func.apply("hello");
        System.out.println(result); // Output: HELLO
    }
}

//ClassName::instanceMethod