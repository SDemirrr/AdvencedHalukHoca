package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime girirniz");
        String str=scan.nextLine();

        boolean varMi=xyzVarMi(str);
        System.out.println(varMi);


    }

    private static boolean xyzVarMi(String str) {
        boolean varMi=true;

        if (str.contains("xyz")){
            return true;
        }else
            return false;
    }

}
