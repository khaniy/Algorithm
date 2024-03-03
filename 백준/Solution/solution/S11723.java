package solution;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S11723 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        for(int i=0; i<M; i++){
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            String method = input.nextToken();
            switch (method){
                case "add":
                    add(Integer.parseInt(input.nextToken()));
                    break;
                case "remove":
                    remove(Integer.parseInt(input.nextToken()));
                    break;
                case "check":
                    check(Integer.parseInt(input.nextToken()));
                    break;
                case "toggle":
                    toggle(Integer.parseInt(input.nextToken()));
                    break;
                case "all":
                    allSet();
                    break;
                case "empty":
                    emptySet();
                    break;
            }

        }
        bw.close();
        br.close();
    }
    static Set<Integer> store = new HashSet<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static void add(int x) {
        store.add(x);
    }

    static void remove(int x) {
        store.remove(x);
    }

    static void check(int x) throws IOException {
        if (store.contains(x)) {
            bw.write(String.valueOf(1));
            bw.newLine();
        } else {
            bw.write(String.valueOf(0));
            bw.newLine();
        }
    }

    static void toggle(int x) {
        if (store.contains(x)) {
            store.remove(x);
        } else {
            store.add(x);
        }
    }

    static void allSet() {
        store.clear();
        for (int i = 1; i <= 20; i++) {
            store.add(i);
        }
    }

    static void emptySet() {
        store.clear();
    }
}
