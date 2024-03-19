package solution.number;

import solution.Solution;

import java.io.*;
import java.util.Map;

public class S25206 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Double> gradingScale = Map.ofEntries(
                Map.entry("A+", 4.5),
                Map.entry("A0", 4.0),
                Map.entry("B+", 3.5),
                Map.entry("B0", 3.0),
                Map.entry("C+", 2.5),
                Map.entry("C0", 2.0),
                Map.entry("D+", 1.5),
                Map.entry("D0", 1.0),
                Map.entry("F", 0.0)
        );
        double totalCredit = 0.0;
        double totalScore = 0.0;
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];
            if (!grade.equals("P")) {
                double score = credit * gradingScale.get(grade);
                totalCredit += credit;
                totalScore += score;
            }
        }
        bw.write(String.valueOf(totalScore / totalCredit));
        bw.close();
        br.close();
    }
}
