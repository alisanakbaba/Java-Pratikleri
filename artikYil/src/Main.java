import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // degiskenimizi tanımladık
        int year;
        System.out.print("Yıl Giriniz : ");
        // kullanıcıdan değer aldık
        year=input.nextInt();
        // artık yıl mı değil mi diye sorguladık ve sonucu yazdırdık
        if(year%100==0){ // sayı 100 ün katı ise 400 e kalansız bölünmesi lazım artık yıl olması için
            if(year%400==0){
                System.out.println(year+" bir artık yıldır!");
            }else {
                System.out.println(year+" bir artık yıl değildir!");
            }
        }
        else if (year%4==0){ // sayı 100 ün katı değilse ve 4 e kalansız bölünüyorsa artık yıldır
            System.out.println(year+" bir artık yıldır!");
        }else { // üstteki şartları sağlamıyorsa artık yıl değildir
            System.out.println(year+" bir artık yıl değildir!");
        }

    }
}