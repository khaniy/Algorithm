import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int[] reverseIntList = new int[2];
        for (int i=0; i<input.length; i++){
            String[] numb = input[i].split("");
            String temp = numb[0];
            numb[0] = numb[numb.length-1];
            numb[numb.length-1] = temp;
            String join = String.join("", numb);
            reverseIntList[i] = Integer.parseInt(join);
        }

        if (reverseIntList[0] > reverseIntList[1]){
            bw.write(String.valueOf(reverseIntList[0]));
        } else {
            bw.write(String.valueOf(reverseIntList[1]));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}