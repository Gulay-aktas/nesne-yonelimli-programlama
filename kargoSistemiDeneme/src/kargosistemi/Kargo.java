package kargosistemi;


import java.util.ArrayList;
import java.util.Vector;




public class Kargo {
	
	public int kargo_;
	public Musteri _musteri;
	public String aliciAdi;
	public String aliciSoyadi;
	public String aliciTel;
	public Adres _aliciAdres;
	public double kilo;
	public Sube _gondericiSube;
	public Sube _aliciSube;

	//public Date subeyeUlasmaTarihi;
	
	
	
	
	public Kargo kargoBilgisi(int id){
		
		return new Kargo().kargoBilgisi(id);
	}
	
	public ArrayList<Kargo> kargoAra(Kargo _k) {
		return new Kargo().kargoAra(_k);
	}
	
	public boolean durumGuncelle(Kargo _k){
		return new Kargo().durumGuncelle(_k);
		
	}
	
 	public Vector<Object> kargoDurumu(){
		
		return new Kargo().kargoDurumu();
	}

 	public ArrayList<Kargo> subedekiKargolar(int sube_){
 		return new Kargo().subedekiKargolar(sube_);
 	}
 	
 	public ArrayList<Kargo> gelecekKargolar(int sube_){
 		return new Kargo().gelecekKargolar(sube_);
 	}
 	
 	public int musteriKargobilgisi(String aTel,int kKodu){
 		return new Kargo().musteriKargobilgisi(aTel, kKodu);
 	}
 	
 	
 	
 	public ArrayList<Kargo> subeAylik(int sube_,String tarih){
 		return new Kargo().subeAylik(sube_,tarih);
 	}
 	
}