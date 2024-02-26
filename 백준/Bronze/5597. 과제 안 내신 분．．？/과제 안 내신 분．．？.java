import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sheet = new int[30];

        for (int i = 0; i < 28; i++) {
            int number = Integer.parseInt(br.readLine());
            sheet[number - 1] = number;
        }
        for (int i = 0; i < 30; i++) {
            if (sheet[i] != i + 1) {
                bw.write(String.valueOf(i+1) + " ");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}