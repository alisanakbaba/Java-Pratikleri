import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value,i=2;
        System.out.print("Sayı giriniz: ");
        value=input.nextInt();
        System.out.println(recursiveAsal(value,i));
    }

    static String recursiveAsal(int x,int i){
        if (x==i) {
            return x + " Sayısı ASALDIR !";
        } else if (x<=1) {
            return x+ " Sayısı ASAL değildir";
        } else if ((x%i)==0) {
            return x+" Sayısı ASAL değildir !";
        }
        return recursiveAsal(x,i+1);
    }
}