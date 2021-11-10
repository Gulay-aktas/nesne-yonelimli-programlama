package Ýslemhesaplama;
import java.util.Scanner;
public class islemHesaplama {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz ");
        int sayi1 = scan.nextInt();
         
        System.out.println("Ikinci sayiyi giriniz ");
        double sayi2 = scan.nextInt();
         
        System.out.println("Sayilar Toplami : " + (sayi1 + sayi2));
        System.out.println("Sayilar Farki : " + (sayi1 - sayi2));
        System.out.println("Sayilar Carpimi : " + (sayi1 * sayi2));
        System.out.println("Sayilar Bolumu : " + (sayi1 / sayi2));
        System.out.println("Sayilarýn kalaný :" + (sayi1 % sayi2));
    }
	
}


