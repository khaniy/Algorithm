import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] storage = new String[T];
        for (int i=0; i<T; i++){
            String[] input = br.readLine().split("");
            storage[i] = input[0] + input[input.length-1];
        }
        for (int i=0; i<T; i++){
            bw.write(storage[i]+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}