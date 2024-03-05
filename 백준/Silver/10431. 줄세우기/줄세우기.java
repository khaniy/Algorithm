import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int number = Integer.parseInt(st.nextToken());
            int count = 0;
            int[] store = new int[20];
            for (int j = 0; j < 20; j++) {
                int student = Integer.parseInt(st.nextToken());
                count += caculate(student, store);
                store[j] = student;
            }
            bw.write(String.valueOf(i)+" "+String.valueOf(count));
            bw.newLine();
        }
        bw.close();
        br.close();

    }

    private static int caculate(int student, int[] store) {
        int count = 0;
        for (int i = 0; i < store.length; i++) {
            if (student < store[i]){
                count+=1;
            }
        }
        return count;
    }
}