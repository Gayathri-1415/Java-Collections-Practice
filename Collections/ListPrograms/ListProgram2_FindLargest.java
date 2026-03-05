import java.util.*;
public class ListProgram2_FindLargest
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        // System.out.println("Max val: "+ Collections.max(list)); we can use this in order to see our logic avoid this
        int max=list.get(0);
        for(int x:list)
        {
            if(x>max)
                max=x;
        }
        System.out.println("Max value: "+max);


    }
}