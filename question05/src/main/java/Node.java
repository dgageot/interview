import java.util.ArrayList;
import java.util.List;

public class Node {
    public final int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }


    public static List<Integer> toList(Node head) {
        List<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list;
    }

    public static Node remove(Node head, int valueToRemove) {
        Node previous = null;
        Node newHead = head;
        Node next;

        for (Node current = head; current != null; current = next) {
            next = current.next;

            if (current.value == valueToRemove) {
                if (previous == null) {
                    newHead = next;
                } else {
                    previous.next = next;
                }
            } else {
                previous = current;
            }
        }

        return newHead;
    }
}
