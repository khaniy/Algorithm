import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int[] posList = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            String value = input[i];
            byte byteCode = (byte) (value.getBytes()[0] - "A".getBytes()[0]);
            int pos = byteCode / 3;
            if (value.contains("S") || value.contains("V") || value.contains("Y") || value.contains("Z")) {
                pos = pos - 1;
            }
            posList[i] = pos;
        }
        int time = posList.length * 2;
        for (int value : posList) {
            time += value + 1;
        }
        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
        br.close();

    }
}