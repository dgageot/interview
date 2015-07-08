import java.util.Deque;
import java.util.LinkedList;

public class Node {
  private int value;
  private final Node left;
  private final Node right;

  public Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public Node(int value) {
    this(value, null, null);
  }

  public String levelOrderPrint() {
    StringBuilder print = new StringBuilder();

    Deque<Node> current = new LinkedList<>();
    current.add(this);
    Deque<Node> next = new LinkedList<>();

    while (!current.isEmpty()) {
      String level = "";
      for (Node node : current) {
        if (!level.isEmpty()) {
          level += " ";
        }
        level += node.value;

        if (node.left != null) {
          next.add(node.left);
        }
        if (node.right != null) {
          next.add(node.right);
        }
      }
      level += "\n";

      print.append(level);

      current = next;
      next = new LinkedList<>();
    }

    return print.toString();
  }
}
