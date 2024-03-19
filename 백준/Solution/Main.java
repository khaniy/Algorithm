import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, X, MAX, COUNT;
    static int[] input;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        given();
        when();
        then();
    }

    private static void given() throws IOException {
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        input = new int[N];
        String[] inputList = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(inputList[i]);
        }
    }
    private static void when() {
        int i = 0;
        COUNT = 1;
        int init = 0;
        for (int j = 0; j < X; j++)
           init += input[j];
        MAX = init;
        do {
            init = init - input[i] + input[X+i];
            if (init == MAX) {
                COUNT++;
            }
            if (init > MAX) {
                MAX = init;
                COUNT = 1;
            }
            i++;
        } while (i < N - X);
    }

    private static void then() throws IOException {
        if (MAX == 0)
            bw.write("SAD");
        else {
            bw.write(String.valueOf(MAX));
            bw.newLine();
            bw.write(String.valueOf(COUNT));
        }
        br.close();
        bw.close();

    }

}