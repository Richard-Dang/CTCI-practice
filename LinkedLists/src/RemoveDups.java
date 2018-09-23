import java.util.HashSet;

public class RemoveDups {

    /**
     * Removes duplicate values from a linked list
     *
     * @param head head node of linked list
     * @runtime O(n)
     */
    public void removeDups(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode prev = null;
        while (head.next != null) {
            if (set.contains(head.data)) {
                prev.next = head.next;
            } else {
                set.add(head.data);
                prev = head;
            }
            head = head.next;
        }
    }

    /**
     * Removes duplicate values from a linked list
     *
     * @param head head node of linked list
     * @runtime O(n ^ 2)
     */
    public void removeDupsWithoutBuffer(LinkedListNode head) {
        LinkedListNode current = head;
        while (current.next != null) {
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
