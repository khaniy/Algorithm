package solution;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class S2941 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] Croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String value : Croatia) {
            str = str.replace(value, "q");
        }
        bw.write(String.valueOf(str.length()));

        bw.flush();
        bw.close();
        br.close();
    }
}
