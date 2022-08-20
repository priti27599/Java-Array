import java.util.*;

public class ArraysCC{

    public static void update(int marks[], int nonChangable)
    {
        nonChangable =10;
        for(int i=0; i<marks.length; i++)
        {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        // int marks[]= new int[60];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("length of array = "+ marks.length);
        // marks[0]= sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("Phy :"+ marks[0]);
        // System.out.println("Chem :"+ marks[1]);
        // System.out.println("Math :"+ marks[2]);

        // marks[2]= marks[2]+2;
        // System.out.println("Math :"+ marks[2]);
        // int percentage = (marks[0] + marks[1] + marks[2]) /3;
        // System.out.println(percentage+"%");

        int marks[] = {97, 98, 99};
        int nonChangable = 5;
        

        update(marks, nonChangable);

        for(int i=0; i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.print(nonChangable);
    }
}