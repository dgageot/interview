import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public boolean check(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        Map<Integer, Integer> count = new HashMap<>();
        first.chars().forEach(c -> count.put(c, count.getOrDefault(c, 0) + 1));
        second.chars().forEach(c -> count.put(c, count.getOrDefault(c, 0) - 1));

        return count.values().stream().noneMatch(c -> !c.equals(0));
    }
}
