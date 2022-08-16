package _04_switchCase;

import java.util.Scanner;

public class Q02_ {

    public static void main(String[] args) {
        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayı giriniz");

        int sayi= scan.nextInt();

        if (sayi>99||sayi<1000) {
            switch (sayi / 100) {
                case 1:
                    System.out.print("Yuz ");
                    break;
                case 2:
                    System.out.print("ikiyuz ");
                    break;
                case 3:
                    System.out.print("ucyuz ");
                    break;
                case 4:
                    System.out.print("dortyuz ");
                    break;
                case 5:
                    System.out.print("besyuz ");
                    break;
                case 6:
                    System.out.print("altiyuz ");
                    break;
                case 7:
                    System.out.print("yediyuz ");
                    break;
                case 8:
                    System.out.print("sekizyuz ");
                    break;
                case 9:
                    System.out.print("dokuzyuz ");
                    break;


            }
            switch (sayi % 100 / 10) {
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kirk ");
                    break;
                case 5:
                    System.out.println("elli ");
                    break;
                case 6:
                    System.out.print("atmis ");
                    break;
                case 7:
                    System.out.print("yetmis ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;

            }
            switch (sayi % 10) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;


            }
        }else {
            System.out.println("Girdiginiz sayi uc basamkli degildir");
        }
    }
}
