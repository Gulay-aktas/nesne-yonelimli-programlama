package Soru3;
import java.util.*;

public class terscevirme {

	public static void main(String[] args) {
		 String yazý, reverse = "";
		    Scanner in = new Scanner(System.in); // kulanýcýdan deðer gönderme

		    System.out.println("Ters çevirilecek stringi girin");
		    yazý = in.nextLine();

		    int length = yazý.length(); 

		    for (int i = length - 1 ; i >= 0 ; i--) // deðer eksiltip en son deðeri baþa  döndürme yöntemi ile döngü oluþturma
		      reverse = reverse + yazý.charAt(i); // Karakter dizisinden tek tek karakterler almak için charAt yöntemi kullanýyoruz.

		    System.out.println("Stringin tersi: " + reverse); // tersine çevirme iþlemi
	}

}
