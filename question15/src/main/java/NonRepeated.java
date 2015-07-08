import java.util.HashMap;
import java.util.Map;

public class NonRepeated {
    public char find(String word) {
        Map<Character, Integer> seen = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            Integer previous = seen.get(c);
            if (previous == null) {
                seen.put(c, 1);
            } else {
                seen.put(c, previous + 1);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            Integer count = seen.get(c);
            if (count == 1) {
                return c;
            }
        }

        return '?';
    }
}
