import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int in = Integer.parseInt(br.readLine());
        int max = in * 2 - 1;
        for (int i = 0; i < in; i++) {
            int starCount = i * 2 + 1;
            String text = " ".repeat((max - starCount) / 2) + "*".repeat(starCount);
            bw.write(text);
            bw.newLine();
        }
        for (int i = in - 2; i >= 0; i--) {
            int starCount = i * 2 + 1;
            String text = " ".repeat((max - starCount) / 2) + "*".repeat(starCount);
            bw.write(text);
            if (i != 0) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

}