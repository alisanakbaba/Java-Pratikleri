public class Main {
    public static void main(String[] args) {
        intpalindrom(12321);
        strPalindrom("12321");
    }
    // matematik ile çözümü
    static void intpalindrom(int a){
        int bToplami = 0;
        int bSayisi = 0;
        for(int i=a;i>0;i=i/10){
            bSayisi+=1;
        }
        for(int i=a;i>0;i=i/10){
            int k = i%10;
            bToplami+=k*(Math.pow(10,bSayisi-1));
            bSayisi--;
        }

        if (bToplami==a){
            System.out.println("Palindrom sayı");
        }else{
            System.out.println("Palindrom sayı değil"+bToplami+" "+a);
        }
    }
    // String ifadeyi ters çevirerek çözme
    static void strPalindrom(String a) {
        String yeniSayi = "";
        for (int i = 0; i < a.length(); i++) {
            yeniSayi += a.charAt(i);
        }
        if (a.equals(yeniSayi)) {
            System.out.println("Palindrom sayı");
        } else {
            System.out.println("Palindrom sayı değil: " + yeniSayi + " " + a);
        }
    }



}