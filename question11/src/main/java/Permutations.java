import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<String> of(String word) {
        List<String> all = new ArrayList<>();
        add("", word, all);
        return all;
    }

    private void add(String prefix, String word, List<String> all) {
        if (word.length() == 1) {
            all.add(prefix + word);
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            add(prefix + word.charAt(i), word.substring(0, i) + word.substring(i+1), all);
        }
    }
}
