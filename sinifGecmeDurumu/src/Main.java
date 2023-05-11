import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik,toplam=0,dersSayisi=0;
        double result;
        System.out.print("Matemaik notunuzu giriniz: ");
        matematik=input.nextInt();
        if (0<=matematik && matematik<=100){
            toplam+=matematik;
            dersSayisi+=1;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        if (0<=fizik && fizik<=100){
            toplam+=fizik;
            dersSayisi+=1;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        if (0<=turkce && turkce<=100){
            toplam+=turkce;
            dersSayisi+=1;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        if (0<=kimya && kimya<=100){
            toplam+=kimya;
            dersSayisi+=1;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();
        if (0<=muzik && muzik<=100){
            toplam+=muzik;
            dersSayisi+=1;
        }
        result = toplam/dersSayisi;
        if(result<=55){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere!");
        }else {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Not ortalamanız: "+result);

    }
}