import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solver solver = new Solver(new S2738());
//        solver.solve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Person[] store = new Person[N];
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            store[i] = new Person(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        int[] ranks = calculateSizeRanks(store);
        for(int rank: ranks){
            System.out.print(rank+" ");
        }

    }
    static class Person{
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
    public static int[] calculateSizeRanks(Person[] people) {
        int[] ranks = new int[people.length];

        for (int i = 0; i < people.length; i++) {
            int countBigger = 0;
            for (int j = 0; j < people.length; j++) {
                if (people[j].weight > people[i].weight && people[j].height > people[i].height) {
                    countBigger++;
                }
            }
            ranks[i] = countBigger + 1;
        }

        return ranks;
    }
}