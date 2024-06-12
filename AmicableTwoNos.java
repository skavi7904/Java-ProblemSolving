import java.util.Scanner;
public class AmicableTwoNos{
    public static void main(String[] args){
        int sum1 = 0, sum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.1");
        int a = sc.nextInt();
        System.out.println("enter no.2");
        int b = sc.nextInt();
        for (int i=1; i<a;i++){
            if(a%i == 0){
                sum1 += i;
            }
        }
        for (int i=1; i<b;i++){
            if(b%i == 0){
                sum2 += i;
            }
        }
        if(sum1 == b && sum2 == a){
            System.out.println("amicable");
        }
        else{
            System.out.println("not amicable");
        }
    }
}
