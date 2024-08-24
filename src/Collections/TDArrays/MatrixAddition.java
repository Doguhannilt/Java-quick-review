package Collections.TDArrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] totalMatrix = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                totalMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }


        for (int i = 0; i < totalMatrix.length; i++) {
            for (int j = 0; j < totalMatrix[i].length; j++) {
                System.out.print(totalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
