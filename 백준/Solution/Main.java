import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solver solver = new Solver(new S2738());
//        solver.solve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        while (true){
            N = N / B;
            int rest = N % B;
            if(10 <= rest){
                 sb.append((char) ('A' + rest-10));
            }else{
                sb.append(String.valueOf(rest));
            }
            if (N == 0){
                break;
            }

        }
        System.out.println(35/35);
        System.out.println(35%35);
        bw.write(sb.reverse().toString());
        bw.close();
        br.close();
    }
}