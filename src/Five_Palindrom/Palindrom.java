package Five_Palindrom;

import java.util.Scanner;

// Вычисляет является ли пятизначное число Палиндромом

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пятизначный Палиндром ");
        int a = in.nextInt();
        int b,c,d;

        b = a % 10;
        a = (a - b) / 10;
        c = a % 10;
        a = (a - c) / 10;
        a = (a-(a%10))/10;
        d = a % 10;
        a = (a - d) / 10;


        if (b == a) {
            if (c == d) {
                System.out.println("Палиндром");
            }
            else {
                System.out.println("Не палиндром");
            }
        }
            else{
                System.out.println("Не палиндром");
            }

    }
}
