import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int subjectNumber = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        double[] st = new double[subjectNumber];
        int max = 0;
        for (int i=0; i<subjectNumber; i++){
            int inputNumber = Integer.parseInt(input[i]);
            st[i] = inputNumber;
            if (max<inputNumber){max = inputNumber;}
        }
        double average = 0.0;
        for(int i=0; i<subjectNumber; i++){
            double score = (double) st[i] / max * 100;
            average += score;
        }
        bw.write(String.valueOf(average/subjectNumber));



        bw.flush();
        br.close();
        bw.close();
    }
}