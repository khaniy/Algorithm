package solution.number;

import solution.SolutionOld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S25757 implements SolutionOld {
    @Override
    public void solve() throws IOException {
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
