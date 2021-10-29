package silindir_hacmi.java;
import java.util.Scanner;
public class SilindirHacmi {
	/*
	 * gülay aktas
	 * 
	program kodu
	*/

	        public static void main(String[] args) {
		    Scanner giris=new Scanner(System.in); // kulanýcýdan deðer atama
		    double yaricap,yukseklik,yuzeyalani,hacim,pidegeri=3;// pi*yarýcap*yükseklik
		    System.out.println("Lütfen yarýçapý giriniz:");
		    yaricap=giris.nextDouble(); // yarýçap deðerinin virgülü sayý alabileceðini belirtir
		    System.out.println("Lütfen yüksekliði giriniz:");
		    yukseklik=giris.nextDouble();
		    yuzeyalani=2*pidegeri*yaricap*yukseklik; 
		    hacim=pidegeri*yaricap*yaricap*yukseklik;// hacim hesaplama formülü
		    System.out.println("Yüzey alaný:"+yuzeyalani); // yüzey alanýný yazma
		    System.out.println("Hacim:"+hacim);// hacmi yazdýrma
	}

}
