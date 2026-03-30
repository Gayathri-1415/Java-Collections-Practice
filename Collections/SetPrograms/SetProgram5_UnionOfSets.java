import java.util.*;
public class SetProgram5_UnionOfSets {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        System.out.println("Enter no of elements for s1: ");
        int n1=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n1;i++)
        {
            s1.add(sc.nextInt());
        }
        System.out.println("Enter no of elements for s2: ");
        int n2=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n2;i++)
        {
            s2.add(sc.nextInt());
        }
        s1.addAll(s2);
        System.out.println("Union of 2 sets: "+ s1);
       


    }
}
