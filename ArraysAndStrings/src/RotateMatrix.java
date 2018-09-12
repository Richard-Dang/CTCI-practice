public class RotateMatrix {

    /**
     * rotates an integer matrix 90 degrees
     * @param matrix input matrix
     * @return new matrix rotated 90 degrees
     * @runtime O(n^2)
     */
    public int[][] rotateMatrix(int[][] matrix){
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                newMatrix[j][2-i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public int[][] rotateMatrixInPlace(int[][] matrix){

            int n = matrix.length;
            for (int layer = 0 ; layer < n / 2 ; layer++) {
                int first = layer;
                int last = n - 1 - layer;
                for (int i = first; i < last; i++) {
                    int offset = i - first;
                    //save top
                    int top = matrix[first][i];
                    //left -> top
                    matrix[first][i] = matrix[last - offset][first];
                    //bottom -> left
                    matrix[last - offset][first] = matrix[last][last - offset];
                    //right -> bottom
                    matrix[last][last - offset] = matrix[i][last];
                    //top -> right
                    matrix[i][last] = top;
                }
            }

        return matrix;
    }
}
