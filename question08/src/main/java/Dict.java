import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Dict {
    private Set<String> words;
    private Map<String, List<String>> neighbours;

    private Dict() {
        this.words = new HashSet<>();
        this.neighbours = new HashMap<>();
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

        dict.computeNeighbours();

        return dict;
    }

    private void computeNeighbours() {
        for (String word : words) {
            neighbours.put(word, permutations(word));
        }
    }

    public boolean test(String word) {
        return words.contains(word);
    }

    public List<String> permutations(String word) {
        List<String> words = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            // remove character
            String changed = word.substring(0, i) + word.substring(i + 1);
            if (test(changed)) {
                words.add(changed);
            }

            // change character
            for (char c = 'a'; c <= 'z'; c++) {
                changed = word.substring(0, i) + c + word.substring(i + 1);
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

    public List<String> path(String source, String target) {
        Set<String> visited = new HashSet<>();
        visited.add(source);

        Deque<List<String>> queue = new LinkedList<>();
        List<String> path = new ArrayList<>();
        path.add(source);
        queue.add(path);

        while (!queue.isEmpty()) {
            List<String> currentPath = queue.removeFirst();
            String word = currentPath.get(currentPath.size() - 1);
            if (word.equals(target)) {
                return currentPath;
            }

            List<String> wordNeighbours = neighbours.get(word);
            if (wordNeighbours != null) {
                for (String neighbour : wordNeighbours) {
                    if (visited.add(neighbour)) {
                        List<String> nextPath = new ArrayList<>();
                        nextPath.addAll(currentPath);
                        nextPath.add(neighbour);
                        queue.add(nextPath);
                    }
                }
            }
        }

        return Collections.emptyList();
    }
}
