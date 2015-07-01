public class BinarySearchTreeChecker {
    public boolean isValid(Node tree) {
        return isValid(tree, new Integer[1]);
    }

    private static boolean isValid(Node tree, Integer[] last) {
        if (tree.left != null) {
            if (!isValid(tree.left, last)) {
                return false;
            }
        }

        if ((last[0] != null) && tree.value < last[0]) {
            return false;
        }
        last[0] = tree.value;

        if (tree.right != null) {
            if (!isValid(tree.right, last)) {
                return false;
            }
        }

        return true;
    }
}
