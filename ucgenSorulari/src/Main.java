import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girdi almak icin Scanner Sinifindan nesne uretiyoruz
        Scanner input = new Scanner(System.in);
        // hipotenusu bulan program
        // degiskenleri tanimliyoruz
        int kenar1,kenar2;
        double hipotenus;
        System.out.println("Soru1 ****--------------->");
        System.out.print("kenar1 i giriniz: ");
        kenar1 =input.nextInt();
        System.out.print("kenar2 yi giriniz: ");
        kenar2=input.nextInt();
        // hipotenusu bulan matematiksel ifadeyi uyguluyoruz
        hipotenus=Math.pow((kenar1*kenar1+kenar2*kenar2),0.5);
        // sonuc
        System.out.println("hipotenus: "+hipotenus);
        // uc kenari verildiginde alani bulan program
        //formul : Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        // degiskenleri tanimliyoruz
        int edge1, edge2,edge3,sum;
        double u,alan;
        // girdileri aliyoruz
        System.out.println("Soru2 ****--------------->");
        System.out.print("edge1 i giriniz: ");
        edge1=input.nextInt();
        System.out.print("edge2 yi giriniz: ");
        edge2=input.nextInt();
        System.out.print("edge3 u giriniz: ");
        edge3=input.nextInt();
        // alani bulmak icin gerekli matematiksel islemleri yapiyoruz
        sum = edge1+edge2+edge3;
        u = sum/2.0;
        System.out.println("u: "+u);
        alan = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
        //sonuc
        System.out.print("alan: "+alan);


    }
}