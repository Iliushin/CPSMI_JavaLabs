package Twelve_Fibonachi;


// ВЫводит на экран числа Фибоначи

public class Fibonachi {
    public static void main(String[] args) {
        int l = 1;
        int r = 1;
        System.out.print(l + " " + r + " ");
        int nextNumber = 0;
        while (nextNumber < 100) {
            nextNumber = l + r;
            System.out.print(nextNumber + " ");
            l = r;
            r = nextNumber;

        }
    }
}

