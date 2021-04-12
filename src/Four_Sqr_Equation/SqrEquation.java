package Four_Sqr_Equation;
import java.util.Scanner;

import static java.lang.Math.sqrt;

// Вычисляет корни квадратного уравнения по введенным коэффициентам

public class SqrEquation {
    public static void main(String[] args) {

        double x1,x2,a,b,c;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэф. а ");
        a = in.nextInt();
        System.out.print("Введите коэф. b ");
        b = in.nextInt();
        System.out.print("Введите коэф. c ");
        c = in.nextInt();


        if(b * b - 4 * a * c > 0 ){
            x1 = (-b + sqrt(b * b - 4 * a * c)) / 2 * a;
            x2 = (-b - sqrt(b * b - 4 * a * c)) / 2 * a;
            System.out.println("x1 = " + x1 + ", x2 = "+ x2);
        }
        else{
            System.out.println("Корней нет");
        }

    }
}
