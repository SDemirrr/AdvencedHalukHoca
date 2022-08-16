package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("iki tam sayi giriniz");
		int sayi1=scanner.nextInt();
		int sayi2=scanner.nextInt();
		System.out.println("toplama yapmak icin +\ncikarma yapmak icin -" +
				"\ncarpma yapmak icin *\nbolme yapmak icin /\nGiriniz");
		char islem=scanner.next().charAt(0);

		switch (islem){
			case '+':
				System.out.println("toplam : "+(sayi1 + sayi2));
				break;
			case '-':
				System.out.println("fark : "+(sayi1 - sayi2));
				break;
			case '*':
				System.out.println("carpim : "+(sayi1 * sayi2));
				break;
			case '/':
				System.out.println("bolum : "+(sayi1 / sayi2));
				break;
			default:
				System.out.println("hatali giris yaptiniz tekrar deneyin");
		}


	}

}
