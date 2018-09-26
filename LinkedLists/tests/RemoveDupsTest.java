import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {
    int[] original = {2,9,5,7,5,3,9,5,1};
    int[] expected = {2,9,5,7,3,1};
    LinkedListHelper helper = new LinkedListHelper();
    RemoveDups r = new RemoveDups();

    @Test
    void removeDups() {
        LinkedListNode originalList = helper.arrayToList(original);
        LinkedListNode expectedList = helper.arrayToList(expected);

        r.removeDups(originalList);
        assertTrue(helper.equals(originalList, expectedList));
    }

    @Test
    void removeDups2() {
        LinkedListNode originalList = helper.arrayToList(original);
        LinkedListNode expectedList = helper.arrayToList(expected);

        r.removeDupsWithoutBuffer(originalList);
        assertTrue(helper.equals(originalList, expectedList));
    }
}