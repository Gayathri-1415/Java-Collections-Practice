import java.util.*;
class SetProgram6_CheckCommonElement
{
    public static void main(String[] args)
    {
        //just to display yes/no as o/p if both have atleast one element in common display yes else no
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
        for(int i:s2)
        {
            if(s1.contains(i))
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
