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
        if (year%4==0){
            System.out.println(year+" bir artık yıldır!");
        }else {
            System.out.println(year+" bir artık yıl değildir!");
        }

    }
}