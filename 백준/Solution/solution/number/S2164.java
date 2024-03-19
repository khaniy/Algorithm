package solution.number;

import solution.Solution;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class S2164 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> store = new LinkedList<>();
        for(int i=1; i<=N; i++){
            store.add(i);
        }
        int loop =1;
        while(store.size()>1){
            if(loop%2 == 1)
                store.remove();
            else
                store.add(store.remove());
            loop++;
        }
        System.out.println(store.remove());
    }
}
