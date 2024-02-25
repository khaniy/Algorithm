import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        int f = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++) {
            if(a[i]==f) {
                sum++;
            }
        }
        System.out.println(sum);
    }


}
