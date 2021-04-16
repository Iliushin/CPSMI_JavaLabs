package Ten_Genomnaya_posledov;

// Сортирует массив по возрастанию, медленно но верно ( пузырек )

import java.util.Random;

public class Sort {


    public static void main(String[] args) {

        int[] arr;
        int change;
        boolean f = false;
        arr = new int[10];
        Random newsymb = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newsymb.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        while (!f) {
            f = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    change = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = change;
                    f = false;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


        }


    }

}

