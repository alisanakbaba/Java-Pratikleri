import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // girdi almak icin input nesnesini kullanacagiz
        Scanner input = new Scanner(System.in);
        // degiskenleri tanimladik
        int kilo;
        double boy,result;
        // kullacidan girdileri aldik
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = input.nextInt();
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        // vucut kitle indeksini hesaplayan formul
        result = kilo/(boy*boy);
        //sonuc bolumu
        System.out.println("Vucut kitle indeksiniz: "+result);

    }
}