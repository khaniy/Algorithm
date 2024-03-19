package solution.number;

import solution.Solution;

import java.io.*;
import java.util.Scanner;

public class S1244 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] switchList = new int[n];
        for (int i = 0; i < n; i++) {
            switchList[i] = sc.nextInt();
        }
        int studentNumber = sc.nextInt();
        for (int i = 0; i < studentNumber; i++) {
            int sex = sc.nextInt();
            int loc = sc.nextInt();
            changeSwitch(switchList, sex, loc);
        }

        printList(switchList);

    }

    private static void printList(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {

            if (i % 20 == 0 && i != 0) {
                sb.append(System.lineSeparator());
            }
            sb.append(a[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }


    private static void changeSwitch(int[] a, int sex, int loc) {
        if (sex == 1) {
            for (int i = loc - 1; i < a.length; i += loc) {
                change(a, i);

            }
        } else if (sex == 2) {
            change(a, loc - 1);
            for (int gap = 1; loc + gap - 1 < a.length && loc - 1 - gap >= 0; gap++) {
                if (isSymmetry(a, loc - 1, gap)) {
                    change(a, loc + gap - 1);
                    change(a, loc - gap - 1);
                } else
                    break;
            }
        }
    }

    private static boolean isSymmetry(int[] a, int loc, int gap) {
        return a[loc + gap] == a[loc - gap];
    }

    private static void change(int[] a, int loc) {
        if (a[loc] == 1)
            a[loc] = 0;
        else if (a[loc] == 0)
            a[loc] = 1;
    }
}
