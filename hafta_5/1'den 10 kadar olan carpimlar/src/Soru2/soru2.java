package Soru2;
import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in); // kulanýcýdan deðer gönderme 
	        System.out.print("Bir Sayý Girin:");
	 
	        int sayi = reader.nextInt(); // klavyeden bir int deðeri okumak ve deðiþkene atamak için kullanýlýr
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", sayi, i, sayi * i);// (%=Dönüþümü baþlatan simge),( d=10 tabanlý tamsayý) , \n =(satýrbaþý yap)


	        }
	}
}