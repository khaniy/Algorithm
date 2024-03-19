package solution.number;

import solution.SolutionOld;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class S5073 implements SolutionOld {
    @Override
    public void solve() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] lengths = new int[3];
            for (int i = 0; i < 3; i++) {
                lengths[i] = sc.nextInt();
            }
            Arrays.sort(lengths);
            if (lengths[0] == 0 && lengths[1] == 0 && lengths[2] == 0) {
                break;
            }
            if (lengths[0] + lengths[1] > lengths[2]) {
                if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
                    bw.write("Equilateral" + System.lineSeparator());
                } else if (lengths[0] == lengths[1] || lengths[1] == lengths[2]) {
                    bw.write("Isosceles" + System.lineSeparator());
                } else {
                    bw.write("Scalene" + System.lineSeparator());
                }
            } else {
                bw.write("Invalid" + System.lineSeparator());
            }
        }
        sc.close();
        bw.close();
    }
}
