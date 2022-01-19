package kargosistemi;

import java.util.ArrayList;



public class Musteri extends Kisi<Musteri>{

	public int musteri_;
	private Adres _adres;
	
	

	
	boolean kisiEkle(Musteri _m) {
		//
		return false;
	}
	
	public int musteriEkle(Musteri _m){
		if( (_m._adres.adres_= new Adres().adresEkle(_m._adres) )> 0){
			return new Musteri().musteriEkle(_m);
		}else{
			return -1;
		}
	}

	public boolean kisiGuncelle(Musteri _m) {
		if(new Adres().adresGuncelle(_m._adres)){
			return new Musteri().kisiGuncelle(_m);
		}else{
			return false;
		}
	}


	boolean kisiSil(int id) {
		return new Musteri().kisiSil(id);
	}

	public ArrayList<Musteri> kisiAra(Musteri _m) {
		return new Musteri().kisiAra(_m);
	}

	ArrayList<Musteri> kisileriListele() {
		
		return null;
	}

	
	public Musteri kisiBilgisi(int id) {
		return new Musteri().kisiBilgisi(id);
	}
}
