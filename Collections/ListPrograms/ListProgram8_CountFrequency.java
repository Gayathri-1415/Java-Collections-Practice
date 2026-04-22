import java.util.*;
public class ListProgram8_CountFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int i,j,c;
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        for(i=0;i<l.size();i++)
        {
            c=0;
            int element=l.get(i);
            if(!l1.contains(element))
            {
            for(j=0;j<l.size();j++) //If we start j=1 it not count itself to count itself start from j=0
            {
                if(element==l.get(j) )
                    c++;
            }
            l1.add(element);
            System.out.println(element+" occurs "+c+" time/s");
            }
        }

    }
}
