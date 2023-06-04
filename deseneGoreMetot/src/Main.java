import java.util.Scanner;

public class Main {

    static void  f(int x,int y,boolean z) {
        if (y>0 && !z) {
            System.out.print(y + " ");
            f(x, y - 5, z);
        } else if (y==x) {
            System.out.println(y+" ");
        }else {
            System.out.print(y+" ");
            f(x,y+5,true);
        }
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        boolean is0=false;

        System.out.print("n sayısını giriniz: ");
        n=input.nextInt();
        k=n;

        System.out.print("Çıktısı: ");
        f(n,k,is0);
        /*
        while(k>0){
            System.out.print(k+" ");
            k-=5;
        }
        while(k<=n){
            System.out.print(k+" ");
            k+=5;
        }*/

    }
}