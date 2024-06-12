public class dharshu_referencedtypes {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = arr1;
        for(int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : arr2){
            System.out.print(i+" ");
        }
        arr1[0] = 100;
        System.out.println();
        for(int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : arr2){
            System.out.print(i+" ");
        }
    }
}
