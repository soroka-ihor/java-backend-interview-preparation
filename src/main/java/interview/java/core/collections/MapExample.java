package interview.java.core.collections;

import interview.model.Value;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        List<Value> values = mapExample.generate(32);
        Value opt = values.stream()
                .reduce((v1, v2) -> new Value(v1.getKey().concat(v2.getKey()), v2.getValue().concat(v1.getValue())))
                .get();
        System.out.println();



    }

    public List<Value> generate(int amount) {
        return Stream.generate(() -> new Value(UUID.randomUUID().toString(), UUID.randomUUID().toString()))
                .limit(amount)
                .collect(Collectors.toList());
    }
}
