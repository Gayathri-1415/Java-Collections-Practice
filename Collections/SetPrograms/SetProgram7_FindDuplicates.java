import java.util.*;
public class SetProgram7_FindDuplicates {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates =new HashSet<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i:arr)
        {
            if(seen.contains(i))
                duplicates.add(i);
            else
                seen.add(i);
        }
        System.out.println(seen);
        System.out.println("Duplicates are: "+ duplicates);
        sc.close();
    }
}
