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
			 System.out.println("müsteri eklemek istiyor musunuz evet ise q  ya basın, hayır için herhangi bir tuşa basın");
				veri=input.nextLine();
				if(veri.equals("q")) {
					 System.out.println("müsteri adı,soyadı,tc,tel,email"
					 		+ "\nkullanıcı bilgilerini girerken virgül bırakın araya , virgülden sonra boşluk bırakmayın");
					 musteri.bilgi.add(ad.next());
					 System.out.println(" kargonun kilo bilgisi girin");
					 kilo=araclar.nextInt();
					 if(kilo>10)
					musteri.bilgi.add(arac.arac1);
					 if(kilo<4)
							musteri.bilgi.add(arac.arac2);
					 if(kilo>=5 && kilo<10)
							musteri.bilgi.add(arac.arac3);
					 
					 System.out.println("müsteri bilgileri="+musteri.bilgi );
					 }
				
				else
				{
					 System.out.println("kayıt eklenmedi ");
					break;
				}
		 }
		 
		
		
		

	}

}
