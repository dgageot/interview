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

    print.append(value).append("\n");

    if (left != null) {
      print.append(left.value).append(" ");
    }
    if (right != null) {
      print.append(right.value).append("\n");
    }

    return print.toString();
  }
}
