import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int us,taban;  // değişkenleri tanımladık

        System.out.print("Taban değeri giriniz: "); // kullanıcı değerleri girdi
        taban=input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        us=input.nextInt();
        System.out.println("Result: "+power(taban,us)); // fonksiyonu çağırdık ve sonucu yazdırdık
    }
    static int power(int taban,int us){
        if(us==1){                                  //power(taban,1) e gelince değerimizi bul ve tekrar dönerek hesaplasın
            return taban;
        } else if (us==0) {                         // üst 0 ise direkt 1 değerini döndür
            return 1;
        } else{
            return power(taban,us-1)*taban;      // üst değerini 1 azalt ama taban ile çarparak
                                                    // power(4,3)=power(4,2)*4
        }                                           // power(4,2)=power(4,1)*4
    }                                               // power(4,1)=4
}