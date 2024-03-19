import solution.SolutionOld;

import java.io.IOException;

public class Solver {
    private final SolutionOld solutionOld;

    public Solver(SolutionOld solutionOld) {
        this.solutionOld = solutionOld;
    }

    public void solve() throws IOException {
        this.solutionOld.solve();
    }
}
