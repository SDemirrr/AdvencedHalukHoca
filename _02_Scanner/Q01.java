package _02_Scanner;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
    	/*
    	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
    	 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        String isim=scan.nextLine();
        System.out.print("soyisminizi giriniz : ");
        String soyIsim=scan.nextLine();
        System.out.print("Yasinizi giriniz : ");
        int yas=scan.nextInt();
        System.out.print("Boyunuzu giriniz : ");
        double boy=scan.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        double kilo=scan.nextDouble();


        System.out.println("isim : "+isim+"\nsoyisim : "+soyIsim+"\nyas : "+yas+"\nboy : "+boy+"\nkilo : "+kilo);





    }
}
