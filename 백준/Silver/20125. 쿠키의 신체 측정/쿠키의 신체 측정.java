import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Cookie cookie = new Cookie();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (!cookie.hasHeart && hasStar(input)) {
                cookie.heartY = i + 1;
                cookie.heartX = input.indexOf('*');
                cookie.hasHeart = true;
                continue;
            }
            if (cookie.hasHeart && i == cookie.heartY) {
                cookie.foundArms(input);
                cookie.hasArm = true;
                continue;
            }
            if (!cookie.hasBody && cookie.hasArm) {
                if (countStar(input) == 1)
                    cookie.body++;
                else
                    cookie.hasBody = true;
            }
            if(cookie.hasBody) {
                cookie.foundLegs(input);
            }
        }
        br.close();
        System.out.println((cookie.heartY+1) + " " + (cookie.heartX+1));
        System.out.println(cookie.leftArm + " " + cookie.rightArm + " " + cookie.body + " " + cookie.leftLeg + " " + cookie.rightLeg);
    }

    public static class Cookie {
        boolean hasHeart = false;
        boolean hasBody = false;
        boolean hasArm = false;
        int heartX, heartY;
        int leftArm, rightArm;
        int body;
        int leftLeg, rightLeg;
        void foundLegs(String input){
            if (input.charAt(this.heartX - 1) == '*')
                this.leftLeg++;
            if(input.charAt(this.heartX + 1) == '*')
                this.rightLeg++;
        }
        void foundArms(String input){
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '*') {
                    if (j < this.heartX)
                        this.leftArm++;
                    else if (j > this.heartX)
                        this.rightArm++;
                }
            }
        }
    }

    private static boolean hasStar(String row) {
        return row.contains("*");
    }

    private static int countStar(String row) {
        int count = 0;
        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) == '*')
                count++;
        }
        return count;
    }
}