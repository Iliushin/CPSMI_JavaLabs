package twentyThrree_MatrixHasYou;


import java.util.Random;
/** получает на вход размер массива m и n, заполняет его, может складывать один к другому
 */

public class Matrix {
    private int m;
    private int n;

    // public int[][] matrix = new int[n][m];
    private int[][] matrix;


    public Matrix(int n, int m) {
        this.m = m;
        this.n = n;


    }

    public void zapolnenie() {
        matrix = new int[getN()][getM()];
        for (int i = 0; i < getN(); i++) {
            for (int j = 0; j < getM(); j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(20);
                System.out.print(matrix[i][j] + " ");


            }
            System.out.println();


        }

    }

    public void add(Matrix x) {
        //if (x.matrix[x.matrix.length][x.matrix.length] == matrix[matrix.length][matrix.length]) {
        if (x.getM() == getM() & x.getN() == getN()) {
            for (int i = 0; i < getN(); i++) {
                for (int j = 0; j < getM(); j++) {
                    matrix[i][j] = matrix[i][j] + x.matrix[i][j];
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка");
        }

    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }


}

