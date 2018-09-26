public class ReturnKthToList {
    /**
     * Creates a new linked list of the kth to last element of a singly linked list
     * @param head head node of linked list
     * @param k kth element of linked list
     * @return a new linked list of the kth to last element of a singly linked list
     * @runtime O(n)
     */
    public LinkedListNode returnKthToList(LinkedListNode head, int k) {
       LinkedListNode p1 = head;
       LinkedListNode p2 = head;

       for(int i = 1; i < k; i++){
           if (p2.next == null) return null;
           p2 = p2.next;
       }

       while(p2.next != null){
           p1 = p1.next;
           p2 = p2.next;
       }

       return p1;
    }
}
