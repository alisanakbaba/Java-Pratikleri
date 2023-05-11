import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day;
        boolean isError = false;
        String burc="";
        System.out.print("Doğduğunuz ayı giriniz: ");
        month=input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();
        if (month==1){
            if (day>0 && day<=31){
                burc = (day<22) ? "Oğlak":"Kova";
            }else {
                isError=true;
            }
        }else if(month==2){
            if (day>0 && day<=28){
                burc = (day<20) ? "Kova":"Balık";
            }else{
                isError=true;
            }
        } else if (month==3) {
            if(day>0 && day<=31){
                burc = (day<22) ? "Balık":"Koç";
            }else{
                isError=true;
            }
        } else if (month==4) {
            if(day>0 && day<=30){
                burc = (day<21) ? "Koç":"Boğa";
            }else{
                isError=true;
            }
        }else if (month==5) {
            if (day > 0 && day <= 31) {
                burc = (day < 22) ? "Boğa" : "İkizler";
            } else {
                isError = true;
            }
        }else if (month==6) {
            if (day > 0 && day <= 30) {
                burc = (day < 23) ? "İkizler" : "Yengeç";
            } else {
                isError = true;
            }
        }else if (month==7) {
            if (day > 0 && day <= 31) {
                burc = (day < 23) ? "Yengeç" : "Aslan";
            } else {
                isError = true;
            }
        }else if (month==8) {
            if (day > 0 && day <= 31) {
                burc = (day < 23) ? "Aslan" : "Başak";
            } else {
                isError = true;
            }
        }else if (month==9) {
            if (day > 0 && day <= 30) {
                burc = (day < 23) ? "Başak" : "Terazi";
            } else {
                isError = true;
            }
        }else if (month==10) {
            if (day > 0 && day <= 31) {
                burc = (day < 23) ? "Terazi" : "Akrep";
            } else {
                isError = true;
            }
        }else if (month==11) {
            if (day > 0 && day <= 30) {
                burc = (day < 22) ? "Akrep" : "Yay";
            } else {
                isError = true;
            }
        }else if (month==12) {
            if (day > 0 && day <= 31) {
                burc = (day < 22) ? "Yay" : "Oğlak";
            } else {
                isError = true;
            }
        }else {
            isError = true;
        }

        if(isError){
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz!");
        }else{
            System.out.println("Burcunuz: "+burc);
        }
    }
}