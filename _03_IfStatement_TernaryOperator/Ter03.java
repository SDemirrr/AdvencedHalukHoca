package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
          o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin.
          Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println((sayi > 99 && sayi < 1000) ? "uc basamakli" :( sayi % 2 == 0 )?
                "uc basamakli olmayan cift sayi" : "uc basamakli olmayan tek sayi");

    }
}