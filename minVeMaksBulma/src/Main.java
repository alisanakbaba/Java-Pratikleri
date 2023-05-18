import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın

        Scanner input = new Scanner(System.in); // kullanıcıdan değer almak için input nesnemizi oluşturduk
        int N,minimum,maksimum,number;   // değişkenler tanımlandı

        System.out.print("N sayısını giriniz: ");    // kullanıcıdan değerler alınmaya başladı
        N = input.nextInt();
        System.out.print("lütfen sayı giriniz: ");
        number = input.nextInt();                   // minimum ve maksimum değeri ilk başta bir değere eşitlemek gerekiyor
        minimum=number ; maksimum=number;           // bu nedenle döngüden önce bir  sayı aldık ve değerlerimizi bu sayıya eşitledik
        do{
            System.out.print("Lütfen sayı giriniz: ");
            number=input.nextInt();
            if(number<minimum){     // girilen sayı minimum değerimizden küçük ise yeni min değer olarak ata
                minimum = number;
            } else if (number>maksimum) {   // girilen sayı maksimum değerimizden büyük ise yeni maks olarak ata
                maksimum = number;
            }
            N--;    // sayı girdikçe N değerini azalt
        }while(N-1>0);   // döngüden önce bir değer girdiğimiz için bir eksik olacak şekilde döndür
        System.out.println("Minimum Değer : "+minimum);
        System.out.println("Maksimum Değer : "+maksimum);
    }
}