import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // kullanicidan girdilerimizi almak icin scanner sinifindan input nesnesini uretiyoruz
        Scanner input = new Scanner(System.in);
        // programamizda kullanacagimiz degiskenleri tanimliyoruz
        int ilkFiyat,kdvOrani;//kdv orani 0. bir float cikacagi icin int olarak tanimlarsak 0 yapar ve carpmada kullandigimizda
        float kdvliFiyat,kdvTutari; //her islem sonucunu 0 cikarir kdv tutari ile toplayacagimiz icin sonucta float cikmali
        // girdileri aliyoruz
        System.out.print("ilk fiyatini giriniz: ");
        ilkFiyat=input.nextInt();
        kdvOrani=(ilkFiyat>0)&&(ilkFiyat<1000) ? 18:8;
        System.out.println("Kdv orani: "+kdvOrani);
        kdvTutari=ilkFiyat*kdvOrani/100;
        kdvliFiyat=ilkFiyat+kdvTutari;
        // sonuclari ekrana bastiriyoruz
        System.out.println("Kdv tutari: "+kdvTutari);
        System.out.println("Kdvli Fiyati: "+kdvliFiyat);
    }
}