package solution.number;

import java.io.*;

public class S1316 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++){
            String input = br.readLine();
            if(isGroupWord(input)){
                count+=1;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
    private static boolean isGroupWord(String input){
        boolean[] check = new boolean[26];
        for(int j=0; j<input.length(); j++){
            char now = input.charAt(j);
            char f = (j==0) ? input.charAt(0) : input.charAt(j - 1);
            if (check[now-'a']){
                if(now != f){
                    return false;
                }
            }else{
                check[now-'a'] = true;
            }
        }

        return true;
    }
}
