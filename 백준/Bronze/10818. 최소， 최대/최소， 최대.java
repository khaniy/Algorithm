import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        String[] intput = br.readLine().split(" ");
        int[] st = new int[N];
        for (int i = 0; i < N; i++) {st[i] = Integer.parseInt(intput[i]);}
        int max = st[0];
        int min = st[0];
        for (int i =1; i< st.length; i++){
            if(max<st[i]){max = st[i];}
            if(min>st[i]){min = st[i];}
        }
        bw.write(String.valueOf(min) + " " + String.valueOf(max));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
