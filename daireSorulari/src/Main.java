import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input nesnemizi olusturduk girdiler almak icin
        Scanner input = new Scanner(System.in);
        // degiskenleri tanimladik
        int r,a;  // a = merkez aci olcusu
        double pi=3.14,cevre,alan,result;
        //kullanicidan girdi istedik
        System.out.print("kenari giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez aci olcusunu giriniz: ");
        a = input.nextInt();
        // formuller kullanildi
        cevre = 2*pi*r;
        alan = pi*(r*r);
        result = (pi*(r*r)*a)/360; //daire diliminin alanini bulan formul
        // sonuc
        System.out.println("cevre: "+cevre);
        System.out.println("alan: "+alan);
        System.out.println("Daire diliminin alani: "+result);
    }
}