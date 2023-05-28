import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int islem,number1,number2 = 0;
        System.out.println("Gelişmiş Hesaplama Makinesine Hoşgeldiniz ");
        
        String menu=("1-Toplama\n"+
                     "2-Çıkarma\n"+
                     "3-Çarpma\n"+
                     "4-Bölme\n"+
                     "5-Mod Alma\n"+
                     "6-Dikdörtgen AlanıveÇevresi\n"+
                     "7-Üslü Sayı\n"+
                     "8-Faktöriyel Hesaplama\n"+
                     "9-Çıkış");
        
        while(true){
            System.out.println(menu);
            System.out.println();
            System.out.print("İşlem seçiniz: ");
            islem = input.nextInt();
            if(islem==9){
                System.out.println("Çıkış Yaptınız");
                break;
            } else if (islem==8) {
                System.out.print("Sayıyı giriniz: ");
                number1=input.nextInt();
            }else{
                System.out.print("İlk sayıyı giriniz: ");
                number1=input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                number2=input.nextInt();
            }
            switch (islem){
                case 1:
                    System.out.println("Sonuç: "+toplama(number1,number2));
                    break;
                case 2:
                    System.out.println("Sonuç: "+cikarma(number1,number2));
                    break;
                case 3:
                    System.out.println("Sonuç: "+carpma(number1,number2));
                    break;
                case 4:
                    System.out.println("Sonuç: "+bolme(number1,number2));
                    break;
                case 5:
                    System.out.println("Sonuç: "+mod(number1,number2));
                    break;
                case 6:
                    System.out.print("Sonuç: ");
                    dikdortgenAlaniCevresi(number1,number2);
                    break;
                case 7:
                    System.out.println("Sonuç: "+usluSAyi(number1,number2));
                    break;
                case 8:
                    System.out.println("Sonuç: "+faktoriyel(number1));
                    break;
                default:
                    System.out.println("Hatalı işlem seçtiniz");
            }
            System.out.println();
        }
    }

    static int toplama(int x,int y){
        return x+y;
    }
    static int cikarma(int x,int y){
        return x-y;
    }
    static int carpma(int x,int y){
        return x*y;
    }
    static double bolme(int x, int y){
        if (y==0){
            System.out.println("0 a bölünemez");
            return 0;
        }
        return (double)x/y;
    }
    static int mod(int x,int y){
        return x%y;
    }
    static void  dikdortgenAlaniCevresi(int x,int y){
         System.out.println("Alan: "+x*y+" Çevre: "+2*(x+y));
    }

    static int usluSAyi(int x,int y){
        int result=1;
        for(int i=1;i<=y;i++){
            result*=x;
        }
        return result;
    }
    static int faktoriyel(int x){
        int result=1;
        for(int i=x;i>0;i--){
            result*=i;
        }
        return result;
    }
}