package solution;

import java.io.*;
import java.util.HashMap;

public class S1157 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        HashMap<Integer, Integer> store = new HashMap<>();
        for (String value : input) {
            int valueByteCode = value.getBytes()[0];
            int loc = 0;
            byte aByte = "a".getBytes()[0];
            byte zByte = "z".getBytes()[0];
            byte AByte = "A".getBytes()[0];
            byte ZByte = "Z".getBytes()[0];
            if (valueByteCode >= aByte || valueByteCode <= zByte) {
                loc = valueByteCode - aByte;
            }
            if (valueByteCode >= AByte || valueByteCode <= ZByte) {
                loc = valueByteCode - AByte;
            }

            Integer i = store.get(value);

        }
        bw.flush();
        bw.close();
        br.close();


    }
}
