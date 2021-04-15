package Eleven_Stroitel;


// По введенным размерам кирпича и отверстия, определяет пролезет ли кирпич в отверстие

import java.util.Scanner;

public class Kirpichi {
    public static void main(String[] args) {
        boolean flag = true;
        int a, b, m, k, l;
        a = b = m = k = l = 0;
        do {


            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите размер отверстия a x b, a: ");
                a = in.nextInt();
                System.out.print("Введите размер отверстия a x b, b: ");
                b = in.nextInt();
                System.out.print("Введите размер кирпича m x k x l, m: ");
                m = in.nextInt();
                System.out.print("Введите размер кирпича m x k x l, k: ");
                k = in.nextInt();
                System.out.print("Введите размер кирпича m x k x l, l: ");
                l = in.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Неверное значение, придётся начинать сначала!");

            }
        } while (flag);
        if (m > a & k > b | m > a & l > b | k > a & m > b | k > a & l > b | l > a & m > b | l > a & l > b) {
            System.out.println("Пихай его скорее!");
        } else System.out.println("Не пройдёт!");


    }
}
