package solution;

import java.io.*;

public class S1193 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int l = 1;
        int start = 0;
        int u = 0;
        int d = 0;
        while(true){
            int last= (int) (Math.pow(l,2)+l)/2;
            if (start < N && N <= last){
                int cp = l + 1;
                int count = N - start;
                if(l%2 ==1){
                    u = cp-count;
                    d = count;
                }else{
                    u = count;
                    d = cp-count;
                }
                break;
            }
            l+=1;
            start = last;
        }
        bw.write(String.valueOf(u) +"/"+String.valueOf(d));
        bw.close();
        br.close();
    }
}
