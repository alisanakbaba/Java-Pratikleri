import java.util.Scanner;

public class Main {

    static boolean isPalindrom1(String str){
        String value2="";
        for(int i=str.length()-1;i>=0;i--){
            value2+=(str.charAt(i));
        }
        return str.equals(value2);
    }

    static boolean isPalindrom2(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value;
        System.out.print("Kelimenizi giriniz: ");
        value=input.nextLine();
        System.out.println(isPalindrom1(value));
        System.out.println(isPalindrom2(value));
    }
}