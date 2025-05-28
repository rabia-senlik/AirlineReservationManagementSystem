package odev2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import static odev2.Odev2.havalimani;
import static odev2.Odev2.havayolu;
import static odev2.Odev2.rezervasyon;
import static odev2.Odev2.ucak;
import static odev2.Odev2.ucus;

public class Yonetici extends Kisi {

    private String departman;

    /*Ucak tipinde bir array tanımladım.bu getirUcak methodumda ucak listemi getiriyor.Bunu da dizimin boyutu kadar
    for ile dönüyor ve bu değeri dizime yazıyor.Bu methodu sistem yöneticisi ucakları listelemek
    istediğinde kullanıyor*/
    public ArrayList<Ucak> getirUcak() {
        ArrayList<Ucak> ucak = new ArrayList<Ucak>();
        for (int i = 0; i < ucak.size(); i++) {
            System.out.println(ucak.get(i) + "\n");
        }
        return ucak;

    }

    /*Ucus tipinde bir array tanımladım.bu getirUcus methodumda ucus listemi getiriyor.Bunu da dizimin boyutu kadar
    for ile dönüyor ve bu değeri dizime yazıyor.Bu methodu sistem yöneticisi ucuşları listelemek
    istediğinde kullanıyor*/
    public ArrayList<Ucus> getirUcus() {
        ArrayList<Ucus> ucus = new ArrayList<Ucus>();
        for (int i = 0; i < ucus.size(); i++) {
            System.out.println(ucus.get(i) + "\n");
        }
        return ucus;

    }

    /*havalimani tipinde bir array tanımladım.bu getirHavalimani methodumda havalimanlarımın listesini getiriyor.
    Bunu da dizimin boyutu kadar  for ile dönüyor ve bu değeri dizime yazıyor.Bu methodu sistem yöneticisi
    havalimanlarını listelemek istediğinde kullanıyor*/
    public ArrayList<Havalimani> getirHavalimani() {

        ArrayList<Havalimani> havalimani1 = new ArrayList<Havalimani>();
        for (int i = 0; i < havalimani1.size(); i++) {
            System.out.println(havalimani1.get(i) + "\n");
        }
        return havalimani1;

    }

    /*HavayoluSirketi tipinde bir array tanımladım.bu getirHavayoluSirketi methodumda havayolu şirketlerimin
    listesini getiriyor.Bunu da dizimin boyutu kadar  for ile dönüyor ve bu değeri dizime yazıyor.
    Bu methodu sistem yöneticisi havayolu şirketlrini listelemek istediğinde kullanıyor*/
    public ArrayList<HavayoluSirketi> getirHavayoluSirketi() {

        ArrayList<HavayoluSirketi> havayolu = new ArrayList<HavayoluSirketi>();
        for (int i = 0; i < havayolu.size(); i++) {
            System.out.println(havayolu.get(i) + "\n");
        }
        return havayolu;

    }

    /*ekleUcak methodunu sistem yönetici uçak eklemek istedğinde kullanıyor.bunun için ilk önce yöneticiden eklemek istediği
    uçak bilgierini alıyorum ve daha sonra bunu var olan ucaklar.txt dosyama yazıyorum.*/
    public boolean ekleUcak() {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + "Ucaklar.txt", true);

            Scanner sn = new Scanner(System.in);
            for (int i = 0; i < ucak.size(); i++) {
                System.out.println("eklemek istediğiniz uçak bilgilerini birer boşlukla sırası ile giriniz. (TİP-KAPASİTE-ÜRETİM YILI) ");
                String tip = sn.nextLine();
                int kapasite = sn.nextInt();
                int uretimYili = sn.nextInt();
                writer.write(ucak.get(i) + "\n");

            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;

    }

    /*ekleUcus methodunu sistem yöneticisi uçuş eklemek istedğinde kullanıyor.bunun için ilk önce yöneticiden eklemek istediği
    uçuş  bilgierini sırasıyla alıyorum ve daha sonra bunu var olan ucuslar.txt dosyama yazıyorum.*/
    public boolean ekleUcus() {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + "Ucuslar.txt", true);
            Scanner sn = new Scanner(System.in);
            for (int i = 0; i < ucus.size(); i++) {
                System.out.println("eklemek istediğiniz uçuş bilgilerini birer boşlukla sırası ile giriniz."
                        + "(UÇUŞ NUMARASI-KALKIŞ HAVALİMANI-VARIŞ HAVALİMANİ-UÇAK SEÇİMİ-UÇUŞ SÜRESİ-UÇUŞ GÜNÜ-UÇUŞ SAATİ-DURUM BİLGİSİ) ");
                int ucusNo = sn.nextInt();
                String kalkis = sn.nextLine();
                String varis = sn.nextLine();
                String ucak = sn.nextLine();
                int saat = sn.nextInt();
                int dk = sn.nextInt();
                LocalDateTime kalkisSaat = LocalDateTime.of(2022, 12, 12, saat, dk);
                int vsaat = sn.nextInt();
                int vdk = sn.nextInt();
                LocalDateTime varisSaat = LocalDateTime.of(2022, 12, 13, vsaat, vdk);

                String durum = sn.nextLine();
                float sure = sn.nextFloat();
                writer.write(ucus.get(i) + "\n");
            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    /*eklehavalimani methodunu sistem yöneticisi havalimani eklemek istedğinde kullanıyor.bunun için ilk önce yöneticiden eklemek istediği
    havalimani bilgierini alıyorum ve daha sonra bunu var olan havalimanlari.txt dosyama yazıyorum.*/
    public void ekleHavalimani() {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + "Havalimanlari.txt", true);

            Scanner sn = new Scanner(System.in);
            for (int i = 0; i < havalimani.size(); i++) {
                System.out.println("eklemek istediğiniz havalimani bilgilerini birer boşlukla sırası ile giriniz."
                        + " (HAVALİMANİ NUMARASI-HAVALİMANİ ADI-KOD-ULKE-ŞEHİR) ");
                String havalimaniAdi = sn.nextLine();
                int havalimaniNo = sn.nextInt();
                String kod = sn.nextLine();
                String ulke = sn.nextLine();
                String sehir = sn.nextLine();
                writer.write(havalimani.get(i) + "\n");
            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*ekleHavayoluSirketi methodunu sistem yöneticisi havayolu şirketi eklemek istedğinde kullanıyor.bunun için ilk önce yöneticiden eklemek istediği
    havayolu şirketi için gerekli bilgierini alıyorum ve daha sonra bunu var olan havayoluSirketleri.txt dosyama yazıyorum.*/
    public void ekleHavayoluSirketi() {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + "HavayoluSirketleri.txt", true);

            Scanner sn = new Scanner(System.in);
            for (int i = 0; i < havayolu.size(); i++) {
                System.out.println("eklemek istediğiniz havayolu şirketi bilgilerini birer boşlukla sırası ile giriniz."
                        + "(HAVAYOLU ŞİRKETİ ADI-KOD) ");

                String HavayoluSirketi = sn.nextLine();
                int kod = sn.nextInt();
                 writer.write(havayolu.get(i) + "\n");
            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
