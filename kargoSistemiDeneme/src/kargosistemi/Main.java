package kargosistemi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Musteri  musteri=new Musteri();
		Arac arac=new Arac();
		 Scanner input = new Scanner(System.in);
		 Scanner ad = new Scanner(System.in);
		 Scanner araclar = new Scanner(System.in);
		 int kilo;
		 String veri;
		 
		 while(true) {
			 System.out.println("m�steri eklemek istiyor musunuz evet ise q  ya bas�n, hay�r i�in herhangi bir tu�a bas�n");
				veri=input.nextLine();
				if(veri.equals("q")) {
					 System.out.println("m�steri ad�,soyad�,tc,tel,email"
					 		+ "\nkullan�c� bilgilerini girerken virg�l b�rak�n araya , virg�lden sonra bo�luk b�rakmay�n");
					 musteri.bilgi.add(ad.next());
					 System.out.println(" kargonun kilo bilgisi girin");
					 kilo=araclar.nextInt();
					 if(kilo>10)
					musteri.bilgi.add(arac.arac1);
					 if(kilo<4)
							musteri.bilgi.add(arac.arac2);
					 if(kilo>=5 && kilo<10)
							musteri.bilgi.add(arac.arac3);
					 
					 System.out.println("m�steri bilgileri="+musteri.bilgi );
					 }
				
				else
				{
					 System.out.println("kay�t eklenmedi ");
					break;
				}
		 }
		 
		
		
		

	}

}
