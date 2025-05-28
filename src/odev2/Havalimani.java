
package odev2;
/*havalimaı için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.
  */ 
public class Havalimani {
    private int havalimaniNo;
    private String havalimaniAd;
    private String kod;
    private String ulke;
    private String sehir;
 
    public int getHavalimaniNo() {
        return havalimaniNo;
    }

    public void setHavalimaniNo(int havalimaniNo) {
        this.havalimaniNo = havalimaniNo;
    }

    public String getHavalimaniAd() {
        return havalimaniAd;
    }

    public void setHavalimaniAd(String havalimaniAd) {
        this.havalimaniAd = havalimaniAd;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
    
    
}
