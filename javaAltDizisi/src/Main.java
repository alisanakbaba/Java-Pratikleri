import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dizideki yan yana olan sayılardan oluşan alt kümelerden kaç tanesi negatif olduğunu bulan program
        Scanner input = new Scanner(System.in);
        int[] array;
        int n,result=0,total,index,k;
        System.out.print("Dizi kaç elemanlı olacak: ");
        n=input.nextInt();
        array=new int[n];
        for(int i=0;i<array.length;i++){
            System.out.print("Sayı giriniz: ");
            array[i]=input.nextInt();
        }

        for(int j=0;j<array.length;j++){
            k=j;
            while(k<array.length){
                total=0;
                index =j;
                do{
                    total+=array[index++];
                }while (index<=k);
                if(total<0){
                    result++;
                }
                k++;
            }
        }
        System.out.println("result: "+result);
    }
}