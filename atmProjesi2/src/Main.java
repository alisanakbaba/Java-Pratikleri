import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName , password;
        int balance=1500 , select , right=3,price;  // bakiye , işlem türü , kalan hak , işlem yapılacak tutar
        while(right>0){
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if(userName.equals("patika")&&(password.equals("java123"))){
                System.out.println("Merhaba , Kodluyoruz Bankasına Hoşgeldiniz!");

                do{
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgula\n"+
                            "4-Çıkış");
                    System.out.print("Lütfen işlem seçiniz: ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            price=input.nextInt();
                            if(price>balance){
                                System.out.println("Yeterli bakiyeniz bulunmamaktadır");
                            }else{
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : "+balance);
                            break;
                    }
                    System.out.println();
                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere ");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre , tekrar deneyiniz");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur  lütfen banka ile iletişime geçiniz");
                }else{
                    System.out.println("Kalan hak : "+right);
                }

            }
        }
    }
}