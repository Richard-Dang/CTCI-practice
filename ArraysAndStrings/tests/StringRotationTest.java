import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

    String original = "waterbottle";
    String rotated = "erbottlewat";
    String bad = "erbottlewater";


    @Test
    void isStringRotation() {
        StringRotation s = new StringRotation();
        assertTrue(s.isStringRotation(original, rotated));
        assertFalse(s.isStringRotation(original, bad));

    }

    @Test
    void isStringRotation2() {
        StringRotation s = new StringRotation();
        assertTrue(s.isStringRotation2(original, rotated));
        assertFalse(s.isStringRotation2(original, bad));
    }
}