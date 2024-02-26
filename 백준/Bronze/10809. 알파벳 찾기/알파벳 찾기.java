import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int size = 'z' - 'a' + 1;
        int[] storage = new int[size];
        for (int i= 0; i<size; i++){
            storage[i] = -1;
        }
        for (int i=0; i<input.length; i++){
            String ch = input[i];
            char c = ch.charAt(0);
            int loc = c - 'a';
            if (storage[loc] == -1) {
                storage[loc] = i;
            }
        }
        for(int value:storage){
            bw.write(String.valueOf(value)+" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}