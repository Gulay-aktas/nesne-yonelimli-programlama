package silindir_hacmi.java;
import java.util.Scanner;
public class SilindirHacmi {
	/*
	 * g�lay aktas
	 * 
	program kodu
	*/

	        public static void main(String[] args) {
		    Scanner giris=new Scanner(System.in); // kulan�c�dan de�er atama
		    double yaricap,yukseklik,yuzeyalani,hacim,pidegeri=3;// pi*yar�cap*y�kseklik
		    System.out.println("L�tfen yar��ap� giriniz:");
		    yaricap=giris.nextDouble(); // yar��ap de�erinin virg�l� say� alabilece�ini belirtir
		    System.out.println("L�tfen y�ksekli�i giriniz:");
		    yukseklik=giris.nextDouble();
		    yuzeyalani=2*pidegeri*yaricap*yukseklik; 
		    hacim=pidegeri*yaricap*yaricap*yukseklik;// hacim hesaplama form�l�
		    System.out.println("Y�zey alan�:"+yuzeyalani); // y�zey alan�n� yazma
		    System.out.println("Hacim:"+hacim);// hacmi yazd�rma
	}

}
