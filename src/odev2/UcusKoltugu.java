package odev2;
/*uçuş koltuğu için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.Daha sonra sabir değer olan economy ve 
busines değerlerini enum class ta tanımladım.
  */ 
enum KoltukSinifi {
    Economy,
    Business
}

public class UcusKoltugu extends Koltuk {

    private float ucret;
    private String rezervasyonNo;

    public float getUcret() {
        return ucret;
    }

    public void setUcret(float ucret) {
        this.ucret = ucret;
    }

    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

}
