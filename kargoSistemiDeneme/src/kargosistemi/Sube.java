package kargosistemi;

import java.util.ArrayList;
import java.util.Vector;




public class Sube {
	
	public int sube_;
	public String subeAdi;
	public Adres _adres;
	public int subeTip;
	
	
	public boolean subeEkle(Sube _s) {
		int ads_;
		if( (ads_=new Adres().adresEkle(_s._adres)) > 0){
			_s._adres.adres_=ads_;
			if(new Sube().subeEkle(_s)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
	
	public boolean subeGuncelle(Sube _s) {
		return new Sube().subeGuncelle(_s);
	}
	
	public boolean subeSil(int id) {
		return new Sube().subeSil(id);
	}
	
	public Sube subeBilgisi(int id){
		return new Sube().subeBilgisi(id);
	}
	
	public ArrayList<Sube> subeAra(Sube _s) {
		return new Sube().subeAra(_s);
	}
	
	public Vector<Object> subelerVector(){
		
		ArrayList<Sube> subeler=new Sube().Listele();
		Vector<Object> _v=new Vector<>();
		for(int i=0;i<subeler.size();i++){
			_v.add(new Item(subeler.get(i).sube_, subeler.get(i).subeAdi));
		}
		return _v;
	}

	private ArrayList<Sube> Listele() {
		
		return null;
	}

	public Vector<Object> subeVector(int id){
		Sube sube=new Sube().subeBilgisi(id);
		Vector<Object> _v=new Vector<>();
		_v.add(new Item(sube.sube_, sube.subeAdi));
		
		return _v;
	}
	
	public class Item {

	    private int id;
	    private String name;

	    public Item(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
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