package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        System.out.println(((karakter>=97&&karakter<=122)||(karakter>='A'&&karakter<='Z'))?
                (karakter>=97&&karakter<=122?"kucuk harf":"buyuk harf"):"Harf degil");


    }
}
