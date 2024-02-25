import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        int[] st = new int[N];
        int i,j;
        for (i=0; i<M; i++){
            String[] input = br.readLine().split(" ");
            int first = Integer.parseInt(input[0]);
            int last = Integer.parseInt(input[1]);
            int number = Integer.parseInt(input[2]);
            for(j=first-1; j<=last-1; j++){
                st[j] = number;
            }
        }
        for(i=0; i<st.length; i++){
            bw.write(String.valueOf(st[i]) + " ");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
