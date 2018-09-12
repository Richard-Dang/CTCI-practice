public class ZeroMatrix {

    public int[][] ZeroMatrix(int[][] matrix){
        boolean[] zeroRow = new boolean[matrix.length];
        boolean[] zeroCol = new boolean[matrix[0].length];

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        for(int i = 0 ; i < zeroRow.length; i++){
            if(zeroRow[i]) {
                insertRowZeros(i, matrix);
            }
        }

        for(int j = 0 ; j < zeroRow.length; j++) {
            if (zeroCol[j]) {
                insertColZeros(j, matrix);
            }
        }

        return matrix;
    }

    private void insertRowZeros(int row, int[][]matrix){
        for(int j = 0; j < matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    private void insertColZeros(int col, int[][]matrix){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
    }
}
