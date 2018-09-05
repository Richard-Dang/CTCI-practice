import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {
    String original = "pale";
    String insert = "pales";
    String remove = "ple";
    String replace = "bale";
    String multiple = "bake";

    @Test
    void isOneAway() {
        OneAway o = new OneAway();
        assertTrue(o.isOneAway(original, insert));
        assertTrue(o.isOneAway(insert, original));
        assertTrue(o.isOneAway(original, remove));
        assertTrue(o.isOneAway(remove, original));
        assertTrue(o.isOneAway(original, replace));
        assertTrue(o.isOneAway(replace, original));
        assertFalse(o.isOneAway(original, multiple));
    }
}