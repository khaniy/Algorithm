package solution;

import java.io.*;
import java.util.*;

public class S20920 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> store = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.length() >= M) {
//                if (store.containsKey(input))
                store.put(input, store.getOrDefault(input, 0) + 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(store.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // Compare by frequency in descending order
                int freqCompare = o2.getValue().compareTo(o1.getValue());
                if (freqCompare != 0) {
                    return freqCompare;
                }
                // Compare by length in ascending order
                int lengthCompare = Integer.compare(o2.getKey().length(), o1.getKey().length());
                if (lengthCompare != 0) {
                    return lengthCompare;
                }
                // Compare lexicographically
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            bw.write(entry.getKey());
            bw.write(System.lineSeparator());
        }

        bw.close();
        br.close();
    }
}
