package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int sayi=scan.nextInt();

		if (sayi>=0){
			System.out.println(sayi+"'in mutlak degeri : "+sayi);
		} else if (sayi<0) {
			System.out.println(sayi+"'in mutlak degeri : "+(-1*sayi));
		}




	}

}
