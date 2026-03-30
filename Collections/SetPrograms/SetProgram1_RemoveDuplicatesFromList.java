import java.util.*;
public class SetProgram1_RemoveDuplicatesFromList {
    public static void main(String[] args)
    {
        ArrayList<Integer> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        //If duplicates are found HashSet removes or print as it is
        Set<Integer> s=new HashSet<>(l);
        System.out.println("Final Set: ");
        for(int i:s)
            System.out.print(i+" ");
    }
}
