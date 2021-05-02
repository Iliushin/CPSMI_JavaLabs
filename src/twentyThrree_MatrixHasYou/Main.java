package twentyThrree_MatrixHasYou;

public class Main {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        Matrix matrix3 = new Matrix(3, 2);



        matrix1.zapolnenie();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        matrix2.zapolnenie();
        System.out.println("____________________________________");
         matrix1.add(matrix2);
        System.out.println("____________________________________");
        matrix1.add(matrix3);












    }


}


