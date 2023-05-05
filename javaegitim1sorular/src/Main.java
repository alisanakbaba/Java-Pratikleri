import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner Sinifini kullanicidan veri almak icin tanimladik
        Scanner input = new Scanner(System.in);
        // Degiskenler tanimlaniyor ve kullanicidan aliniyor
        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        int muzik = input.nextInt();
        // ilk basta int matematik,tarih,kimya,fizik,turkce,muzik; seklinde veri tipini de belirtip isteyebiliriz
        double result = (kimya+matematik+fizik+turkce+tarih+muzik)/6.0;
        // bolme islemi yapacagimiz icin double veri tipini kullanmak daha mantikli
        System.out.println("Not Ortalamaniz: "+result);
        String sonuc = result>60 ? "Geçti":"Kaldi";
        System.out.print("Sonuc: "+sonuc);
    }
}