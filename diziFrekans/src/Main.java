import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int[] list,int value){
        for(int i=0;i<list.length;i++){
            if(list[i]==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
        Scanner input = new Scanner(System.in);
        int[] list1,list2;
        int n,again,index=0;
        System.out.print("Eleman sayısını giriniz: ");
        n=input.nextInt();
        list1=new int[n];
        for(int i=0;i<list1.length;i++){
            System.out.print("Sayı giriniz: ");
            list1[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(list1));
        list2=new int[n];
        System.out.println("Tekrar Sayıları");
        for (int i=0;i<list1.length;i++){
            if(!isFind(list2,list1[i])){
                list2[index++]=list1[i];
                again=1;
                for (int j=0;j<list1.length;j++){
                    if((i!=j)&&(list1[i]==list1[j])){
                        again++;
                    }
                }
                System.out.println(list1[i]+" sayısı "+again+" kere tekrar edildi.");
            }
        }
    }
}