package Soru2;
import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in); // kulan�c�dan de�er g�nderme 
	        System.out.print("Bir Say� Girin:");
	 
	        int sayi = reader.nextInt(); // klavyeden bir int de�eri okumak ve de�i�kene atamak i�in kullan�l�r
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", sayi, i, sayi * i);// (%=D�n���m� ba�latan simge),( d=10 tabanl� tamsay�) , \n =(sat�rba�� yap)


	        }
	}
}