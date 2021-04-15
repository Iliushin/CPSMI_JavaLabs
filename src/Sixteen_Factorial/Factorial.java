package Sixteen_Factorial;

// вычисляет факториал введенного числа

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        boolean f = true;

        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите факториал числа");

                int n = in.nextInt();
                f = false;
                System.out.print("Факториал " + n + " = ");
                int i;
                int k = 1;
                if (n < 0) {
                    System.out.println("Так не бывает");
                } else {

                    for (i = 1; i <= n; i++) {
                        k = k * i;

                    }
                    System.out.print(k);
                }

            } catch (Exception e) {

                System.out.println("ne to");
            }
        } while (f);


    }
}
