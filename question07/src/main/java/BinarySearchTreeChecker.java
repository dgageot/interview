public class BinarySearchTreeChecker {
    public boolean isValid(Node tree) {
        return isValid(tree, new Integer[]{Integer.MIN_VALUE});
    }

    private static boolean isValid(Node tree, Integer[] last) {
        if (tree == null) {
            return true;
        }

        if (!isValid(tree.left, last)) {
            return false;
        }

        if (tree.value < last[0]) {
            return false;
        }

        last[0] = tree.value;

        return isValid(tree.right, last);
    }
}
