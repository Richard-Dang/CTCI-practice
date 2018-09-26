public class DeleteMiddleNode {

    /**
     *  Deletes the middle node of a linked list given the middle node
     * @param middle middle node
     * @return true if the middle node is delete, false otherwise
     * @runtime O(n)
     */
    public boolean deleteMiddleNode(LinkedListNode middle){
        if (middle == null || middle.next == null) return false;
        while(middle.next != null){
            middle.data = middle.next.data;
            if(middle.next.next == null){
                middle.next = null;
                break;
            }
            middle = middle.next;
        }
        return true;
    }

    /**
     *  Deletes the middle node of a linked list given the middle node
     * @param middle middle node
     * @return true if the middle node is delete, false otherwise
     * @runtime O(1)
     */
    public boolean deleteMiddleNodeBetter(LinkedListNode middle){
        if (middle == null || middle.next == null) return false;
        middle.data = middle.next.data;
        middle.next = middle.next.next;
        return true;
    }
}
