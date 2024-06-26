import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        HashMap<Integer, int[]> map1 = new HashMap<>();

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());

            int country = Integer.parseInt(st.nextToken());
            int[] medals = new int[3];

            for (int j = 0; j < 3; j++) {
                medals[j] = Integer.parseInt(st.nextToken());
            }
            map1.put(country, medals);
        }

        int rank = 1;
        for (int i = 1; i < N + 1; i++) {
            if (map1.get(K)[0] < map1.get(i)[0]) {
                rank++;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            if (map1.get(K)[0] == map1.get(i)[0] && map1.get(K)[1] < map1.get(i)[1]) {
                rank++;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            if (map1.get(K)[0] == map1.get(i)[0] && map1.get(K)[1] == map1.get(i)[1] && map1.get(K)[2] < map1.get(i)[2]) {
                rank++;
            }
        }

        System.out.println(rank);
    }
}