
package odev2;
/*havayolu şirketi  için uml diyagramından gerekli değişkenleri aldım.
ve bu değişkenler için getter setter methodlarımızı tanımladım.
  */ 
public class HavayoluSirketi {
    private String HavayoluSirketi;
    private int kod;

    public String getHavayoluSirketi() {
        return HavayoluSirketi;
    }

    public void setHavayoluSirketi(String HavayoluSirketi) {
        this.HavayoluSirketi = HavayoluSirketi;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }
    
    
}
