/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Sultannur
 */
public class Calisan {//Suoerclass veya Baseclass
    
    private String isim;
    private int maas;
    private String department;
    
    public Calisan(String isim,int maas,String department){
    
        
        this.isim=isim;
        this.maas=maas;
        this.department=department;
    
    }
    
    public void Calis(){
    
        System.out.println("Çalişan öalışıyor...");
    
    }
    
    
    public void BilgileriGoster(){
    
        System.out.println("İsim:"+isim);
        System.out.println("Maas:"+maas);
        System.out.println("Departman:"+department);
    
    
    }
    
    
    public void DepartmenDegistir(String yeni_departman){
        
        System.out.println("Departman değiştiriliyor....");
        this.setDepartment(yeni_departman);
        System.out.println("Yeni department:"+getDepartment());
    
    
    
    
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    
}
