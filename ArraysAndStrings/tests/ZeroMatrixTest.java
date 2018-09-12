import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMatrixTest {
    int[][] matrix = {
            {1,2,3},
            {4,5,0},
            {7,8,9}
    };

    int[][] zeroMatrix = {
            {1,2,0},
            {0,0,0},
            {7,8,0}
    };

    ZeroMatrix z = new ZeroMatrix();

    @Test
    void zeroMatrix() {
        assertTrue(Arrays.deepEquals(z.ZeroMatrix(matrix), zeroMatrix));
    }
}