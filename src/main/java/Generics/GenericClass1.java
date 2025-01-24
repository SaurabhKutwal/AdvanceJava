package Generics;

import java.util.List;

public class GenericClass1 {

    public static class Box<T>{
        T value;
        public Box(T value){
            this.value = value;
        }

        public T getValue(){
            return value;
        }
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(1000);
        System.out.println(box1.getValue());

        Box<String> box2 = new Box<>("Saurabh");
        System.out.println(box2.getValue());

        Box<List> box3 = new Box<>(List.of(1,2,3,4,5));
        System.out.println(box3.getValue());
    }
}
