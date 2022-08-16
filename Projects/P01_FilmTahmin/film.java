package Projects.P01_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class film {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST",
            "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan=new Scanner(System.in);
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf sayisının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */
public static void main(String[] args) {

    System.out.println("*****FILM TAHMIN OYUNUNA HOSGELDINIZ*****");
    System.out.println("1-"+film.size()+" arasinda bir tahmin giriniz");
    int tahmin=scan.nextInt();

    filmTahmin(film,tahmin);
     }
     private static void filmTahmin(List<String> film, int tahmin) {

    String tahminEdilenFilm= film.get(tahmin-1);
         System.out.println(tahminEdilenFilm);
         int harfSayisi=tahminEdilenFilm.length();
         System.out.println("Sectiginiz film : "+tahminEdilenFilm+"\nmax tahmin etme sayiniz : "+(harfSayisi*2));

         int dogruSayac=0;
         int yanlisSayac=0;
         char harf=' ';
         String harfBirlestir="";

         do {
             System.out.println("tahmin ettiginiz harfi giriniz : ");
             harf=scan.next().charAt(0);
             harfBirlestir+=harf;

             for (int i = 0; i <film.get(harfSayisi).length() ; i++) {
                 if (film.get(harfSayisi).charAt(i)==harf){
                     if (!tahminEdilenFilm.contains(film.get(harfSayisi))){
                         yanlisSayac++;
                     }else {
                         dogruSayac++;
                     }
                 }

             }

         }while (dogruSayac!=harfSayisi*2);

    }
}
