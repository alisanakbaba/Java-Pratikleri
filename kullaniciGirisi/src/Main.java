import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String userName,password,kontrol,newPassword;
       System.out.print("Kullanıcı adınızı giriniz: ");
       userName=input.nextLine();
       System.out.print("şifrenizi giriniz: ");
       password=input.nextLine();
       if(userName.equals("patika")&&password.equals("java123")){
           System.out.println("Sisteme giriş yaptınız!");
       }else {
           System.out.println("Hatalı giriş  yaptınız");
           System.out.println("şifrenizi sıfırlamak ister misiniz");
           kontrol=input.nextLine();
           if (kontrol.equals("evet")){
               System.out.print("Yeni şifrenizi giriniz: ");
               newPassword=input.nextLine();
               if(newPassword.equals("java123")){
                   System.out.print("Şifre oluşturulamadı,lütfen başka şifre giriniz: ");
                   newPassword=input.nextLine();
                   System.out.println("Şifre oluşturuldu");
               }else {
                   System.out.println("Şifre oluşturuldu");
               }
           }else {
               System.out.println("İyi Günler");
           }
       }
    }
}