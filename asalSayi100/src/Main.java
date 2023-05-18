public class Main {
    public static void main(String[] args) {
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

        for(int i=2;i<100;i++){   // döngüyü istenilen değerler arasında başlattık
            boolean isAsal = true;   // her bulunan sayının asal mı değil diye kontrol edip asal değilse false değerini atadığımız değişken
            for(int j=2;j<i;j++){    // üstteki döngüdeki sayının asal olup olmadığını anlamamız için kullancağımız döngü
                if (i%j==0){
                    isAsal=false;   // eğer 1 ve kendisinden başka kendisine tam bölünen bir değer varsa asal değildir
                    break;          // bir tane bu değerden bulmamız asal olmamasına yeterli
                }
            }
            if(isAsal){
                System.out.print(i+" ");   // sayı asal ise yazdır
            }
        }
    }
}