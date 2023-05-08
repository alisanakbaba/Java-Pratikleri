import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input nesnesini kullanicidan girdi almak icin kullanacagiz
        Scanner input = new Scanner(System.in);
        // Hesap Makinesi giris bolumu
        System.out.println("Hesap Makinesine Hosgeldiniz");
        System.out.println("İslemler:\n"+
                           "1-Toplama\n"+
                            "2-Cikarma\n"+
                            "3-Carpma\n"+
                            "4-Bolme\n");
        // kullanilacak degiskenler tanimlandi
        double number1,number2;
        int process;
        // degiskenler icin girdiler kullanicidan aliniyor
        System.out.print("Lutfen sectiginiz islemin numarasini giriniz: ");
        process = input.nextInt();
        System.out.print("number1 i giriniz: ");
        number1 = input.nextDouble();
        System.out.print("number2 yi giriniz: ");
        number2 = input.nextDouble();
        // Hesap Makinesinin if else ile yapimi
        /*
        if (process==1){
            System.out.println("Toplama islemi sonucu: " + (number1+number2));
        }else if (process==2) {
            System.out.println("Cikarma islemi sonucu: " + (number1-number2));
        } else if (process==3) {
            System.out.println("Carpma islemi sonucu: " + (number1*number2));
        } else if (process==4) {
            if(number2==0){
                System.out.println("Bir sayi 0 a bolunemez");
            }else {
                System.out.println("Bolme islemi sonucu: " + (number1/number2));
            }
        } else {
            System.out.println("Hatali islem secimi yaptiniz! İyi Günler Dileriz");
        }
        */
        // Hesap Makinesinin switch case ile yapimi
        switch (process){
            case 1:
                System.out.println("Toplama islemi sonucu: " + (number1+number2));
                break;
            case 2:
                System.out.println("Cikarma islemi sonucu: " + (number1-number2));
                break;
            case 3:
                System.out.println("Carpma islemi sonucu: " + (number1*number2));
                break;
            case 4: // bolme isleminde 0 a bolmede istisna oldugu icin kontrol edilmeli
                if(number2==0) {
                    System.out.println("Herhangi bir sayi 0 a bolunemez");
                }else {
                    System.out.println("Bolme islemi sonucu: " + (number1 / number2));
                }
                break;
            // kullanicin islem secememesi durumunda olasi senaryo
            default:
                System.out.println("Yapmak istediginiz  islemin degerini yanlis sectiniz!");

        }
        System.out.println("İyi Gunler Dileriz");
    }
}