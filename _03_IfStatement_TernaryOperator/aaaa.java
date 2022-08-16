package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        int yil = scan.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                } else artikYil = false;
            } else artikYil = true;
        } else artikYil = false;

        if (artikYil == false) {
            System.out.println(yil + " Artık yıl degildir");
        } else System.out.println(yil + " Artik yildir");

    }
}
