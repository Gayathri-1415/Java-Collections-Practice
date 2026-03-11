import java.util.*;
public class ListProgram7_SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,i;
        System.out.println("Enter no of elements");
        for(i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
       for(int k:l)
       {
        if(k>max1)
        {
            max2=max1;
            max1=k;
        }
        else if(k!=max1 && k>max2)
           max2=k;
       }
        if(max2==Integer.MIN_VALUE)
            System.out.println("Second max element do not exist.");
        else
       System.out.println("Second Max element: "+max2);

       
    }
}


