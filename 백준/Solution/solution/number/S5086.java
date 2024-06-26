package solution.number;

import solution.Solution;

import java.io.*;
import java.util.Scanner;

public class S5086 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) break;

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

        sc.close();
    }
}
