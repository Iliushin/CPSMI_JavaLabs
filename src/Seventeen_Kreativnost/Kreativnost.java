package Seventeen_Kreativnost;

// Считает количество слов и букв в строке (считает правильно но через какие-то страшные костыли)...

import java.util.Scanner;

public class Kreativnost {
    public static boolean slovo(char wq) {
        if (wq != '\t' && wq != ','
                && wq != '.' && wq != '!' && wq != '?'
                && wq != ':' && wq != ';' && wq != '('
                && wq != ')' && wq != '}' && wq != '{' && wq != ' ') return true;
        else return false;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите Строку ");

        String n = in.nextLine();
        System.out.println(n);
        int t = n.length();
        int d = 0;
        int k = 0;
        if (n != "") {

            for (int i = 0; i < n.length() - 1; i++) {
                if (slovo(n.charAt(i)) ) {
                    d++;
                    if (i + 1 == n.length() - 1) {
                        k++;
                        break;
                    } else if (!slovo(n.charAt(i + 1))) {
                        k++;
                    }


                } else {
                    if (i + 1 == n.length() - 1) {

                        if (!slovo(n.charAt(n.length() - 2)) ) {
                            if (slovo(n.charAt(n.length() - 1)) ) {
                                k++;
                            }
                        }
                    }

                }
            }
            if (slovo(n.charAt(n.length() - 1))) {
                d++;
            }


            System.out.println("Количество букв = " + d + " Количество слов = " + k);
        } else System.out.println("Пустая строка");
    }


}