class countnos_contain_4{
    public static void main(String[] args) {
        System.out.println(countNumberswith4(13));
    }
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
        for(int i=1;i<=n;i++){
            if(four(i)){
                count++;
            }
        }
        return count;

    }
    static boolean four(int i){
        while(i>0){
            int j = i % 10;
            if(j == 4){
                return true;
            }
            i = i/10;
        }
        return false;
    }
}