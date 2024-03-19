package solution.number;

import solution.Solution;

import java.io.*;

public class S4659 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        while (true) {
            String input = br.readLine();
            if (input.equals("end")) {
                break;
            }
            if (isAcceptable(input)) {
                bw.write("<" + input + ">" + " is acceptable.");
            } else {
                bw.write("<" + input + ">" + " is not acceptable.");
            }
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static boolean isConsecutive(char f, char b) {
        return f == b;
    }

    private static boolean isAcceptable(String password) {
        boolean isVowelWord = false;
        int consecutiveCount = 1;
        int vowelCount = 0;
        int consonantCount = 0;
        char lastChar = ' ';
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isVowel(c)) {
                isVowelWord = true;
                vowelCount += 1;
                consonantCount = 0;
                if (isConsecutive(c, lastChar)) {
                    if (c != 'e' && c != 'o') {
                        return false;
                    }
                }
                if (vowelCount > 2) {
                    return false;
                }
            } else {
                vowelCount = 0;
                consonantCount += 1;
                if (consonantCount > 2) {
                    return false;
                }
                if (isConsecutive(c, lastChar)) {
                    return false;
                }
            }
            lastChar = c;
        }
        if (!isVowelWord) {
            return false;
        }
        return true;
    }
}
