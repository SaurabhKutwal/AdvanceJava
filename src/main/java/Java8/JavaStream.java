package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<String> names = List.of("Saurabh","Vikram","Vinay","Ganesh","Ashwini","Omkar","Shubham");

        //Intermediate operations

        // 1. Filter -> Take predicate tio filter the data.
        //Print names starting with letter S or V;
        System.out.println(names.stream().filter(name -> name.startsWith("S") || name.startsWith("V")).
                collect(Collectors.toList()));

        // 2. Map -> Take Function  for modification
        //Convert all the names to uppercase.
        System.out.println(names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));

        // 3. Sorted -> Take Comparator
        //Sort the name list in descending order of length of names.
        System.out.println(names.stream().sorted((x,y) -> y.length() - x.length()).collect(Collectors.toList()));

        // 4. Distinct -> remove duplicates from stream
        // Print without duplicates.
        List<Integer> numbers = List.of(77,57,82,80,61,77,74,44,91,77);
        numbers.stream().distinct().forEach(System.out::println);

        System.out.println();

        // 5. Limit -> Limit the no of entries in stream
        numbers.stream().sorted().limit(5).forEach(System.out::println);

        System.out.println();

        // 6. Skip -> Skips first n entries in stream
        numbers.stream().sorted().skip(3).forEach(System.out::println);

        System.out.println();

        // 7. peek -> take consumer, perform only return nothing,  but it is  intermediate operation.
        //count of even numbers and print them.
        System.out.println(numbers.stream().filter(x -> x%2 == 0).peek(System.out::println).count());

        //Terminal Operations

        // 1. foreach -> Takes consumer, return nothing
        //printing names only
        names.stream().forEach(System.out::println);

        // 2. count -> return count of entries in stream
        //Get count of distinct numbers
        System.out.println(numbers.stream().distinct().count());

        // 3. max -> Takes comparator return maximum value from stream
        System.out.println(numbers.stream().max((x,y) -> x-y).get());

        // 4. min -> Takes comparator return minimum values
        System.out.println(numbers.stream().min((x,y) -> x-y).get());

        // 5. anyMatch, allMatch, noneMatch -> Take predicate and return boolean as per condition
        //Is any number is above 100
        System.out.println(numbers.stream().anyMatch(x->x>100));
        //Are all numbers are below 100
        System.out.println(numbers.stream().allMatch(x -> x<100));
        //Are all are even numbers
        System.out.println(numbers.stream().noneMatch(x -> x%2 == 1));

        // 6. findFirst -> return first entry of steam if present.
        //    findAny -> return any entry from stream.
        System.out.println(names.stream().findFirst().get());
        System.out.println(names.stream().findAny().get());

        // 7. reduce -> Take binary Operator , return only 1 value for all the stream values
        //sum of numbers
        System.out.println(numbers.stream().reduce((x,y) -> x+y).get());






    }
}
