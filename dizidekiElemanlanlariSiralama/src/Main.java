import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void sort(int[] dizi){
        int tmp;
        for(int i=0;i<dizi.length-1;i++){
            for(int j=0;j<(dizi.length-1-i);j++){
                if (dizi[j]>dizi[j+1]){
                    tmp=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements;
        int[] list;

        System.out.print("Dizinin boyutu: ");
        numberOfElements=input.nextInt();
        list=new int[numberOfElements];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i=0;i<list.length;i++){
            System.out.print(i+". Elemanı : ");
            list[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(list));

        sort(list);
        System.out.println(Arrays.toString(list));
    }
}