import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,ebob=1,ekok=1,sayac=2;

        System.out.print("ilk sayıyı giriniz: ");
        sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2=input.nextInt();

        while((sayi1>1)||(sayi2>1)){
            if((sayi1%sayac==0)&&(sayi2%sayac==0)){
                ebob*=sayac;
                ekok*=sayac;
                sayi1/=sayac;
                sayi2/=sayac;
            }else if(sayi1%sayac==0){
                ekok*=sayac;
                sayi1/=sayac;
            }else if(sayi2%sayac==0){
                ekok*=sayac;
                sayi2/=sayac;
            }else{
                sayac+=1;
            }
        }
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);
    }
}