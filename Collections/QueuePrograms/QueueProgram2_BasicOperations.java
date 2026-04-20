import java.util.*;
public class QueueProgram2_BasicOperations {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            q.offer(sc.nextInt());
        }
        System.out.println("Front element: "+q.poll());
        q.peek();
        System.out.println("Queue after removing one element: ");
        // while(!q.isEmpty())
        System.out.println(q);
        //     System.out.print(q.poll()+" ");


    }
}
