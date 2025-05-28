package odev2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static odev2.Odev2.rezervasyon;
import static odev2.Odev2.ucak;

enum RezervasyonDurum {
    Gerceklestirildi,
    Iptal
}

public class UcusRezarvasyonu {

    private String rezervasyonNo;
    private int ucusNo;
    private UcusKoltugu koltukNo;
    private Yolcu yolcu;
    private RezervasyonDurum durum;

    /*Yolcu tipinde bir array tanımladım.bu getirYolcu methodumda yolcu listemi getiriyor.Bunu da dizimin boyutu kadar
    for ile dönüyor ve bu değeri dizime yazıyor.Bunu sistem yöneticileri rezervasyon yaptırmış kullanıcıları listelemek
    istediğinde kullanıyor*/
    public ArrayList<Yolcu> getirYolcu() {

        ArrayList<Yolcu> yolcu = new ArrayList<Yolcu>();

        for (int i = 0; i < yolcu.size(); i++) {
            System.out.println(yolcu.get(i) + "\n");
        }
        return yolcu;
    }

    /*UcusRezarvasyonu tipinde bir array tanımladım.bu getirRezarvasyonlar methodumda ucus listemi getiriyor.Bunu da dizimin boyutu kadar
    for ile dönüyor ve bu değeri dizime yazıyor.Bu yolcu yani kullanıcı rezervasyonlarını listelemek
    istediğinde kullanıyor*/
    public ArrayList<UcusRezarvasyonu> getirRezarvasyonlar() {

        ArrayList<UcusRezarvasyonu> rezervasyon = new ArrayList<UcusRezarvasyonu>();

        for (int i = 0; i < rezervasyon.size(); i++) {
            System.out.println(rezervasyon.get(i) + "\n");
        }
        return rezervasyon;
    }

    /*yolcu rezervasyon eklemek istediğinde bu methodu kullanıcaz.rezervasyon için gerekli bilgiler kullanıcıdan alınıyor
    ve rezervasyonlar.txt dosyama yazılıyor*/
    public boolean ekleRezervasyon() {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + "Rezervasyonlar.txt", true);

            Scanner sn = new Scanner(System.in);
            for (int i = 0; i < rezervasyon.size(); i++) {
                System.out.println("eklemek rezervasyon bilgilerini  birer boşlukla sırası ile giriniz."
                        + "(yolcu no-tc-isim/soyisim-rezervasyon no-ucuç saati-kalkiş havalimani-variş havalimani-ucus no-koltuk no-"
                        + "yolcu sınıfı(economy,business)-ucret-durum) ");
                int yolcuNo = sn.nextInt();
                int kisiTc = sn.nextInt();
                String adSoyad = sn.nextLine();
                String rezervasyonNo = sn.nextLine();
                String kalkisHavalimani = sn.nextLine();
                String varisHavalimani = sn.nextLine();
                String sinif = sn.nextLine();
                int ucusNo = sn.nextInt();
                int koltukNo = sn.nextInt();
                int ucret = sn.nextInt();
                String pasaportNo = sn.nextLine();
                int kalkisaat = sn.nextInt();
                writer.write(rezervasyon.get(i) + "\n");

            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    /*guncelleRezervasyonDurum methodunu yolcu yaptığı rezervasyon hakkında değişiklik yapmak istediğinde kullanıyor.
   bunun için ilk yolcuya rezervasyon yapmak mı istiyor yoksa iptal mi etmek istiyor onu soruyoruz.eğer rezervasyon
    iptal etmek istiyorsa enum clasımdan ıptali çağırıyorum.rezervasyon yapmak istiyorsa da enum classdan gerçekleştirildi
    çağrıyorum.*/
    public boolean guncelleRezervasyonDurum() {
        Scanner sn = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + "Rezervasyonlar.txt", true);

            for (int i = 0; i < rezervasyon.size(); i++) {

                System.out.println("güncellemek istediğiniz rezervasyon numrasını giriniz:");
                String rezervasyonno = sn.nextLine();
                System.out.println("hangi işlemi yapmak istediğinizi seçiniz:(1-İPTAL,2-GERÇEKLEŞTİRİLDİ)");
                String islem = sn.nextLine();
                if (islem.equals("1")) {

                    RezervasyonDurum Iptal = RezervasyonDurum.Iptal;

                } else if (islem.equals("2")) {
                    RezervasyonDurum Gerceklestirildi = RezervasyonDurum.Gerceklestirildi;
                }

                writer.write(rezervasyon.get(i) + "\n");
            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

    public int getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(int ucusNo) {
        this.ucusNo = ucusNo;
    }

    public UcusKoltugu getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(UcusKoltugu koltukNo) {
        this.koltukNo = koltukNo;
    }

    public Yolcu getYolcu() {
        return yolcu;
    }

    public void setYolcu(Yolcu yolcu) {
        this.yolcu = yolcu;
    }

    public RezervasyonDurum getDurum() {
        return durum;
    }

    public void setDurum(RezervasyonDurum durum) {
        this.durum = durum;
    }

}
