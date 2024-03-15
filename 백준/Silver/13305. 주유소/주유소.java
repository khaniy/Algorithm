import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] roadList = new int[N-1];
        int[] priceList = new int[N];
        for (int i=0; i<N-1; i++){
            roadList[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            priceList[i] = sc.nextInt();
        }
        int minPrice = Integer.MAX_VALUE;
        int amt = 0;
        for(int i=0; i<priceList.length-1; i++){
            if(priceList[i]<minPrice)
                minPrice = priceList[i];
            amt += minPrice * roadList[i];
        }
        System.out.println(amt);
    }
}