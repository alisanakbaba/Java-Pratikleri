import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int value, selected, right=0;
        int[] wrongs=new int[5];
        boolean isWrong = false, isWin = false;

        value = random.nextInt(100);
        //value = (int) (Math.random()*100);

        while (right<5){
            System.out.print("Tahmininizi giriniz: ");
            selected=input.nextInt();

            if ((selected<0)||(selected>99)){
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if (isWrong){
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: "+(5-(++right)));
                }else{
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            } else if (selected==value) {
                System.out.println("Tebrikler doğru tahmin ettiniz. Girdiğiniz değer: "+selected);
                isWin=true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz.");
                if(selected<value){
                    System.out.println(selected+" Sayısı, gizli sayıdan küçüktür.");
                }else{
                    System.out.println(selected+" Sayısı, gizli sayıdan büyüktür.");
                }
                wrongs[right++]=selected;
                System.out.println("Kalan hakkınız: "+(5-right));
            }
        }
        if (!isWin){
            System.out.println("Oyunu kaybettiniz!");
            System.out.println(Arrays.toString(wrongs));
        }
    }
}