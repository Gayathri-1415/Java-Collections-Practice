import java.util.*;
public class ListProgram6_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        //Using List i.e ArrayList this is good but contains() takes timecomplexity of O(n^2) other technique is using sets
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int i;
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        System.out.println("Array after removing duplicates: ");
        for(int k:l)
        {
            if(!l1.contains(k))
            {
                l1.add(k);
            }
            
        }
       for(int p:l1)
        System.out.print(p+" ");

         

    }
}
