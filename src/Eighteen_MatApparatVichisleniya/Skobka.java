package Eighteen_MatApparatVichisleniya;

// Определяет правильность расстановки скобок

import java.util.Scanner;

public class Skobka {

    public static void main(String[] args) {

        char p = '(';
        char q = ')';
        int f = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите формулу ");

        String n = in.nextLine();
        System.out.println(n);
        int t = n.length();
        boolean z = true;


        for (int i = 0; i < n.length(); i++) {

            if (n.charAt(i) == p) {
                f++;
            } else if (n.charAt(i) == q) {
                f--;
                if (f < 0) {
                    z = false;
                    break;

                }
            }
        }
        if (f != 0 & !z) {
            System.out.println("ERROR");

        } else System.out.println("OK");
    }
}

