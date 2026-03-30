import java.util.*;
public class SetProgram4_IntersectionOfSets {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        // Set<Integer> s=new HashSet<>();
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
        //we can use contains() method or direct built-in method i.e retainAll() both have timecomplexity of o(n)
        //using contains() need to create other set but in case if retainAll() no need of extra set stores in available sets
        // for(int i:s1)
        // {
        //     if(s2.contains(i))
        //         s.add(i);
        // }
        s1.retainAll(s2); //found using built-in method
        System.out.println("Intersection of 2 sets:"+ s1);

    }
}
