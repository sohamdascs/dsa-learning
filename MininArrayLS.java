class Main{
    public static void main(String[] args) {
        int [] arr = {14,58,4,87,26,5};
        System.out.println(minLinear(arr));
    }
    static int minLinear(int[]arr){
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
