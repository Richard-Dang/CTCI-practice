import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMiddleNodeTest {
    DeleteMiddleNode d = new DeleteMiddleNode();
    int[] original = {5,2,5,7,2,1,9};
    int[] middle = {5,7,2,1,9};
    int[] expected = {7,2,1,9};
    LinkedListHelper helper = new LinkedListHelper();

    @Test
    void deleteMiddleNode() {
        LinkedListNode middleList = helper.arrayToList(middle);
        LinkedListNode expectedList = helper.arrayToList(expected);

        d.deleteMiddleNode(middleList);
        assertTrue(helper.equals(middleList, expectedList));
    }

    @Test
    void deleteMiddleNodeBetter() {
        LinkedListNode middleList = helper.arrayToList(middle);
        LinkedListNode expectedList = helper.arrayToList(expected);

        d.deleteMiddleNodeBetter(middleList);
        assertTrue(helper.equals(middleList, expectedList));
    }
}