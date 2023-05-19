import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java döngüler ile fibonacci serisi bulan program
        Scanner input = new Scanner(System.in);
        int numberOfElements,numberx=0,numbery=1,numberz;  // değişkenleri tanımladık

        System.out.print("Fibonaccinin ilk kaç terimini istersiniz: ");  // kullanıcıdan değerleri aldık
        numberOfElements = input.nextInt();
        System.out.print(numberx+" "+numbery); // ilk iki terimi yazdırdık
        numberz = numberx+numbery;
        System.out.print(" "+numberz);   // üçüncü terimin değerini bulduk ve yazdırdık

        for(int i=3;i<numberOfElements;i++){  // ilk 3 terimini bulduğumuz için 3 ten başlattık
            numberx = numbery;
            numbery = numberz;
            numberz = numberx+numbery;   // kendisinden önceki iki sayının toplamı
            System.out.print(" "+numberz);
        }


    }
}