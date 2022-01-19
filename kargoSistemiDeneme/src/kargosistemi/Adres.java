package kargosistemi;

import java.util.ArrayList;
import java.util.Vector;



public class Adres {

	
	public String adres;
	public int ilce_;
	public String ilce;
	public int il_;
	public String il;
	public int adres_;
	
	int adresEkle(Adres _a) {
		
		adres_=new Adres().adresEkle(_a) ;
		return adres_ > 0 ? adres_:-1;	
	}
	
	boolean adresGuncelle(Adres _a) {
		return new Adres().adresGuncelle(_a);
	}
	
	Adres adresBilgisi(int id){
		return new Adres().adresBilgisi(id);
	}
	
	ArrayList<Adres> adresAra(Adres _a) {
		return new Adres().adresAra(_a);
	}
	
	public ArrayList<Adres> ilceAra(int il_) {
		return new Adres().ilceAra(il_);
	}
	
	public ArrayList<Adres> ilListele() {
		return new Adres().ilListele();
	}
	
	public Vector<Object> illerVector()	{
		
		ArrayList<Adres> iller=new Adres().ilListele();
		Vector<Object> _v=new Vector<>();
		for(int i=0;i<iller.size();i++){
			_v.add(new Item(iller.get(i).il_, iller.get(i).il));
		}
		return _v;
	}

	public Vector<Object> ilcelerVector(int il_){ // vektör: büyütülebilir bir dizi nesne uygular
		ArrayList<Adres> ilceler=new Adres().ilceAra(il_);
		Vector<Object> _v=new Vector<>();
		for(int i=0;i<ilceler.size();i++){
			_v.add(new Item(ilceler.get(i).ilce_, ilceler.get(i).ilce));
		}
		return _v;
	}
	
	public class Item {

	    private int id;
	    private String name;

	    public Item(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() { // Get oku Set yaz
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String toString(){
	        return this.name;
	    }
	}
	
}
