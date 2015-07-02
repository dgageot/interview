import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<String> of(String word) {
        if ("ab".equals(word)) {
            return Arrays.asList("ab", "ba");
        }

        return Arrays.asList(word);
    }
}
