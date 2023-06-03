import java.util.Scanner;

public class Main {

    static void printMatris(int[][] matris){
        for(int[] row:matris){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matris, matrisT;
        int row, col;

        System.out.print("Satır sayısını giriniz: ");
        row = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        col = input.nextInt();

        matris=new int[row][col];
        matrisT=new int[col][row];

        System.out.println("Matrisin Elemanları giriniz:");
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[0].length;j++){
                System.out.print("Sayı giriniz: ");
                matris[i][j]=input.nextInt();

                matrisT[j][i]=matris[i][j];
            }
        }
        printMatris(matris);
        System.out.println();
        printMatris(matrisT);

    }
}