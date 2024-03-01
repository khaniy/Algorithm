import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= input; j++) {
                if (input % j == 0) {
                    count +=1;
                }
            }
            if(count==2){
                answer+=1;
            }
        }
        System.out.println(answer);
    }
}