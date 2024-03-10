import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solver solver = new Solver(new S2738());
//        solver.solve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, Integer> miniGame = Map.ofEntries(
                Map.entry("Y", 2),
                Map.entry("F", 3),
                Map.entry("O", 4)
        );
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int numOfGame = miniGame.get(st.nextToken());
        Set<String> storage = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            String Id = br.readLine();
            storage.add(Id);
        }
        int people = storage.toArray().length;
        System.out.println(people/(numOfGame-1));
    }
}