import solution.S2738;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solver solver = new Solver(new S2738());
//        solver.solve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        if (N % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}