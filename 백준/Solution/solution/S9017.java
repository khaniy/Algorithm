package solution;

import java.io.IOException;
import java.util.*;

public class S9017 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int testCase = 0; testCase < T; testCase++) {
            int N = scanner.nextInt();
            int[] runners = new int[N];
            HashMap<Integer, ArrayList<Integer>> store = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int team = scanner.nextInt();
                runners[i] = team;
                store.computeIfAbsent(runners[i], k -> new ArrayList<>()).add(i + 1);
            }
            ArrayList<Integer> exceptTeams = new ArrayList<Integer>();
            for (Map.Entry<Integer, ArrayList<Integer>> entry : store.entrySet()) {
                if (entry.getValue().toArray().length < 6) {
                    exceptTeams.add(entry.getKey());
                }
            }
            HashMap<Integer, ArrayList<Integer>> finalStore = new HashMap<>();
            ArrayList<Integer> finalRunners = new ArrayList<>();
            for (Integer team : runners) {
                if (!exceptTeams.contains(team)) {
                    finalRunners.add(team);
                }
            }
            for (int i = 0; i < finalRunners.size(); i++) {
                finalStore.computeIfAbsent(finalRunners.get(i), k -> new ArrayList<>()).add(i + 1);
            }
            int winningTeam = -1;
            int lowestScore = Integer.MAX_VALUE;
            int fifthScore = Integer.MAX_VALUE;
            for (Map.Entry<Integer, ArrayList<Integer>> entry : finalStore.entrySet()) {
                ArrayList<Integer> positions = entry.getValue();
                Collections.sort(positions);
                int score = positions.get(0) + positions.get(1) + positions.get(2) + positions.get(3);
                if (score < lowestScore) {
                    winningTeam = entry.getKey();
                    lowestScore = score;
                    fifthScore = positions.get(4);
                } else if (score == lowestScore && positions.get(4) < fifthScore) {
                    winningTeam = entry.getKey();
                    fifthScore = positions.get(4);
                }
            }
            System.out.println(winningTeam);
        }
        scanner.close();
    }
}

