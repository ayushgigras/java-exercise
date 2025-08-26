import java.util.*;
class exercise2{
    public static void main(String args[]){
        int arr1[] = new int[5];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = i*i;
        }
        int arr2[] = {10,20,30,40,50};
        // for(int i=0; i<arr1.length;i++){
        //     System.out.println(arr1[i]);
        // }
        // for(int i=0; i<arr2.length;i++){
        //     System.out.println(arr2[i]);
        // }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
       

    }
}