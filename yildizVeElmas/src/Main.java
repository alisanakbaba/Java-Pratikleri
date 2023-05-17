import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input nesnemizi oluşturduk
        int n; //değişkenimizi tanımladık
        System.out.print("n sayısını giriniz: ");  // kullanıcıdan girdimizi aldık
        n = input.nextInt();
        for(int i=1;i<=n;i++){   // satırları döngüye soktuk ve boşluk ve yıldızları doldurarak gideceğiz
            for(int a=1;a<=(n-i);a++) {   // boşluk sayısı da kaçıncı satır ise o satırın n den çıkarılması ile bulunur
                System.out.print(" ");
            }
            System.out.print("/");
            for(int b=2*i-1;b>0;b--){    //her satırdaki yıldız sayısı kaçıncı satır ise o satırın *2-1 ine eşit
                System.out.print("*");
            }
            System.out.print("\\");
            System.out.println();
        }               // üçgen tamamlandı devamı elmas yapmak için
        for(int j=n-1;j>0;j--){
            for(int a=1;a<=(n-j);a++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int b=2*j-1;b>0;b--){
                System.out.print("*");
            }
            System.out.print("/");
            System.out.println();
        }
    }
}