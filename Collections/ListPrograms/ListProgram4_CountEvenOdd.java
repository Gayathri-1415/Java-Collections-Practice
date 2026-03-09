import java.util.*;
public class ListProgram4_CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        int even_count=0,odd_count=0;
        for(int i:l)
        {
            if(i%2==0)
                even_count++;
            else
                odd_count++;
        }
        System.out.println("Count of even elelemts: "+even_count);
        System.out.println("Count of odd elements: "+ odd_count);

    }
}
