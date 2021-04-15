package Fifteen_srednee_arifm;

import java.util.Random;
// Определяет среднее арифметическое массива, в таком виде никуда не годится..

public class Sredniy_v_bolnice {


    public static void main(String[] args) {

        Random r = new Random();

        float[] f;
        f = new float[10];

        float d = 0;
        float m;
        for (int i=0; i< f.length; i++){
            f[i] = r.nextFloat();
            System.out.print(f[i] + " ");

            d = d + f[i];
        }
        m = d / f.length;
        System.out.println("Среднее арифметическое массива " + m);




    }
}

// Код, который нужно померить
