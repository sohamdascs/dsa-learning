import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
       bubble(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapping;
        for(int i=0;i< arr.length;i++){
            swapping = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapping = true;
                }


            }
            if(!swapping)
                break;
        }

    }

}
