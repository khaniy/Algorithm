package solution.number;

import java.io.*;
import java.util.ArrayList;

public class S9506 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> store = new ArrayList<>();
            if (n == -1) {
                break;
            }
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum+=i;
                    store.add(i);
                }
            }
            Object[] array = store.toArray();
            if(sum == n){
                sb.append(n+ " = ");
                for (int i=0; i<array.length; i++){
                    sb.append(array[i]);
                    if(i+1!= array.length){
                        sb.append(" + ");
                    }
                }
                System.out.println(sb.toString());
            }else {
                sb.append(n + " is NOT perfect.");
                System.out.println(sb.toString());
            }
        }
        br.close();
    }
}
