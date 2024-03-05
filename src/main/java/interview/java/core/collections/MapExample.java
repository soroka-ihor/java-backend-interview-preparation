package interview.java.core.collections;

import interview.model.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        List<Value> values = mapExample.generate(32);

        Map<String, String> map = values.stream().collect(Collectors.toMap(
                v -> v.getKey(),
                v -> v.getValue()
        ));


    }

    public List<Value> generate(int amount) {
        return Stream.generate(() -> new Value(UUID.randomUUID().toString(), UUID.randomUUID().toString()))
                .limit(amount)
                .collect(Collectors.toList());
    }
}
