import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {
    CheckPermutation cp = new CheckPermutation();
    String a = "richard";
    String b = "hradicr";
    String c = "abcdefg";

    @Test
    void isPermuatation() {
        assertTrue(cp.isPermutation(a,b));
        assertFalse(cp.isPermutation(a,c));
    }

    @Test
    void isPermutation2() {
        assertTrue(cp.isPermutation2(a,b));
        assertFalse(cp.isPermutation2(a,c));
    }
}