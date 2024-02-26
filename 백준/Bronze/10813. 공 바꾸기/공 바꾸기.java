import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        int[] st = new int[N];
        for (int i=0; i<st.length; i++){st[i] = i+1;}
        for (int i=0; i<M; i++){
            String[] input = br.readLine().split(" ");
            int left = Integer.parseInt(input[0]) - 1;
            int right = Integer.parseInt(input[1]) - 1;
            int tempInt = st[left];
            st[left] = st[right];
            st[right] = tempInt;
        }
        for (int i=0; i<st.length; i++){
            bw.write(String.valueOf(st[i]) + " ");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}