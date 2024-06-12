public class reversearr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3};
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int x : arr) {
            System.out.print(x);
        }
    }

    static void swap(int[] arr1, int a, int b) {
        int temp = arr1[b];
        arr1[b] = arr1[a];
        arr1[a] = temp;
    }
}


