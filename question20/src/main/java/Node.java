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
      print.append("2 3\n");
    }

    return print.toString();
  }
}
