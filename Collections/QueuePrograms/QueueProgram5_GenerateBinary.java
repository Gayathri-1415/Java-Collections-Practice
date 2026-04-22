import java.util.*;
public class QueueProgram5_GenerateBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<String> q=new LinkedList<>();
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        q.offer("1");
        for(int i=0;i<n;i++)
        {
            String curr=q.poll();
            System.out.print(curr+" ");
        
            q.offer(curr+ "0");
            q.offer(curr+ "1");
        }
        
    }
}
