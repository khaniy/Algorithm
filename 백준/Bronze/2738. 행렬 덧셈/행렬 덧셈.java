import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[][] fstMatrix = new int[N][M];
        int[][] secMatrix = new int[N][M];
        for (int i =0; i<N; i++){
            String[] stringIn = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                fstMatrix[i][j] = Integer.parseInt(stringIn[j]);
            }
        }
        for (int i =0; i<N; i++){
            String[] stringIn = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                secMatrix[i][j] = Integer.parseInt(stringIn[j]);
            }
        }
        for (int i =0; i<N; i++){
            for(int j=0; j<M; j++){
                sb.append(String.valueOf(fstMatrix[i][j] + secMatrix[i][j]));
                if(j!=M-1){
                    sb.append(" ");
                }
            }
            if (i!=N-1){
                sb.append(System.lineSeparator());
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}