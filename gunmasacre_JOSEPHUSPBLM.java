
import java.util.*;

public class gunmasacre_JOSEPHUSPBLM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(xambo(a, 2));


    }

    static int xambo(int x, int b) {
        if (x == 1) return 1;
        int k = b;
        return (xambo(x - 1, k) + k - 1) % x + 1;
    }
}