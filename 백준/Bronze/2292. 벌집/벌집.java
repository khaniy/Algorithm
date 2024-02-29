import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int l = 0;
        int start = 0;
        while(true){
          int last= (int) (Math.pow(l,2) * 3 + 3*l + 1);
          if (start < N && N <= last){
              break;
          }
          l+=1;
          start = last;
        }
        bw.write(String.valueOf(l+1));
        bw.close();
        br.close();
    }
}