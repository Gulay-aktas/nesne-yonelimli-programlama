package Soru3;
import java.util.*;

public class terscevirme {

	public static void main(String[] args) {
		 String yaz�, reverse = "";
		    Scanner in = new Scanner(System.in); // kulan�c�dan de�er g�nderme

		    System.out.println("Ters �evirilecek stringi girin");
		    yaz� = in.nextLine();

		    int length = yaz�.length(); 

		    for (int i = length - 1 ; i >= 0 ; i--) // de�er eksiltip en son de�eri ba�a  d�nd�rme y�ntemi ile d�ng� olu�turma
		      reverse = reverse + yaz�.charAt(i); // Karakter dizisinden tek tek karakterler almak i�in charAt y�ntemi kullan�yoruz.

		    System.out.println("Stringin tersi: " + reverse); // tersine �evirme i�lemi
	}

}
