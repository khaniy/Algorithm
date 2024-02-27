import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int check = 1;
        for (int i=0; i<input.length; i++){
            if(!input[i].equals(input[input.length-i-1])){
                check = 0;
                break;
            }
        }
        bw.write(String.valueOf(check));
        bw.flush();
        bw.close();
        br.close();

    }

}