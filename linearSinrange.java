public  class Main {


    public static void main(String[] args) {
        int[] arr= {18,12,-7,3,14,28};
        int target = 3;
        int start = 1, end = 4;
        int ans = linearSearch(arr, target,start,end);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target,int start , int end){
       if(arr.length==0){
           return -1;
       }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;


    }

}
