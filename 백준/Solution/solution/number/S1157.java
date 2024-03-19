package solution.number;

import solution.Solution;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class S1157 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        HashMap<String, Integer> store = new HashMap<>();
        for (String value : input) {
            String word = value.toUpperCase();
            if (store.containsKey(word)) {
                store.merge(word, 1, Integer::sum);
            } else {
                store.put(word, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        String maxKey = null;
        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
            else if (entry.getValue() == max && !entry.getKey().equals(maxKey)) {
                maxKey = "?";
            }
        }
        bw.write(maxKey);

        bw.flush();
        bw.close();
        br.close();
    }
}
