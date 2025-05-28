
package odev2;
/*koltuklar için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.
  */ 
public class Koltuk {
    private String koltukNo;
    private KoltukSinifi sinif;


    public String getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(String koltukNo) {
        this.koltukNo = koltukNo;
    }

    public KoltukSinifi getSinif() {
        return sinif;
    }

    public void setSinif(KoltukSinifi sinif) {
        this.sinif = sinif;
    }
    
}
