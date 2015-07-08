import java.util.HashMap;
import java.util.Map;

public class NonRepeated {
    public int find(String word) {
        Map<Integer, Integer> seen = new HashMap<>();

        word.chars().forEach(c -> seen.put(c, seen.getOrDefault(c, 0) + 1));

        return word.chars().filter(c -> seen.get(c) == 1).findFirst().orElse('?');
    }
}
