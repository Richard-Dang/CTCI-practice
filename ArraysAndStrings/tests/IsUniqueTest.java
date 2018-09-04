import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {
    IsUnique iu = new IsUnique();
    String uniqueChar = "abcde";
    String dupChar = "richard";

    @Test
    void uniqueChars() {
        assertTrue(iu.isUniqueChars(uniqueChar));
        assertFalse(iu.isUniqueChars(dupChar));
    }

    @Test
    void uniqueCharsNoDataStruct() {
        assertTrue(iu.isUniqueCharsNoDataStruct(uniqueChar));
        assertFalse(iu.isUniqueCharsNoDataStruct(dupChar));
    }
}