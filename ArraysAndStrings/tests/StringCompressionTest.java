import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {
    String compressable1 = "aaabcccccaaa";
    String compressable2 = "aaAAbcccccDDD";
    String uncompressable = "abbcdefg";


    @Test
    void strCompression() {
        StringCompression s = new StringCompression();
        assertEquals(s.strCompression(compressable1), "a3b1c5a3") ;
        assertEquals(s.strCompression(compressable2), "a2A2b1c5D3") ;
        assertEquals(s.strCompression(uncompressable), "abbcdefg") ;
    }
}