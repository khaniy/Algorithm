package solution.number;

import solution.Solution;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class S10101 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] angles = new int[3];
        for (int i = 0; i < 3; i++) {
            angles[i] = scanner.nextInt();
        }
        Arrays.sort(angles);
        if (angles[0] + angles[1] + angles[2] == 180) {
            if (angles[0] == angles[2]) {
                System.out.println("Equilateral");
            }
            else if (angles[0] == angles[1] || angles[1] == angles[2]) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
