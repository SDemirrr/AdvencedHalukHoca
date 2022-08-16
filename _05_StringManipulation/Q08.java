package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime=scan.next();
        String temp=kelime;


        System.out.print(kelime.substring(0,1));
        for (int i = 0; i <kelime.length() ; i++) {
            System.out.print(kelime.substring(1));
        }











    }
}
