import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan program
        // mükemmel sayı : kendisi hariç pozitif tam sayı çarpanları toplamı kendisine eşitse

        Scanner input = new Scanner(System.in); // kullanıcıdan değer almak için input nesnemizi oluşturduk
        int number,total=0;     // değişkenleri tanımladık

        System.out.print("Sayı giriniz : ");     // kullanıcıdan değer aldık
        number = input.nextInt();

        for(int i=1;i<number;i++){              // sayıya kadar döngüye aldık tam bölünenleri topladık
            if(number%i==0){
                total+=i;
            }
        }

        if (number==total){
            System.out.println(number+" Mükemmel sayıdır.");     // sonuç bölümü
        }else{
            System.out.println(number+" Mükemmel sayı değildir. ");
        }

    }
}