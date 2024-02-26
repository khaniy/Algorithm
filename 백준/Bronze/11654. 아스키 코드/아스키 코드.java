import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char c = s.charAt(0);
        int asciiValue = (int) c;
        bw.write(String.valueOf(asciiValue));
        bw.flush();
        br.close();
        bw.close();
    }
}