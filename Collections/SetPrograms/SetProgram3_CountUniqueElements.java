import java.util.*;
class SetProgram3_CountUniqueElements
{
    public static void main(String[] args) 
    {
        //simply we can use as  Set<Integer> s=new HashSet<>(Arrays.asList(arr));
        
        Scanner sc=new Scanner(System.in);
        Set<Integer> s=new HashSet<>();
     
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }  
        for(int i:arr)
        {
            s.add(i);
        }
        System.out.println("No of unique elements: ");
        System.out.println(s.size());

    }
}