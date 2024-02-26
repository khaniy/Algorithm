import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] input = new String[T];
        for (int i=0; i<T; i++) {
            input[i] = br.readLine();
        }
        for(int i=0; i<T; i++){
            String[] splitInput = input[i].split(" ");
            int R = Integer.parseInt(splitInput[0]);
            String S = splitInput[1];
            for(int j=0; j<S.length(); j++){
                char c = S.charAt(j);
                for(int k=0; k<R; k++){
                    bw.write(c);
                }

            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}