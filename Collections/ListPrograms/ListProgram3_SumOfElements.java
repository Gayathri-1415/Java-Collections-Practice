import java.util.*;
public class ListProgram3_SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int i,sum=0;
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            l.add(sc.nextInt());
            sum+=l.get(i);
        }
        System.out.println("Sum of elemets in list: "+sum);

    }
}
