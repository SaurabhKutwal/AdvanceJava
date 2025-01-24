package Generics;

import java.util.List;

public class GenericMethod1 {

    public static <T> void print(T msg) {
        System.out.println("Message is :" + msg);
    }

    public static void main(String[] args) {
        print("Hello");
        print(1);
        print(List.of(1, 2, 3, 4, 5));

    }
}
