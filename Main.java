import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 9;
        int[] st = new int[N];
        for (int i = 0; i < N; i++) {
            st[i] = Integer.parseInt(br.readLine());
        }
        int max = st[0];
        int loc = 1;
        for (int i =1; i< st.length; i++){
            if(max <= st[i]){
                max = st[i];
                loc = i+1;
            }
        }
        bw.write(String.valueOf(max) + " " + String.valueOf(loc));

        bw.flush();
        br.close();
        bw.close();
    }
}
