import java.util.*;
public class ListProgram5_ReverseElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int i;
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        List<Integer> l1=new ArrayList<>();
        for(i=n-1;i>=0;i--)
        {
            l1.add(l.get(i));
        }
        System.out.println("Reverse of elements in List: ");
        for(int k:l1)
            System.out.print(k +" ");

    }
}
