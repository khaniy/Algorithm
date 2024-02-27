import solution.Solution;

import java.io.IOException;

public class Solver {
    private final Solution solution;

    public Solver(Solution solution) {
        this.solution = solution;
    }

    public void solve() throws IOException {
        this.solution.solve();
    }
}
