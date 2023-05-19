import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q,a,b,n,total;
        // (a+2**0*b),(a+2**0*b+2**1*b), ....... , (a+2**0*b+2**1*b+......+(2**(n-1))*b) şeklinde sonucu yazdıracak
        System.out.print("q: ");
        q = input.nextInt();  // sorgu sayısı

        while(q>0){
            System.out.print("a: ");
            a = input.nextInt();
            System.out.print("b: ");
            b = input.nextInt();
            System.out.print("n: ");
            n = input.nextInt();

            for(int i=1;i<=n;i++){
                total=a;
                for(int j=0;j<i;j++){
                    total+=Math.pow(2,j)*b;
                }
                System.out.print(total+" ");
            }
            q--;
            System.out.println();
        }
    }
}