import java.util.*;

public class LinearSearch{

    public static int linearSear(int number[], int key)
    {
        for(int i=0; i<number.length; i++)
        {
            if(number[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static int printLargest(int num[]){
        int large =Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0; i< num.length;i++)
        {
            if(num[i] > large)
            {
                large = num[i];
            }
            if(num[i]< small)
            {
                small = num[i];
            }
        }
        System.out.println("Smallest Number is "+small);
        return large;
    }

   
    public static void main(String args[]){
        // int number[]= {2,4,6,8,10,12,14,16};
        // int key =20;
        
        // int index = linearSear(number,key);
        // if(index == -1)
        // {
        //     System.out.println("Not Found");
        // }else{
        //     System.out.println("Key is at index: "+index);
        // }

        int num[] ={1,2,6,3,5};
        int lg = printLargest(num);
        System.out.println("Largest Number is "+ lg);

    }
}