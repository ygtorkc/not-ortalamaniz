package notlar;

import java.util.Scanner;

public class Dersler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, tarih, turkce, muzik;
        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        int sonuc = mat + fizik + kimya + tarih + turkce + muzik;
        double ortalama = sonuc / 6;

        System.out.println("Ortalamanız:" + ortalama);
        if (mat > 100) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (fizik > 100) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (tarih > 100) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (turkce > 100) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (muzik > 100) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (kimya > 100) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (mat <= 0) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (fizik <= 0) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (kimya <= 0) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (turkce <= 0) {
            System.out.println("0-100 arası değerler giriniz.(100dahil)");
        }
        if (tarih <= 0) {
            System.out.println("Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (muzik <= 0) {
            System.out.println(" Hata 0-100 arası değerler giriniz.(100dahil)");
        }
        if (ortalama < 55) {
            System.out.println("Seneye tekrar okuyacaksın");
        }



    }
}
