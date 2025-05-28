
package odev2;
/*yolcu sınıfım  için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.BU sınıfı kisi sınıfından miras aldım.
  */ 

public class Yolcu extends Kisi{
    private int yolcuNo;
    private String pasaportNo;


    public int getYolcuNo() {
        return yolcuNo;
    }

    public void setYolcuNo(int yolcuNo) {
        this.yolcuNo = yolcuNo;
    }

    public String getPasaportNo() {
        return pasaportNo;
    }

    public void setPasaportNo(String pasaportNo) {
        this.pasaportNo = pasaportNo;
    }
    
    
}
