import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number,total=0,piece=0;
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        /* girilen sayıya kadar olan çift sayıları bulan program
        for(int i=0;i<number;i+=2){
            System.out.print(i+" ");
        }*/
        // girilen sayıya kadar 3 ve 4 ün katı olan sayıların  ortalaması
        for(int i=12;i<number;i+=12){
            System.out.print(i+" ");
            total+=i;
            piece+=1;
        }
        System.out.println();
        System.out.println("Ortalama= "+(total/piece));
    }
}