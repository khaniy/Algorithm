import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);
        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++;
        }
        bw.write(String.valueOf(days));
        bw.close();
        br.close();
    }
}