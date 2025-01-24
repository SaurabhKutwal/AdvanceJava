package Generics;

import java.util.List;

public class GenericClass2 {

    //Bounded Types
    //T is only subclass of Number i.e. Only Integer, Float,Double, etc.
    public static class Box<T extends Number>{
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

        Box<Double> box2 = new Box<>(3.3333);
        System.out.println(box2.getValue());

        Box<Float> box3 = new Box<>(1.1111111111F);
        System.out.println(box3.getValue());

//        Box<Float> box4 = new Box<>("Saurabh"); //Compile time check exception.
        System.out.println(box3.getValue());

    }
}
