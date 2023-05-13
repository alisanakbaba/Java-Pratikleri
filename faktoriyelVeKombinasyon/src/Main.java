import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int faktN=1,faktR=1,fakt=1,n,r;   // Değişkenler tanımlandı
        double C;
        System.out.print("N sayısını giriniz: ");  // kullanıcıdan değer girmesini istedik
        n = input.nextInt();
        for(int i=n;i>0;i--){    // N nin faktöriyelini hesapladık
            faktN*=i;
        }

        System.out.print("R sayısını giriniz: ");
        r = input.nextInt();
        for(int j=r;j>0;j--){    // r nin faktöriyelini hesapladık
            faktR*=j;
        }

        for(int k=n-r;k>0;k--){    // n-r nin faktöriyelini hesapladık
            fakt*=k;
        }

        C = (double)faktN/(faktR*fakt);    // kombinasyon hesaplama ---> C(n,r) = n! / (r! * (n-r)!)
        System.out.println("C= "+C);
    }
}