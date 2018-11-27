package pattern.struct.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String, Flyweight> stringFlyweightMap = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (stringFlyweightMap.containsKey(key)) {
            return stringFlyweightMap.get(key);
        } else {
            Flyweight value = new Flyweight();
            stringFlyweightMap.put(key, value);
            return value;
        }
    }
}
