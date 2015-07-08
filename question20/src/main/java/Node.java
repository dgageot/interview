import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

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

    List<Node> current = singletonList(this);
    List<Node> next = new ArrayList<>();

    do {
      boolean firstInLevel = true;

      for (Node node : current) {
        if (firstInLevel) {
          firstInLevel = false;
        } else {
          print.append(' ');
        }
        print.append(node.value);

        if (node.left != null) {
          next.add(node.left);
        }
        if (node.right != null) {
          next.add(node.right);
        }
      }
      print.append('\n');

      current = next;
      next = new ArrayList<>();
    } while (!current.isEmpty());

    return print.toString();
  }
}
