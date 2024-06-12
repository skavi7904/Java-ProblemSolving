import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (checkanagram(s1, s2)) {
            System.out.println("anagram");
        } else {
            System.out.println("not");
        }
    }

    static boolean checkanagram(String s1, String s2) {
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        char[] w1 = s1.toCharArray();
        char[] w2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            num1[w1[i] - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            num2[w2[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (num1[i] != num2[i]) {
                return false;
            }
        }
        return true;
    }
}
