import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int count = 0;
        String[] Croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String value : Croatia) {
            str = str.replace(value, "q");
        }
        bw.write(String.valueOf(str.length()));

        bw.flush();
        bw.close();
        br.close();

    }
}