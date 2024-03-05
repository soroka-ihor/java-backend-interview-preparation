package interview.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Value {
    private String key;
    private String value;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return Objects.equals(key, value1.key) && Objects.equals(value, value1.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
