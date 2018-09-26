import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnKthToListTest {
    int[] original = {5,2,5,7,2,1,9};
    int[] expected = {2,1,9};
    int k = 3;
    LinkedListHelper helper = new LinkedListHelper();
    ReturnKthToList r = new ReturnKthToList();

    @Test
    void returnKthToList() {
        LinkedListNode originalList = helper.arrayToList(original);
        LinkedListNode expectedList = helper.arrayToList(expected);

        assertTrue(helper.equals(r.returnKthToList(originalList, k), expectedList));
    }
}