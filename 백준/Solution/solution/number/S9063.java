package solution.number;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S9063 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x < minX){
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }
            if(y <minY){
                minY = y;
            }
            if(y>maxY){
                maxY = y;
            }
        }
        int width = maxX - minX;
        int height = maxY - minY;
        bw.write(String.valueOf(width * height));
        bw.close();
        br.close();
    }
}
