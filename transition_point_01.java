class transition_point_01 {
    public static void main(String[] args) {
//        int[] arr = new int[3];
        int[] arr = new int[]{0, 1, 1};
        System.out.println(transitionPoint(arr,arr.length));
    }
    static int transitionPoint(int arr[], int n) {
        if(arr[0]==1){
            return 0;
        }
        if(arr[n-1]==0){
            return -1;
        }
        int beg = 0;
        int end = n-1;
        while(beg<=end){
            int mid = beg + (end-beg)/2;
            if(arr[mid]==1 && arr[mid-1]==0){
                return mid;
            }
            else if(arr[mid]==1){
                end = mid-1;
            }
            else{
                beg = mid+1;
            }
        }
        return 0;
    }
}