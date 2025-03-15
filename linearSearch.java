public  class Main {


    public static void main(String[] args) {
        int[] arr= {23,9,87,45,104,-89,11,5};
        int target = 104;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target){
       if(arr.length==0){
           return -1;
       }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;


    }

}
