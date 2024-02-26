import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> remainderSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            int remainder = number % 42;
            remainderSet.add(remainder);
        }
        bw.write(String.valueOf(remainderSet.size()));

        bw.flush();
        br.close();
        bw.close();
    }
}