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
    return null;
  }
}
