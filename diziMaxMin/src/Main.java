import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("değeri giriniz: ");
        int deger = input.nextInt();
        System.out.print("Kaç elemanlı olsun: ");
        int elemanSayisi = input.nextInt();
        int[] dizi = new int[elemanSayisi];
        System.out.print("Dizinin ilk elemanını giriniz: ");
        dizi[0]=input.nextInt();
        int min=Math.abs(dizi[0]-deger),maks =Math.abs(dizi[0]-deger);
        for(int i=1;i<dizi.length;i++){
            System.out.print("Eleman girin: ");
            dizi[i]=input.nextInt();
            int kosul = Math.abs(dizi[i]-deger);
            if (kosul>maks){
                maks = kosul;
            }
            if (kosul<min){
                min=kosul;
            }
        }
        System.out.println(Arrays.toString(dizi));
        System.out.print("Maks: "+maks+" min: "+min);
        /* Dizideki maks ve min değeri bulma
        int maks=dizi[0],min=dizi[0];
        for (int i=1;i<dizi.length;i++){
            if(dizi[i]>maks){
                maks = dizi[i];
            } else if (dizi[i]<min) {
                min = dizi[i];
            }
        }
        System.out.println("Maksimum Değer: "+maks);
        System.out.println("Minimum değer: "+min);
        */

        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

    }
}