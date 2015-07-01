import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
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
}
