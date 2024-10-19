import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String string = br.readLine();

        int r = 31;
        int m = 1234567891;

        long hash = 0;
        long p = 1;
        for (int i = 0; i < string.length(); i++) {
            int c = string.charAt(i) - 'a' + 1;
            hash = (hash + c * p) % m;
            p = (p*r) % m;
        }
        bw.write(String.valueOf(hash));
        bw.flush();
        bw.close();
        br.close();
    }
}