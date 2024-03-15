import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long[] roadList = new Long[N-1];
        Long[] priceList = new Long[N];
        for (int i=0; i<N-1; i++){
            roadList[i] = sc.nextLong();
        }
        for(int i=0; i<N; i++){
            priceList[i] = sc.nextLong();
        }
        Long minPrice = Long.MAX_VALUE;
        long amt = 0;
        for(int i=0; i<priceList.length-1; i++){
            if(priceList[i]<minPrice)
                minPrice = priceList[i];
            amt += (long) minPrice * roadList[i];

        }
        System.out.println(amt);

    }
}