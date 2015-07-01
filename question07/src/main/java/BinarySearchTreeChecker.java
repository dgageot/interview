import java.util.List;

public class BinarySearchTreeChecker {
    public boolean isValid(Node tree) {
        List<Integer> values = tree.inOrder();

        return isSorted(values);
    }

    private boolean isSorted(List<Integer> values) {
        if (values.isEmpty()) {
            return true;
        }

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) < values.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
