import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {
    String str = "This is a test  string ";
    String urlifiedStr = str.replace(" ", "%20");

    @Test
    void URLify() {
        URLify u = new URLify();
        assertEquals(u.URLify(str,str.length()), urlifiedStr);
    }
}