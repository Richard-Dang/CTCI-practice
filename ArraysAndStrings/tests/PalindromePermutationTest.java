import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {
    String goodStr = "Tact Coa";
    String badStr = "Richard";

    @Test
    void isPlaindromePermutation() {
        PalindromePermutation p = new PalindromePermutation();
        assertTrue(p.isPalindromePermutation(goodStr));
        assertFalse(p.isPalindromePermutation(badStr));

    }
}