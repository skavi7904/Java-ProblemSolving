public class singleoccuranceinarr_othersoccuronly2times {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,1,2,66,66,77,8,77};
        int x = 0;
        for(int i : arr){
            x = x ^ i;
        }
        System.out.println(x);

    }

}
