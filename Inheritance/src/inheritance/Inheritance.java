/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Sultannur
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IS A İLİŞKİSİ->ınheritance
        
        
        Yonetici yonetici1=new Yonetici("Mehmet",10000,"Bilgisayar Mühendisliği",10);
        yonetici1.BilgileriGoster();
        yonetici1.ZamYap(200);
    }
    
}
