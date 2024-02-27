import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solver solver = new Solver(new S1157());
//        solver.solve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++){
            String input = br.readLine();
            String s = null;
            boolean seq = false;
            for(int j=0; j<input.length(); j++){
                String c = Character.toString(input.charAt(j));
                if(!s.equals(c)){
                    s=c;

                }
                if(s.contains(c)){

                }

            }
        }

    }
}