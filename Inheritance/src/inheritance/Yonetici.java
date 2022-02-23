/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Sultannur
 */
public class Yonetici extends Calisan{//Subclass
    
   private int sorumlu_kisi; 
    
    public Yonetici(String isim,int maas,String department,int sorumlu_kisi){
       
        super(isim, maas, department);
        this.sorumlu_kisi=sorumlu_kisi;
    
    }
    
    public void ZamYap(int zam_miktari){
    
        System.out.println("Çalişanlara "+zam_miktari+" zam yapıldı...");
    
    }
    public void BilgileriGoster(){
    
    
        /*System.out.println("İsim:"+getIsim());
        System.out.println("Maas:"+getMaas());
        System.out.println("Departman:"+getDepartment());*/
        super.BilgileriGoster();
        System.out.println("Sorumlu kişi Sayısı:"+sorumlu_kisi);
    
    }
}
