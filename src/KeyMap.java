import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class KeyMap {
     private final String key;
    private Integer value;
    Map<String, Integer> map;


    public KeyMap(String key, Integer value) {
        this.key = key;
        this.value = value;
        this.map = new HashMap<>();
        this.map.put(key, value);
    }

    public String getKey() {
        return this.key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyMap keyMap = (KeyMap) o;
        return Objects.equals(key, keyMap.key) && Objects.equals(value, keyMap.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
