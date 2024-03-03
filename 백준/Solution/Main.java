import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solver solver = new Solver(new S2738());
//        solver.solve();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int[] lengths = new int[3];
        for (int i = 0; i < 3; i++) {
            lengths[i] = sc.nextInt();
        }
        Arrays.sort(lengths);
        if (lengths[0] + lengths[1] > lengths[2]) {
            bw.write(String.valueOf(lengths[0] + lengths[1] + lengths[2]));
        }else if(lengths[0]+lengths[1] <=lengths[2]) {
            bw.write(String.valueOf((lengths[0] + lengths[1]) * 2 - 1));
        }


        sc.close();
        bw.close();
    }
}