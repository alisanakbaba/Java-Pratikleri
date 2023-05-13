import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total=0;
        /* kullanıcı negatif sayı girene kadar girilen tek sayıları toplayan program
        do{
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if (number%2==1){
                total+= number;
            }
        }while(number>=0);
        */
        // kullanıcı tek sayı girene kadar kabul eden çift ve 4ün katlarını toplayan program
        do{
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if (number%4==0){
                total+= number;
            }
        }while((number%2==0));

        System.out.println("4'ün katı olan sayılar toplamı: "+total);
    }
}