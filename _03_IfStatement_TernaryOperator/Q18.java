package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
                   eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF
                                                                       */


        Scanner scan=new Scanner(System.in);
        System.out.print("Vize sınav sonucunuzu giriniz : ");
        double vize=scan.nextDouble();
        System.out.print("Vize sınavı yüzdesini giriniz : ");
        double vizeYuzdesi=scan.nextDouble();
        System.out.print("final sınav sonucunuzu giriniz : ");
        double fnal=scan.nextDouble();
        System.out.print("final sınavı yüzdesini giriniz : ");
        double fnalYuzdesi=scan.nextDouble();

        double vizeNot=vize*vizeYuzdesi/100;
        double finalNot=fnal*fnalYuzdesi/100;

        if (vizeNot+finalNot>=90&&vizeNot+finalNot<=100){
            System.out.println((vizeNot+finalNot)+" : AA");
        } else if (vizeNot+finalNot>=80) {
            System.out.println((vizeNot+finalNot)+" : BA");
        }else if (vizeNot+finalNot>=70) {
            System.out.println((vizeNot+finalNot)+" : BB");
        }else if (vizeNot+finalNot>=60) {
            System.out.println((vizeNot+finalNot)+" : CB");
        }else if (vizeNot+finalNot>=50) {
            System.out.println((vizeNot+finalNot)+" : CC");
        }else if (vizeNot+finalNot>=40) {
            System.out.println((vizeNot+finalNot)+" : DC");
        } else if (vizeNot+finalNot>=30) {
            System.out.println((vizeNot+finalNot)+" : DD");
        }else {
            System.out.println((vizeNot+finalNot)+" : FF");
        }


}
}
