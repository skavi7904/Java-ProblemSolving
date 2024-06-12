import java.util.HashMap;
import java.util.Map;

public class secondmostfreqstringinarr {
    public static void main(String[] args) {
        String[] arr = {"kavi","amreen","amreen","shit","shit","shit"};
        int n = arr.length;
        System.out.println(method(arr,n));
    }
    static String method(String[] arr, int n){
        HashMap<String, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++){
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        int max = 0, smax = 0;
        String s1 = "", s2 = "";
        for(Map.Entry<String, Integer> set : hmap.entrySet()){
            if(set.getValue()>max){
                smax = max;
                s2 = s1;
                s1 = set.getKey();
                max = set.getValue();
            }
            else if(set.getValue()>smax){
                smax = set.getValue();
                s2 = set.getKey();
            }
        }
        return s2;
    }
}
