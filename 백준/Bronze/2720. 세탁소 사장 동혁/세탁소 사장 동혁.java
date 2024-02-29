import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++){
            int money = Integer.parseInt(br.readLine());
            String quarter = String.valueOf(money / 25);
            money = money % 25;
            String dime = String.valueOf(money / 10);
            money = money % 10;
            String nickel = String.valueOf( money / 5);
            money = money % 5;
            String penny = String.valueOf(money);
            bw.write(quarter + " " + dime + " " + nickel + " " + penny);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}