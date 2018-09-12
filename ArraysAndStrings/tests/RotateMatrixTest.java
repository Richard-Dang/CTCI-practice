import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    int[][] rotatedMatrix = {
            {7,4,1},
            {8,5,2},
            {9,6,3}
    };
    RotateMatrix r = new RotateMatrix();

    @Test
    void rotateMatrix() {
        assertTrue(Arrays.deepEquals(r.rotateMatrix(matrix), rotatedMatrix));
    }

    @Test
    void rotateMatrix2(){
        int[][] testRotatedMatrix = r.rotateMatrix(matrix);
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                assertEquals(testRotatedMatrix[i][j],rotatedMatrix[i][j]);
            }
        }
    }

    @Test
    void rotateMatrixInPlace() {
        assertTrue(Arrays.deepEquals(r.rotateMatrixInPlace(matrix), rotatedMatrix));
    }
}