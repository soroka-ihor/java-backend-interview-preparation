package interview.java.core.collections;

import interview.model.Value;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Value> set = new HashSet<>();
        Value value1 = new Value("t", "t");
        Value value2 = new Value("t", "t");
        // these two objects are equal
        set.add(value1);
        set.add(value2);
        System.out.println(set);
    }


}
