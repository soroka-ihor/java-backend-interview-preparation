package interview.java.core.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

    public void map() {
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(listOfIntegers);
    }

    public void flatMap() {
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> numbers = Stream.of(evens, odds, primes)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("flattend list: " + numbers);
    }

    public void filter() {
        List<String> lines = randomUUID();
        List<String> result = lines.stream()       // convert list to stream
                .filter(line -> !"c".equals(line)) // we dont like c
                .collect(Collectors.toList());     // collect the output and convert streams to a List
        result.forEach(System.out::println);
    }

    public void distinct() {
        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();

        List<String> distinctStrings = stream
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
    }

    public void limit() {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");
        Stream<String> stream = stringList.stream();
        stream.limit(2)
                .forEach( element -> { System.out.println(element); });
    }

    public void peek() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

    public List<String> randomUUID() {
        return Stream.generate(() -> UUID.randomUUID().toString())
                .limit(1000)
                .collect(Collectors.toList());
    }
}
