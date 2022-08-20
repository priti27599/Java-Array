import java.util.*;

public class BinarySearch{
    public static int searchBinary(int num[], int key){
        int start =0;
        int end = num.length -1;
       

        while(start <= end)
        {
             int mid = (start + end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] > key)
            {
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        } 
        return -1;
    }
    public static void main(String args[]){
        int num[] ={2,4,6,8,10,12,14};
        int key =5;
         System.out.println("index for key is: " +searchBinary(num, key));
    }
}