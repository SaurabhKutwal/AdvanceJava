package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {

    public static void main(String[] args) {

        //Functional Interface : has only one abstract method in interface

        //Function Interface : apply() method. 1 input -> 1 output
        //used for functional programming
        Function<Integer,Integer> square = x -> x * x;

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> squares = new ArrayList<>();

        for(int i:numbers){
            squares.add(square.apply(i));
        }
        System.out.println(squares);


        //Predicate Interface : test() method. 1 input -> boolean output
        //It hold some condition that can be true or false.
        Predicate<Integer> isEven = x -> x%2 == 0;
        for(int i:numbers){
            System.out.println(isEven.test(i));
        }

        //Consumer Interface : accept() method : 1 input -> no output
        //Returns nothing used for consume purpose only
        Consumer<Integer> print = x -> System.out.print(x + " ");
        for(int i:numbers){
            print.accept(i);
        }

        //Supplier Interface : get() method : no input -> 1 output
        Supplier<Integer> getNumber = () -> (int) (Math.random() * 100);
        for(int i=1;i<=10;i++){
            System.out.println(getNumber.get());
        }

    }
}
