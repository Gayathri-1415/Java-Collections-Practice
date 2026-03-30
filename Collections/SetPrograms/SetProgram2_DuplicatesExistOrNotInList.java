import java.util.*;
public class SetProgram2_DuplicatesExistOrNotInList {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        Set<Integer> s=new HashSet<>();
        for(int i:l)
        {

            if(s.contains(i))
            {
                System.out.println("Yes");
                return;
            }
                s.add(i);
                
        }
    }
}
