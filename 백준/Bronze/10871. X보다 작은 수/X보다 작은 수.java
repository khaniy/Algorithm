import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NandX = br.readLine().split(" ");
        int N = Integer.parseInt(NandX[0]);
        int X = Integer.parseInt(NandX[1]);

        int[] st = new int[N];
        String[] strInput = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            st[i] = Integer.parseInt(strInput[i]);
        }
        for (int i = 0; i < st.length; i++) {
            if (st[i] < X) {
                bw.write(String.valueOf(st[i])+" ");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
