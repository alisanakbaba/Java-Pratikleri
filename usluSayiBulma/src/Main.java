import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int us,taban,total=1;   //   Değişkenler tanımlandı

        System.out.print("Taban: ");  // kullanıcından değerleri aldık
        taban = input.nextInt();
        System.out.print("üs: ");
        us = input.nextInt();

        for(int i=us;i>0;i--){    // üslü sayının sonucunu hesapladık
            total*=taban;
        }
        System.out.println("result: "+total);
    }
}