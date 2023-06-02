package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Scanner;

    public class DisplayMaxNUmber {
    public static void main(String[] args) {
        System.out.println("Ведите первое чесло:");
        var a = new Scanner(System.in).nextInt();;
        System.out.println("Ведите второе чесло:");
        var b = new Scanner(System.in).nextInt();;
         var result = a > b? a:b;
        System.out.println("Резултать :"+result);
    }
}
