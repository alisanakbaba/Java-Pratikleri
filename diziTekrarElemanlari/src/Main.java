import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean isFind(int[] dizi,int deger){
        for(int i : dizi){
            if(i==deger){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // dizide tekrar eden çift sayıları bulan program
        Scanner input = new Scanner(System.in);
        int elemanSayisi,index=0;
        int[] dizi,duplicate;
        System.out.print("Dizi kaç elemanlı olsun: ");
        elemanSayisi=input.nextInt();
        dizi = new int[elemanSayisi];
        for(int i=0;i<dizi.length;i++){
            System.out.print("sayı giriniz: ");
            dizi[i]=input.nextInt();
        }
        duplicate = new int[dizi.length];
        for (int i=0;i<dizi.length;i++){
            for(int j=i+1;j<dizi.length;j++){
                if((dizi[i]==dizi[j])&&(dizi[i]%2==0)){
                    if(!isFind(duplicate,dizi[i])){
                        duplicate[index++]=dizi[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(duplicate));

    }
}