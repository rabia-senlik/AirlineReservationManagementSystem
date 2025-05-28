package odev2;

/*uçuşlar  için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.Daha sonra ucusDurum tarzında enum bir class tanımladım
sabit değerleri tutmak için.
  */ 

enum UcusDurum {
    Planlandi,
    Ertelendi,
    Ayrildi,
    Tamamlandi,
    Iptal
}

public class Ucus {

    private int ucusNo;
    private Havalimani kalkis;
    private Havalimani varis;
    private Ucak ucus;
    private Datetime kalkisSaat;
    private Datetime varisSaat;
    private UcusDurum durum;
    private float sure;

    public int getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(int ucusNo) {
        this.ucusNo = ucusNo;
    }

    public Havalimani getKalkis() {
        return kalkis;
    }

    public void setKalkis(Havalimani kalkis) {
        this.kalkis = kalkis;
    }

    public Havalimani getVaris() {
        return varis;
    }

    public void setVaris(Havalimani varis) {
        this.varis = varis;
    }

    public Ucak getUcus() {
        return ucus;
    }

    public void setUcus(Ucak ucus) {
        this.ucus = ucus;
    }

    public Datetime getKalkisSaat() {
        return kalkisSaat;
    }

    public void setKalkisSaat(Datetime kalkisSaat) {
        this.kalkisSaat = kalkisSaat;
    }

    public Datetime getVarisSaat() {
        return varisSaat;
    }

    public void setVarisSaat(Datetime varisSaat) {
        this.varisSaat = varisSaat;
    }

    public UcusDurum getDurum() {
        return durum;
    }

    public void setDurum(UcusDurum durum) {
        this.durum = durum;
    }

    public float getSure() {
        return sure;
    }

    public void setSure(float sure) {
        this.sure = sure;
    }

    private static class Datetime {

        public Datetime() {
        }
    }

}
