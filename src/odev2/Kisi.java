
package odev2;
import java.util.Date;
/*kişiler  için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.
  */ 
public class Kisi {
    private String kisiTC;
    private String adSoyad;
    private String adres;
    private Date dogumTarihi;
    private String katagori;
    
    public String getKisiTC() {
        return kisiTC;
    }

    public void setKisiTC(String kisiTC) {
        this.kisiTC = kisiTC;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getKatagori() {
        return katagori;
    }

    public void setKatagori(String katagori) {
        this.katagori = katagori;
    }
    
    
}
