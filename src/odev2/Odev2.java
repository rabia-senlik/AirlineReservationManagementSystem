package odev2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Odev2 {

    public static ArrayList<UcusRezarvasyonu> rezervasyon;
    public static ArrayList<Yolcu> yolcu;
    public static ArrayList<Ucak> ucak;
    public static ArrayList<Ucus> ucus;
    public static ArrayList<Havalimani> havalimani;
    public static ArrayList<HavayoluSirketi> havayolu;

    public static void main(String[] args) throws IOException, ParseException {
        //init();
        //upgradeLists();
        Scanner sn = new Scanner(System.in);
        System.out.println("yolcu girişi için 1'e sistem yöneticisi girişi için 2 'ye bas:");
        int giris = sn.nextInt();
        Yonetici yonetici = new Yonetici();
        UcusRezarvasyonu rezervasyon = new UcusRezarvasyonu();
        if (giris == 1) {
            System.out.println("yolcu sistemine hoşgeldiniz..yapmak istediğiniz işlemi seçiniz:");
            String islemler = "1-uçuş araması\n"
                    + "2-rezervasyon yapma\n"
                    + "3-rezervasyon iptal\n"
                    + "Çıkış için q'ya basın";
            System.out.println("**************");
            System.out.println(islemler);
            System.out.println("*****************");
            while (true) {
                System.out.print("İşlemi Seçiniz : ");
                String islem = sn.nextLine();

                if (islem.equals("q")) {
                    System.out.println("yolcu  İşlemlerinden Çıkılıyor...");
                    break;
                } else if (islem.equals("1")) {
                    yonetici.getirUcus();
                    break;
                } else if (islem.equals("2")) {
                    rezervasyon.getirRezarvasyonlar();
                    break;
                } else if (islem.equals("3")) {
                    rezervasyon.guncelleRezervasyonDurum();
                    break;
                } 

            }

        } else if (giris == 2) {
            int sistemSifre = 1234;
            System.out.println("yönetici sistemlerine girmek için şifreyi giriniz:");
            int sifre = sn.nextInt();
            if (sistemSifre == sifre) {
                System.out.println("yönetici sistemine hoşgeldiniz..yapmak istediğiniz işlemi seçiniz:");

                String yonetici_islem = "Yönetici İşlemleri\n"
                        + "1. havayolu şirketleri için listeleme ve ekleme\n"
                        + "2. havalimani için listeleme ve ekleme\n"
                        + "3. uçaklar için listeleme ve ekleme\n"
                        + "4. uçuşlar için listeleme ve ekleme\n"
                        + "5. rezervasyon yaptırmış yolcuların bilgilerini listeleme \n"
                        + " Çıkış için q'ya basın";
                System.out.println(yonetici_islem);

                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = sn.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;

                    } else if (y_islem.equals("1")) {
                        System.out.println("havayolu şirketleri için ekleme yapmak istiyorsnız A'ya ,listelemek istiyorsanız B'ye basın..");
                        String giris2 = sn.nextLine();
                        if (giris2.equals("A")) {
                            yonetici.ekleHavayoluSirketi();
                        } else if (giris2.equals("B")) {
                            yonetici.getirHavayoluSirketi();
                        }
                        break;

                    } else if (y_islem.equals("2")) {
                        System.out.println("havalimani için ekleme yapmak istiyorsanız A'ya ,listelemek istiyorsanız B'ye basın..");
                        String giris2 = sn.nextLine();
                        if (giris2.equals("A")) {
                            yonetici.ekleHavalimani();
                        } else if (giris2.equals("B")) {
                            yonetici.getirHavalimani();
                        }
                        break;

                    } else if (y_islem.equals("3")) {
                        System.out.println("uçak eklemek istiyorsnız A'ya ,listelemek istiyorsanız B'ye basın..");
                        String giris2 = sn.nextLine();
                        if (giris2.equals("A")) {
                            yonetici.ekleUcak();
                        } else if (giris2.equals("B")) {
                            yonetici.getirUcak();
                        }
                        break;

                    } else if (y_islem.equals("4")) {
                        System.out.println("uçuş eklemek istiyorsnız A'ya ,listelemek istiyorsanız B'ye basın..");
                        String giris2 = sn.nextLine();
                        if (giris2.equals("A")) {
                            yonetici.ekleUcus();
                        } else if (giris2.equals("B")) {
                            yonetici.getirUcus();
                        }
                        break;

                    } else if (y_islem.equals("5")) {
                        showLists();
                        break;

                    }

                }
            }

        } else {
            System.out.println("yanlış şifre,tekrar deneyiniz..");
        }

    }

    public static void init() {
        rezervasyon = new ArrayList<>();
        yolcu = new ArrayList<>();
        ucak = new ArrayList<>();
        ucus = new ArrayList<>();
        havalimani = new ArrayList<>();
        havayolu = new ArrayList<>();
    }

    public static void upgradeLists() throws IOException {
        //dosya okumaları
        convertTextFileToModelList("Havalimanlari.txt");
        convertTextFileToModelList("HavayoluSirketleri.txt");
        convertTextFileToModelList("Kisiler.txt");
        convertTextFileToModelList("Rezervasyonlar.txt");
        convertTextFileToModelList("Ucaklar.txt");
        convertTextFileToModelList("Ucuslar.txt");
    }

    public static void convertTextFileToModelList(String fileName) throws IOException {
        FileReader reader = null;
//burada sırasıyla tüm txt lerimizi okuyoruz ve dizilerine atıyoruz.
        UcusRezarvasyonu rezervasyon = new UcusRezarvasyonu();
        try {
            reader = new FileReader("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\" + fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String mLine = null;
            if (fileName.equalsIgnoreCase("Havalimanlari.txt")) {
                while ((mLine = bufferedReader.readLine()) != null) {
                    String[] data = mLine.split("\\s+");
                    Havalimani havalimanii = new Havalimani();

                    havalimanii.setHavalimaniAd(data[0]);
                    havalimanii.setUlke(data[1]);
                    havalimanii.setSehir(data[2]);
                    havalimani.add(havalimanii);

                }

            } else if (fileName.equalsIgnoreCase("HavayoluSirketleri.txt")) {
                while ((mLine = bufferedReader.readLine()) != null) {
                    String[] data = mLine.split("\\s+");
                    HavayoluSirketi havayoluSirketi = new HavayoluSirketi();
                    havayoluSirketi.setHavayoluSirketi(data[0]);
                    havayoluSirketi.setKod(Integer.parseInt(data[1]));
                    havayolu.add(havayoluSirketi);

                }
            } else if (fileName.equalsIgnoreCase("Ucaklar.txt")) {
                while ((mLine = bufferedReader.readLine()) != null) {
                    String[] data = mLine.split("\\s+");

                    Ucak ucaklar = new Ucak();
                    ucaklar.setTip(data[0]);
                    ucaklar.setKapasite(Integer.parseInt(data[1]));
                    ucaklar.setUretimYili(Integer.parseInt(data[2]));
                    ucak.add(ucaklar);

                }
            } else if (fileName.equalsIgnoreCase("Ucuslar.txt")) {
                while ((mLine = bufferedReader.readLine()) != null) {
                    String[] data = mLine.split("\\s+");

                    Ucus ucuslar = new Ucus();

                    ucuslar.setUcusNo(Integer.parseInt(data[0]));

                    ucus.add(ucuslar);

                }
            } else if (fileName.equalsIgnoreCase("Kisiler.txt")) {

                while ((mLine = bufferedReader.readLine()) != null) {
                    String[] data = mLine.split("\\s+");

                    Yolcu kisi = new Yolcu();

                    kisi.setKisiTC(data[0]);
                    kisi.setAdSoyad(data[1]);

                    kisi.setDogumTarihi(new SimpleDateFormat("dd/MM/yyyy").parse(data[2]));
                    kisi.setKatagori(data[3]);
                    yolcu.add(kisi);

                }
            }

        } catch (IOException e) {
        } catch (ParseException ex) {
            Logger.getLogger(Odev2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        showLists();
        writeText();

    }

    public static void clearTheFile() throws IOException {//dosyayı temizliyor

        FileWriter fwOb = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\Rezervasyonlar.txt", false);
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }

    public static void writeText() throws IOException {//rezervasyonlar textimize yazdırma methodu
        clearTheFile();//dosyayı temizle
        try {
            FileWriter writer = new FileWriter("C:\\Users\\rabia\\Desktop\\Odev2\\Project\\src\\assets\\Rezervasyonlar.txt", true);

            for (int i = 0; i < rezervasyon.size(); i++) {
                writer.write(rezervasyon.get(i) + "\n");
            }
            writer.close();//dosyayı kapattık

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showLists() {//burda listeleri göster methodumuzu yaptık.

        for (int i = 0; i < rezervasyon.size(); i++) {
            System.out.println(rezervasyon.get(i) + "\n");
        }

    }

    private static Object newSimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
