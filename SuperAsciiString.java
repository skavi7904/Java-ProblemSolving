import java.util.Scanner;

public class SuperAsciiString {
    boolean checkSuperAsciiString(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] != s.charAt(i) - 96) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str = str1.toLowerCase();
        SuperAsciiString a = new SuperAsciiString();
        if (a.checkSuperAsciiString(str)) {
            System.out.println("It is a super ascii string.");
        } else {
            System.out.println("It is not a super ascii string.");
        }
    }
}

