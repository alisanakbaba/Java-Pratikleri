import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 345 = 3**3 + 4**3 + 5**3 == 345 ise armstrong sayi (üs, basamak sayısına eşit)
        Scanner input = new Scanner(System.in);
        int number1,number2,number3,us=0,total1=0,total2=0; // degiskenler tanımlandı
        System.out.print("Sayıyı giriniz: "); // degerler alindi
        number1=input.nextInt();
        number2=number1;
        number3=number1;
        while(number1>0){   // basamak sayisini us  ve basamak toplamini total2 degiskeni ile tuttuk
            total2+=number1%10;
            number1/=10;  // sayiyi 10 a bolerek basamaklarini sildik int deger oldugu icin virgul sonrasini tutmaz
            us+=1;
        }
        System.out.println("Basamak sayısı: "+us);
        while(number2>0){
            total1+=Math.pow(number2%10,us);  // armstrong hesabini yaptik
            number2/=10;
        }
        System.out.println("total: "+total1);
        if(number3==total1){    // armstrong mu degil mi diye kontrol ettik
            System.out.println("Armstrong Sayı");
        }else{
            System.out.println("Armstrong Sayı değil!");
        }
        // basamak sayılarının toplamını bulma
        System.out.println("Basamak Sayıları Toplamı: "+total2); // basamak toplamini ekrana yazdirdik
    }
}