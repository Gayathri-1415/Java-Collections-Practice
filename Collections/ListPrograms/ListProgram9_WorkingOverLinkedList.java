import java.util.*;
public class ListProgram9_WorkingOverLinkedList {
    public static void main(String[] args)
    {
        //This program demonstrates the additional methods that are present in LinkedList
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> l=new LinkedList<>();
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        //Adding at first
        System.out.println("Enter element to add at beginning");
        int first=sc.nextInt();
        l.addFirst(first);
        //Adding at last
        System.out.println("Enter element to add at end");
        int last=sc.nextInt();
        l.addLast(last);
        //removefirst and last
        l.removeFirst();
        l.removeLast();
        //Final List
        System.out.println("Final Linked list");
        for(int i:l)
            System.out.print(i+" ");

    }
}
