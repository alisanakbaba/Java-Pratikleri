import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfDigits,x; // değişkenleri tanımladık

        System.out.print("Basamak sayısını giriniz : ");  // kullanıcıdan değerleri aldık
        numberOfDigits = input.nextInt();
        x = numberOfDigits;    // yıldız sayısını bulmada kullanacağız ters olduğu için orijinal basamak sayısını kullanamayız
                               // basamak sayısı değerinden başlatıp değeri azaltacağız değer değişecek yani bu yüzden x i kullanacaz
        for(int i=1;i<=numberOfDigits;i++){      // basamakları doldurarak gideceğiz

            for(int j=0;j<i;j++){    // boşlukları oluşturma her satırdaki boşluk sayısı satırdakinden bir eksik olacak şekilde
                System.out.print(" ");
            }
            for(int k=1;k<=(2*x-1);k++){   // yıldız oluşturma basamak sayısının bir eksiğinden başlar 2 şer azalarak devam eder
                System.out.print("*");
            }
            x--;
            System.out.println();
        }
    }
}