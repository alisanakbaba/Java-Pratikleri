import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input nesnemizi kullanıcıdan girdi almak için kullanacağız
        Scanner input = new Scanner(System.in);
        // kullanacağımız değişkenleri tanımladık
        int birthYear;
        boolean isError=false;
        String cinZodyagiBurcu="";
        // kullanıcıdan  doğduğu yılı girmesini istedik
        System.out.print("Doğum yılınızı giriniz : ");
        birthYear=input.nextInt();
        // doğduğu yılın 12 ile moduna bakıyoruz
        int hesap = birthYear%12;
        // burç bulma işlemimize başlıyoruz
        switch (hesap){
            case 0:
                cinZodyagiBurcu="Maymun";
                break;
            case 1:
                cinZodyagiBurcu="Horoz";
                break;
            case 2:
                cinZodyagiBurcu="Köpek";
                break;
            case 3:
                cinZodyagiBurcu="Domuz";
                break;
            case 4:
                cinZodyagiBurcu="Fare";
                break;
            case 5:
                cinZodyagiBurcu="Öküz";
                break;
            case 6:
                cinZodyagiBurcu="Kaplan";
                break;
            case 7:
                cinZodyagiBurcu="Tavşan";
                break;
            case 8:
                cinZodyagiBurcu="Ejderha";
                break;
            case 9:
                cinZodyagiBurcu="Yılan";
                break;
            case 10:
                cinZodyagiBurcu="At";
                break;
            case 11:
                cinZodyagiBurcu="Koyun";
                break;
            default:
                isError = true; // hata buldum diye işaretlesin
                System.out.println("Hesaplama yapılamadı lütfen tekrar deneyiniz!");
        }
        if(!isError){ // işlemlerimiz sırasında hata yoksa sonucu yazdır
            System.out.println("Çin Zodyağı Burcunuz : "+cinZodyagiBurcu);
        }
    }
}