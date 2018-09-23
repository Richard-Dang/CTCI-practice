public class LinkedListHelper {

    public LinkedListHelper() {
    }

    public LinkedListNode arrayToList(int[] arr){
        LinkedListNode list = new LinkedListNode(arr[0]);
        for(int i = 1; i < arr.length; i++){
            list.appendToTail(arr[i]);

        }
        return list;
    }

    public boolean equals(LinkedListNode n1, LinkedListNode n2) {
        while(n1.next != null && n2.next != null){
            if(n1.data != n2.data){
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1.next == null && n2.next == null;
    }
}
