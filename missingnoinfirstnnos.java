public class missingnoinfirstnnos {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,1,3};
        int n = arr.length+1, sum =0 ;
        for(int nums : arr){
            sum+=nums;
        }
        int tot = n*(n-1)/2;
        System.out.println(tot-sum);
    }
}
