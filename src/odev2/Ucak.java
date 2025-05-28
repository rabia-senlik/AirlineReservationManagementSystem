package odev2;
/*ucaklar için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.
  */ 
public class Ucak {

    private String tip;
    private int kapasite;
    private int uretimYili;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

}
