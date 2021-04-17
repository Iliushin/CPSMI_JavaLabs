package Thirteen_SledMAtr;

import java.util.Random;
import java.util.Scanner;


public class Sled {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int n = in.nextInt();
        int m;
        m = n;

        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random rand = new Random();
                arr[i][j] = rand.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");


        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i][i];

        }
        System.out.println("След матрицы " + a);
    }
}

