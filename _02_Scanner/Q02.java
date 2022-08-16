package _02_Scanner;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        String sayiLenght=Integer.toString(sayi);

        int yuzler=sayi%10;
        sayi=sayi/10;
        int onlar=sayi%10;
        sayi=sayi/10;
        int birler=sayi%10;

        System.out.println("Girdiginiz sayinin birler basamagi : "+yuzler+"" +
                "\nGirdiginiz sayinin onlar basamagi : "+onlar+
                "\nGirdiginiz sayinin yuzler basamagi : "+birler);




    }

}
