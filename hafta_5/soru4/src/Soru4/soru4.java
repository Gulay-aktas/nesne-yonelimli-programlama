package Soru4;
import java.util.Scanner;

public class soru4{
      
      
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Birinci rakamý giriniz");
		int sayi1=input.nextInt();
		
		
		if(sayi1>10) {
			System.out.println("Geçersiz rakam  girdiniz:" + sayi1);
			System.out.println(" rakam giriniz");
			return;	
		}
		else {
			for(int i=1;i<100; i++) {
				if(i%sayi1==0) {
					System.out.print(i+ " ");
				}
					
			}
			System.out.println("\n ikinci rakamý giriniz");
			int sayi2=input.nextInt();
			for(int i=1;i<100; i++) {
				if(i%sayi2==0) {
					System.out.print(i +" ");
				}
				
			    	
				
		}       
		   
		
		class IkiSayýyýCarp{
				
				 void carp(int sayi1,int sayi2) {
					 int carp = sayi1*sayi2;
				 
				    
				    }	
				 	
				
	}
		System.out.println(" iKÝ SAYIYI CARP");
		
		
	}
		
}
}
			
				
				
			
			
			
			
		
		
		
		
			
		
		
	

    
