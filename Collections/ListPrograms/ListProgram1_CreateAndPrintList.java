import java.util.*;
public class ListProgram1_CreateAndPrintList
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            list.add(i);
        }
        // System.out.println(list);
        for(int x:list)
            System.out.print(x + " ");
    }
}