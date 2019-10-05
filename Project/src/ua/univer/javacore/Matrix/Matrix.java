package ua.univer.javacore.Matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 54},
                {4, 5, 5, 3, 7, 7},
                {5, 3, 4, 56, 4}};
        System.out.println("Matrix L: " + matrix.length);
        System.out.println(matrix[0].length);
        int maxLength = getMaxLength(matrix);
        int[][] transpMatrix = new int[maxLength][matrix.length];
        Transp(matrix, transpMatrix);
        printMatrix(transpMatrix);
    }

    public static void Transp(int[][] matrix, int[][] transpMatrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpMatrix[j][i] = matrix[i][j];
            }
        }
    }

    public static int getMaxLength(int[][] matrix) {
        int maxLength = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (maxLength < matrix[i].length) maxLength = matrix[i].length;
        }
        return maxLength;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
