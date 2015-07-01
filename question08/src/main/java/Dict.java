import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dict {
    private Set<String> words;

    private Dict() {
        this.words = new HashSet<>();
    }

    private void add(String word) {
        words.add(word);
    }

    public static Dict read() {
        Dict dict = new Dict();

        try {
            Files.readAllLines(Paths.get("corncob_lowercase.txt")).forEach(dict::add);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        return dict;
    }

    public boolean test(String word) {
        return words.contains(word);
    }

    public List<String> permutations(String word) {
        List<String> words = new ArrayList<>();

        // remove character
        if (word.length() > 1) {
            for (int i = 0; i < word.length(); i++) {
                String changed = word.substring(0, i) + word.substring(i + 1);
                if (test(changed)) {
                    words.add(changed);
                }
            }
        }

        // change character
        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String changed = word.substring(0, i) + c + word.substring(i + 1);
                if (!changed.equals(word) && test(changed)) {
                    words.add(changed);
                }
            }
        }

        // add character
        for (int i = 0; i <= word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String changed = word.substring(0, i) + c + word.substring(i);
                if (test(changed)) {
                    words.add(changed);
                }
            }
        }

        return words;
    }
}
