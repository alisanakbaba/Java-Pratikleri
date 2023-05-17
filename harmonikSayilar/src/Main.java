import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // input nesnesini tanimladik
        int n;
        double total=0.0;                        // değişkenleri atadık
        System.out.print("Lütfen sayı giriniz: ");     // girdileri kullanıcıdan istedik
        n = input.nextInt();
        for(int i=1;i<=n;i++){                            // n e kadar toplaması için döngüye soktuk
            total+=(1/i);    // total+=(1/(double)i); üstte total i 0.0 yerine 0 olarak atasaydık böyle bölmemiz gerekirdi
        }
        System.out.println("Sonuç: "+total);                  // sonuç
    }
}