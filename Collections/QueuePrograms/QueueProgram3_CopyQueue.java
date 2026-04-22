import java.util.*;
public class QueueProgram3_CopyQueue 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> original=new LinkedList<>();
        Queue<Integer> copied=new LinkedList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            original.offer(sc.nextInt());
        }
        for(int k:original)
        {
            copied.offer(k);
        }
        System.out.println("Original queue: ");
        for(int l:original)
            System.out.print(l+" ");
        System.out.println();
        System.out.println("Copied queue: ");
        for(int m:copied)
            System.out.print(m+" ");
    }
}
