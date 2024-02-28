import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] storage = new String[5][];
        for (int i=0; i<5; i++){
            String[] split = br.readLine().split("");
            storage[i] = split;
        }
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                try{
                    bw.write(storage[i][j]);
                }catch (Exception e){
                }
            }
        }
        bw.close();
        br.close();
    }

}