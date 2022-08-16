package _02_Scanner;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {


		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner scan=new Scanner(System.in);
		System.out.print("1. sayiyi girin : ");
		int sayi1=scan.nextInt();
		System.out.print("2. sayiyi girin : ");
		int sayi2=scan.nextInt();

		System.out.println("toplam : "+(sayi1+sayi2)+"\nfark : "+(sayi1-sayi2)+
				"\ncarpim : "+(sayi1*sayi2)+"\nbolum : "+(sayi1/sayi2));

	}
}
