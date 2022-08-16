package _03_IfStatement_TernaryOperator;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("lütfen 1. numarayı giriniz");

    int num1 = scan.nextInt();
    System.out.println("lütfen 2. numara giriniz");
    int num2 = scan.nextInt();
    System.out.println("lütfen 3. numara giriniz");
    int num3 = scan.nextInt();


    if (num1>num2&&num1>num3){
        System.out.println("en buyuk sayi : "+num1);
        if (num2>num3){
            System.out.println("en kucuk sayi : "+num3);
        }else {
            System.out.println("en kucuk sayi : "+num2);
        }
    }else  if (num2>num1&&num2>num3) {
        System.out.println("en buyuk sayi : " + num2);
        if (num1 > num3) {
            System.out.println("en kucuk sayi : " + num3);
        } else {
            System.out.println("en kucuk sayi : " + num1);
        }
    }else  if (num3>num1&&num3>num2) {
        System.out.println("en buyuk sayi : " + num3);
        if (num2 > num1) {
            System.out.println("en kucuk sayi : " + num1);
        } else {
            System.out.println("en kucuk sayi : " + num2);
        }
    }
    else{
        System.out.println("Girdiginiz sayilar birbirine esittir ");
    }



}
}

