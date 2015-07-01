import java.util.ArrayList;
import java.util.List;

public class Node {
    public final int value;
    public final Node left;
    public final Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public List<Integer> inOrder() {
        List<Integer> acc = new ArrayList<>();
        return inOrder(acc);
    }

    private List<Integer> inOrder(List<Integer> acc) {
        if (left != null) {
            left.inOrder(acc);
        }

        acc.add(value);

        if (right != null) {
            right.inOrder(acc);
        }

        return acc;
    }
}
