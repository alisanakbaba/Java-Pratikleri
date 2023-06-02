import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi;
        int elemanSayisi;
        double ortalama,total,gTotal=0;
        System.out.print("dizi kaç elemanlı olsun: ");
        elemanSayisi = input.nextInt();
        dizi = new int[elemanSayisi];
        for(int i=0;i<dizi.length;i++){
            System.out.print("Eleman giriniz: ");
            dizi[i]=input.nextInt();
            total=0;
            for(int j=1;j<=dizi[i];j++){
                total+=1.0/j;
            }
            gTotal+=total;
        }
        System.out.println("Harmonik Ortalama: "+(elemanSayisi/gTotal));
        //ortalama = total/elemanSayisi;
        //System.out.println("Ortalama= "+ortalama);
        //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    }
}