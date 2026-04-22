import java.util.*;
public class QueueProgram4_RotateQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            q.offer(sc.nextInt());
        }
        System.out.println("Enter k value: ");
        int k=sc.nextInt();
        // Queue<Integer> q1=new LinkedList<>(); // we can do the same with out using extra queue
        k=k%n;     // as rorations are cyclic even if k>n it will work
        for(int i=0;i<k;i++)
        {
            q.offer(q.poll());
        }
        // for(int i=0;i<k;i++)
        // {
        //     q.offer(q1.poll());
        // }
        for(int l:q)
            System.out.print(l+" ");

    }
}
