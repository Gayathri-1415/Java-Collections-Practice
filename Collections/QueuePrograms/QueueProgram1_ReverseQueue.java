import java.util.*;
public class QueueProgram1_ReverseQueue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            q.offer(sc.nextInt());
        }
        while(!q.isEmpty())
        {
            s.push(q.poll());
        }
        while(!s.isEmpty())
        {
            q.offer(s.pop());
        }
        System.out.println("Queue after reversing: ");
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
        
    }
}
