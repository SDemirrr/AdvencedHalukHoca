package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();
        System.out.println("kilonuzu kg olarak giriniz");
        int kilo=scan.nextInt();
        double bmi=kilo/(boy*boy);


        if (bmi<=20){
            System.out.println("oldukca zayifsiniz");
        } else if (bmi<=25) {
            System.out.println("normal sinirlardasiniz");

        } else if (bmi<=30) {
            System.out.println("sisman kategorisindesiniz");
        } else if (bmi>30) {
            System.out.println("obez grubundasiniz");
        }else {
            System.out.println("hatali veriler girdiniz!!!");
        }


    }

}
